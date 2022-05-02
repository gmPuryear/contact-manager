package Contacts;

//----- Formats a phone number in the form (***) ***-**** -----
public class FormatPhoneNumber {
    public static String formatPhoneNumber(String phoneNum) {
        String input = "1234567890";

        phoneNum = phoneNum.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        return phoneNum;
    }
}
