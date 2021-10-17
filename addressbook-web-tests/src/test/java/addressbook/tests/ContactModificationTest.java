package addressbook.tests;
import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {


    @Test
    public void testContactModification() throws Exception {
        ContactData editContact = new ContactData("Pinst", "Jojo", "Shuvalova, 7, appartment 3", "+79533543766","editEmail@yandex.ru");

        app.getContactHelper().selectContact();
        app.getContactHelper().initEditContact();
        app.getContactHelper().editContactForm(editContact);
    }
}
