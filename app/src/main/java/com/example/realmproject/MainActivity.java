package com.example.realmproject;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import io.realm.Realm;
import io.realm.RealmList;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // بررسی موجودیت دیتابیس
        DatabaseChecker.checkDatabaseExists(this);

        insertAndUpdateData();
    }

    private void insertAndUpdateData() {
        executorService.execute(() -> {
            Realm realm = Realm.getDefaultInstance();
            try {
                realm.executeTransaction(r -> {
                    PersonDetailEntity personalDetail = new PersonDetailEntity();
                    personalDetail.set_id(2L);
                    personalDetail.setFirstname("Jhon");
                    personalDetail.setLastname("Thomas");

                    AddressEntity address = new AddressEntity();
                    address.set_id(2);
                    address.setStreetName("first street");
                    address.setCity("Waterloo");
                    address.setState("Ontario");
                    address.setPincode("N2R 2Z9");

                    personalDetail.setAddress(address);
                    personalDetail.setCustomerAddressList(new RealmList<>());

                    r.insertOrUpdate(personalDetail);
                });

                // Update operation
                realm.executeTransaction(r -> {
                    PersonDetailEntity data = r.where(PersonDetailEntity.class)
                            .equalTo("_id", 2L)
                            .findFirst();
                    if (data != null) {
                        data.setFirstname("Leo");
                    }
                });
            } finally {
                realm.close(); // Always close the Realm instance
            }
        });
    }
}
