package Polymorphism.Contact;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Alice", new PhoneNumber("1234567890"), "dadasdad");
        Contact contact2 = new Contact("Bob", new PhoneNumber("1", "234567890"), "dasd");

        System.out.println(contact1);
        System.out.println(contact2);
    }
}
