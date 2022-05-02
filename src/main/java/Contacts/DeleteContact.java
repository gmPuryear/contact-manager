package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//----- Deletes a contact in the list by either phone number or full name -----
public class DeleteContact {
    public static void deleteContact(Path newPath, List<Contact> contactList) {
        System.out.println("4. Delete contacts by name and/or phone number. ");
        System.out.print(" Name or Number: ");
        Scanner myScanner = new Scanner(System.in);
        String searchedNameOrphNum = myScanner.nextLine();
        List<Contact> toRemove = new ArrayList<>();
        for (Contact currentContact : contactList) {
            String fullName = currentContact.getFirstName() + " " + currentContact.getLastName();
            if (searchedNameOrphNum.equalsIgnoreCase(fullName) || searchedNameOrphNum.equalsIgnoreCase(currentContact.getPhoneNum())) {
                toRemove.add(currentContact);
                System.out.println(currentContact.getFirstName() + " " + currentContact.getLastName() + " was removed.");
            }
        }
        contactList.removeAll(toRemove);

        System.out.println("Would you like to see the updated contact list (y/n)?");
        String seeUpdatedList = myScanner.nextLine();
        if (seeUpdatedList.equalsIgnoreCase("y")) {
            for (Contact contact : contactList) {
                System.out.println(
                        contact.getFirstName() + "" +
                                " " +
                                contact.getLastName() + " | " +
                                FormatPhoneNumber.formatPhoneNumber(contact.getPhoneNum()));
            }
        } else {
            ExitProgramandWrite.exitProgram(newPath, contactList);
        }
        ExitProgramandWrite.exitProgram(newPath, contactList);
    }

}
