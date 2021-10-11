package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initNewContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Pinst", "Jojo", "Shuvalova, 7, appartment 3", "+79533543766", "jojo2000@gmail.com"));
    app.getNavigationHelper().returnHomePage();
  }

}
