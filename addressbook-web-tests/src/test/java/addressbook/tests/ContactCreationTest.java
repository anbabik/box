package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    List<ContactData> initUsersList = app.getContactHelper().getUsersList();

    app.getContactHelper().newContact(new ContactData("Agata", "Sesile", "Mendeleeva av., 82",
            "+73457625283", "agata@mail.ru"));

    app.getContactHelper().newContact(new ContactData("Frank", "Smith", "Kelly street",
            "8812345678", "frank2000@yandex.ru", "12", "May", "2012"));

    app.getContactHelper().newContact(new ContactData("Leo", "Smuzi", "USSR",
            "112", "smuzySuper@gmail.com", "14", null, "2012"));

    app.getNavigationHelper().returnHomePage();
   List<ContactData> currentUsersList = app.getContactHelper().getUsersList();

    for(ContactData user : currentUsersList) {
      System.out.println(user.getFirstName() + " " +user.getLastName());
    }

    Assert.assertEquals(currentUsersList.size(), initUsersList.size()+3);







  }
}
