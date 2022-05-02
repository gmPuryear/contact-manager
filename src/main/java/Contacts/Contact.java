package Contacts;

public class Contact {
    // fields
    private String lastName;

    private String firstName;

    private String phoneNum;

    // constructor
    public Contact(String lastName, String firstName, String phoneNum) {
        this.lastName = lastName;

        this.firstName = firstName;

        this.phoneNum = phoneNum;
    }

    // getters and setters


    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}
