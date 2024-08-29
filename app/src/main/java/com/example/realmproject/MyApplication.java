package com.example.realmproject;

import android.app.Application;
import dagger.hilt.android.HiltAndroidApp;
import io.realm.Realm;
import io.realm.RealmConfiguration;

@HiltAndroidApp
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initiateRealm();
    }

    private void initiateRealm() {
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .name("Myrealm.realm")
                .allowWritesOnUiThread(true) // Set to true for simplicity in testing
                .allowQueriesOnUiThread(true) // Set to true for simplicity in testing
                .schemaVersion(2)
                .migration(new WholeRealmMigration())
                .build();
        Realm.setDefaultConfiguration(config);
    }
}