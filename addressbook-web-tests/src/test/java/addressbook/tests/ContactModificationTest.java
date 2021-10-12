package addressbook.tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification() throws Exception {
        app.getContactHelper().selectContact();
        app.getContactHelper().initEditContact();
        app.getContactHelper().editContactForm(By.name("email"), "editedEmail@yandex.ru");
        app.getContactHelper().editContactForm(By.name("address"), "USSR");
        app.getContactHelper().confirmChangingContactInfo();
     //   app.getNavigationHelper().returnHomePage();
    }
}
