package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    List<GroupData> initialGroupList = app.getGroupHelper().getGroupList();

    app.getGroupHelper().newGroup(new GroupData("testGroup", "header text", "comment into footer"));

    List<GroupData> currentGroupList = app.getGroupHelper().getGroupList();
    Assert.assertEquals(currentGroupList.size(), initialGroupList.size()+1);

  }

}
