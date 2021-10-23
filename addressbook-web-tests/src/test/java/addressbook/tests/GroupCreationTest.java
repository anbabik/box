package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().newGroup(new GroupData("testGroup", "header text", "comment into footer"));
    app.getSessionHelper().logout();
  }

}
