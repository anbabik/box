package addressbook.tests;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase {

  @Test
  public void testGroupRemoval() throws Exception {
    app.goToGroupPage();
    app.selectGroup();
    app.removalSelectedGroup();
    app.returnToGroupPage();
  }


}
