package addressbook.model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String userAddress;
    private final String userHomePhone;
    private final String userEmail;

    public ContactData(String firstName, String lastName, String userAddress, String userHomePhone, String userEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAddress = userAddress;
        this.userHomePhone = userHomePhone;
        this.userEmail = userEmail;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserHomePhone() {
        return userHomePhone;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
