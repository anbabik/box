package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactRemovalTest extends TestBase{

    @Test
    public void testContactRemoval() throws Exception {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().newContact(new ContactData("Smirnoff", "Ivan", "USSR",
                    "112", "redsmirnoFF@gmail.com"));
            app.getNavigationHelper().returnHomePage();
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().removeContact();

    }

}
