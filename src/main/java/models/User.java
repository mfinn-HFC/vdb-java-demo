package models;

/**
 * Created by leahgarber on 10/20/16.
 */
public class User {

    private String name;
    private String company;
    private String streetAddress;
    private String phoneNumber;
    private String city;
    private String country;
    private String email;
    private String emailConfirmation;
    private String password;
    private String passwordConfirmation;

    public User(String name, String company, String street_address, String phone_number, String city, String country,
                String email, String password) {
        this.name = name;
        this.company = company;
        this.streetAddress = street_address;
        this.phoneNumber = phone_number;
        this.city = city;
        this.country = country;
        this.email = email;
        this.emailConfirmation = email;
        this.password = password;
        this.passwordConfirmation = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailConfirmation() {
        return emailConfirmation;
    }

    public void setEmailConfirmation(String emailConfirmation) {
        this.emailConfirmation = emailConfirmation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }
}
