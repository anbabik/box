package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().newContact(new ContactData("Sesile" , "Agata", "Mendeleeva av., 82",
            "+73457625283", "agata@mail.ru"));

    app.getContactHelper().newContact(new ContactData("Smith", "Frank", "Kelly street",
            "8812345678", "frank2000@yandex.ru", "12", "May", "2012"));

    app.getContactHelper().newContact(new ContactData("Smuzy", "Leo", "USSR",
            "112", "smuzySuper@gmail.com", "14", null, "2012"));
    app.getNavigationHelper().returnHomePage();
  }

}
