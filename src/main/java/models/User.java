package models;

import util.LoginUtil;

/**
 * Created by leahgarber on 10/20/16.
 */
public class User {
    public String name;
    public String company;
    public String street_address;
    public String phone_number;
    public String city;
    public String country;
    public String email;
    public String email_confirmation;
    public String password;
    public String password_confirmation;

    public User(String name, String company, String street_address, String phone_number, String city, String country,
                String email, String password) {
        this.name = name;
        this.company = company;
        this.street_address = street_address;
        this.phone_number = phone_number;
        this.city = city;
        this.country = country;
        this.email = email;
        this.email_confirmation = email;
        this.password = password;
        this.password_confirmation = password;
    }


}
