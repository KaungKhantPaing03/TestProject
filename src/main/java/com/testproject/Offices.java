package com.testproject;

public class Offices {
    private String officecode;
    private String city;
    private String phone;
    private String addressline1;
    private String addressline2;
    private String state;
    private String country;
    private String postalcode;
    private String territory;

    public Offices(String officecode, String territory, String postalcode, String country,
                   String state, String addressline2, String addressline1, String phone, String city) {
        this.officecode = officecode;
        this.territory = territory;
        this.postalcode = postalcode;
        this.country = country;
        this.state = state;
        this.addressline2 = addressline2;
        this.addressline1 = addressline1;
        this.phone = phone;
        this.city = city;
    }

    public String getOfficecode() {
        return officecode;
    }

    public String getTerritory() {
        return territory;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }
}
