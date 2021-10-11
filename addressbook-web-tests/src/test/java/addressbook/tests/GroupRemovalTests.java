package addressbook.tests;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase {

  @Test
  public void testGroupRemoval() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().removalSelectedGroup();
    app.getNavigationHelper().returnToGroupPage();
  }


}
