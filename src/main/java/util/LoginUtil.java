package util;

/**
 *
 */
public class LoginUtil {

    // Spits out a new, random email for registration tests
    public String generateEmail() {
        long milliseconds = System.currentTimeMillis() % 1000;
        String email = "qa+" + String.valueOf(milliseconds) + "@happyfuncorp.com";
        return email;
    }

}
