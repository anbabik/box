package addressbook.model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String userAddress;
    private final String userHomePhone;
    private final String userEmail;
    private final String bDay;
    private final String bMonth;
    private final String bYear;


    public ContactData(String firstName, String lastName, String userAddress, String userHomePhone, String userEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAddress = userAddress;
        this.userHomePhone = userHomePhone;
        this.userEmail = userEmail;
        bDay = null;
        bMonth = null;
        bYear = null;
    }

    public ContactData(String firstName, String lastName, String userAddress, String userHomePhone, String userEmail,
                       String bDay, String bMonth, String bYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAddress = userAddress;
        this.userHomePhone = userHomePhone;
        this.userEmail = userEmail;
        this.bDay = bDay;
        this.bMonth = bMonth;
        this.bYear = bYear;
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

    public String getUserBday() { return bDay;}

    public String getUserBmonth() { return bMonth;}

    public String getUserByear() { return bYear;}

}
