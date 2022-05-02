package Contacts;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

// ----- Allows user to search for a particular contact by either phone number or "firstname lastname" -----
public class addSearch {
    public static void searchContacts(Path newPath, List<Contact> contactList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search by name  example: \"Ray Finkle\" or phone# \"1234567890\"");
        String inputSearch = scanner.nextLine();
        ifContactFound(inputSearch, contactList, scanner, newPath);
        ExitProgramandWrite.exitProgram(newPath, contactList);
    }

    public static void ifContactFound(String inputSearch, List<Contact> contactList, Scanner scanner, Path newPath) {
        for (int i = 0; i < contactList.size(); i++) {
            String fullname = contactList.get(i).getFirstName() + " " + contactList.get(i).getLastName();
            if (inputSearch.equalsIgnoreCase(fullname) || inputSearch.equalsIgnoreCase(contactList.get(i).getPhoneNum())) {
                System.out.println(
                        "Name         Phone#" +
                                "\n-----------------------------------" +
                                "\n" +
                                contactList.get(i).getFirstName() + "" +
                                " " +
                                contactList.get(i).getLastName() + " | " +
                                FormatPhoneNumber.formatPhoneNumber(contactList.get(i).getPhoneNum()));
                System.out.println("-----------------------------------");
                break;
//               ----- if loop is on the last element -----
            } else if (i == contactList.size() - 1) {
                System.out.println("No contact found" + "\nWould you like to do another search (y/n)?");
                String confirm = scanner.next();
                if (confirm.equals("y")) {
                    searchContacts(newPath, contactList);
                } else {
                    ExitProgramandWrite.exitProgram(newPath, contactList);
                }
            }
        }
    }
}


