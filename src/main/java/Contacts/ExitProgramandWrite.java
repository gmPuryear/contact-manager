package Contacts;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

//----- Writes to file (data/contactsinfo.json) and exits the program when user decides to end -----
//    if user decides not to end program, then they will be taken back to the main menu.
public class ExitProgramandWrite {
    public static void exitProgram (Path newPath, List<Contact> contactList) {
        System.out.println("Would you like to do anything else (y/n)?");
        Scanner scanner = new Scanner(System.in);
        String continueProgram = scanner.nextLine();
        if (continueProgram.equalsIgnoreCase("y")) {
            FileHelper.tryWriteFile(newPath, contactList);
            ChoiceOptions.selectOptions();
        } else {
            FileHelper.tryWriteFile(newPath, contactList);
            System.out.println("Have a good day!");
            System.exit(0);
        }
    }

}
