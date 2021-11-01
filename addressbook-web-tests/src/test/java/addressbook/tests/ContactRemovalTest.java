package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactRemovalTest extends TestBase{

    @Test
    public void testContactRemoval() throws Exception {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().newContact(new ContactData("Smirnoff", "Ivan", "USSR",
                    "112", "redsmirnoFF@gmail.com"));
            app.getNavigationHelper().returnHomePage();
        }
        List<ContactData> initUsersList = app.getContactHelper().getUsersList();
        app.getContactHelper().selectContact();
        app.getContactHelper().removeContact();
        List<ContactData> currentUsersList = app.getContactHelper().getUsersList();

        Assert.assertEquals(currentUsersList.size(), initUsersList.size()-1);

    }

}
