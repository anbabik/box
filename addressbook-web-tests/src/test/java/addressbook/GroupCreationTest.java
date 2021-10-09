package addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test3", "header text", "comment into footer"));
    submitGroupCreation();
    returnToGroupPage();
    logout();
  }

}
