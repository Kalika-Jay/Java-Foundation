package Polymorphism.Contact;

public class PhoneNumber {
    private String countryCode;
    private String phoneNumber;

    public PhoneNumber(String countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }
    public PhoneNumber(String phoneNumber) {
        if(phoneNumber.length()>10){
            this.countryCode = phoneNumber.substring(0, phoneNumber.length() - 10);
            this.phoneNumber = phoneNumber.substring(phoneNumber.length() - 10);
        } else {
            this.countryCode = "1";
            this.phoneNumber = phoneNumber;
        }
    }
}
