package addressbook.tests;
import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {


    @Test
    public void testContactModification() throws Exception {
        ContactData editContact = new ContactData("Smirnoff","Ivan",
                "Russian Federation", "8121306", "bluesmirnoff@yandex.ru",
                "13", "April","1975" );

        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().newContact(new ContactData("Smirnoff", "Ivan", "USSR",
                    null, "redsmirnoFF@gmail.com"));
            app.getNavigationHelper().returnHomePage();
        }

        app.getContactHelper().selectContact();
        app.getContactHelper().initEditContact();
        app.getContactHelper().editContactForm(editContact);
        app.getNavigationHelper().returnHomePage();
    }
}
