package com.github.pocmo.sensordashboard;

/**
 * Created by Sri Divya on 4/21/2016.
 */
public class UserDetails {

    String firstName;
    String lastName;
    String mobileNum;
    String email;
    String address1;
    String address2;
    String city;
    String state;
    String country;
    String postalcode;
    String password;
    String repPassword;

    public UserDetails(String firstName,
                       String lastName,
                       String mobileNum,
                       String email,
                       String address1,
                       String address2,
                       String city,
                       String state,
                       String country,
                       String postalcode,
                       String password,
                       String repPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNum = mobileNum;
        this.email = email;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalcode = postalcode;
        this.password = password;
        this.repPassword = repPassword;
    }

}