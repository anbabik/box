package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase {

  @Test
  public void testGroupRemoval() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().newGroup(new GroupData("newGroup", "eee", "ooo"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().removalSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }


}
