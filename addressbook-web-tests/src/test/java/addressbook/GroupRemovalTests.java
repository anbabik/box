package addressbook;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase {

  @Test
  public void testGroupRemoval() throws Exception {
    goToGroupPage();
    selectGroup();
    removalSelectedGroup();
    returnToGroupPage();
  }


}
