package com.example.realmproject;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class PersonDetailEntity extends RealmObject {
    @PrimaryKey
    private Long _id;
    private String firstname;
    private String lastname;
    private String email;
    private AddressEntity address;
    private RealmList<AddressEntity> customerAddressList;

    // Getters and setters
    public Long get_id() { return _id; }
    public void set_id(Long _id) { this._id = _id; }
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public AddressEntity getAddress() { return address; }
    public void setAddress(AddressEntity address) { this.address = address; }
    public RealmList<AddressEntity> getCustomerAddressList() { return customerAddressList; }
    public void setCustomerAddressList(RealmList<AddressEntity> customerAddressList) { this.customerAddressList = customerAddressList; }
}

