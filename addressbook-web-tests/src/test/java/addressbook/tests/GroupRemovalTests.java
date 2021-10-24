package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupRemovalTests extends TestBase {

  @Test
  public void testGroupRemoval() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().newGroup(new GroupData("newGroup", "eee", "ooo"));
    }
    List<GroupData> initialGroupList = app.getGroupHelper().getGroupList();

    app.getGroupHelper().selectGroup(initialGroupList.size()-1);
    app.getGroupHelper().removalSelectedGroup();
    app.getGroupHelper().returnToGroupPage();

    List<GroupData> currentGroupList = app.getGroupHelper().getGroupList();
    Assert.assertEquals(currentGroupList.size(), initialGroupList.size()-1);
  }


}
