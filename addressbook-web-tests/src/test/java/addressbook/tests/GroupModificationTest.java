package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() throws Exception {
        app.getNavigationHelper().goToGroupPage();

        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().newGroup(new GroupData("newGroup", null, null));
        }
        List<GroupData> initialGroupList = app.getGroupHelper().getGroupList();

        app.getGroupHelper().selectGroup(initialGroupList.size()-1);
        app.getGroupHelper().editGroup();
        app.getGroupHelper().fillGroupForm( new GroupData("testFinal", "header text, lolkek cheburek", "comment into footer, lalalala added new comment"));
        app.getGroupHelper().initGroupUpdate();
        app.getGroupHelper().returnToGroupPage();

        List<GroupData> currentGroupList = app.getGroupHelper().getGroupList();
        Assert.assertEquals(currentGroupList.size(), initialGroupList.size());
    }
}
