package Contacts;
import java.util.List;

//----- Prints out entire contact list -----
public class PrintContactList {
    public static void printContactList(List<Contact> contactList) {
        System.out.println("Name         Phone#");
        System.out.println("-----------------------------------");
        for (Contact contact : contactList) {
            System.out.println(
                    contact.getFirstName() + "" +
                            " " +
                            contact.getLastName() + " | " +
                            FormatPhoneNumber.formatPhoneNumber(contact.getPhoneNum()));
        }
        System.out.println("-----------------------------------");
    }
}
