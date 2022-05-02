package Contacts;

import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class AddContact {
    public static void AddContact(Path newPath, List<Contact> contactList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a first name: ");
        String firstName = scanner.next();
        System.out.println("Please enter a last name: ");
        String lastName = scanner.next();
        System.out.println("Please enter a phone number: ");
        String phoneNum = scanner.next();
        while (phoneNum.length() != 10) {
            System.out.println("Phone number must be 10 digits long");
            phoneNum = scanner.next();
        }
        Contact contact = new Contact(lastName, firstName, phoneNum);
        contactList.add(contact);

        int lastContact = contactList.size() - 1;

        System.out.println("The person you added is: ");
        System.out.println("Name         Phone#");
        System.out.println("-----------------------------------");
        System.out.println(
                contactList.get(lastContact).getFirstName() + "" +
                        " " +
                        contactList.get(lastContact).getLastName() + " | " +
                        FormatPhoneNumber.formatPhoneNumber(contactList.get(lastContact).getPhoneNum()));
        System.out.println("-----------------------------------");
        ExitProgramandWrite.exitProgram(newPath, contactList);
    }
}
