package addressbook.tests;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {


    @Test
    public void testContactModification() throws Exception {
        app.getContactHelper().selectContact();
        app.getContactHelper().initEditContact();
        app.getContactHelper().editContactForm("email", "editedEmail@yandex.ru");
        app.getContactHelper().editContactForm("address", "USSR");
        app.getContactHelper().confirmChangingContactInfo();
     //   app.getNavigationHelper().returnHomePage();
    }
}
