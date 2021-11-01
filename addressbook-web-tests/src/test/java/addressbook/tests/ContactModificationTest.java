package addressbook.tests;
import addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactModificationTest extends TestBase {


    @Test
    public void testContactModification() throws Exception {
        ContactData editContact = new ContactData("Эдик","Переделкин",
                "Russian Federation", null, null);



        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().newContact(new ContactData("Юра", "Первак", "USSR",
                    null, "redsmirnoFF@gmail.com"));
            app.getNavigationHelper().returnHomePage();
        }

        List<ContactData> initUsersList = app.getContactHelper().getUsersList();

        app.getContactHelper().selectContactById(initUsersList.size()-1);
        app.getContactHelper().initEditContact();

        app.getContactHelper().editContactForm(editContact);
        app.getNavigationHelper().returnHomePage();
        List<ContactData> currentUsersList = app.getContactHelper().getUsersList();

        for(ContactData user : currentUsersList) {
            System.out.println(user.getFirstName() + " " +user.getLastName() + " " + user.getUserAddress());
        }

        Assert.assertEquals(currentUsersList.size(), initUsersList.size());
    }
}
