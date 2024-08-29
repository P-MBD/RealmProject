package com.example.realmproject;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class AddressEntity extends RealmObject {
    @PrimaryKey
    private long _id;
    private String streetName;
    private String city;
    private String state;
    private String pincode;

    // Getters and setters
    public long get_id() { return _id; }
    public void set_id(long _id) { this._id = _id; }
    public String getStreetName() { return streetName; }
    public void setStreetName(String streetName) { this.streetName = streetName; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }
}
