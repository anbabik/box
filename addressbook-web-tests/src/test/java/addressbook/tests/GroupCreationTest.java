package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test3", "header text", "comment into footer"));
    app.submitGroupCreation();
    app.returnToGroupPage();
    app.logout();
  }

}
