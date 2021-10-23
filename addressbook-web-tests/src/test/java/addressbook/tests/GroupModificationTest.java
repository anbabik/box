package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() throws Exception {
        app.getNavigationHelper().goToGroupPage();
       if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().newGroup(new GroupData("newGroup", "eee", "ooo"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().editGroup();
        app.getGroupHelper().fillGroupForm( new GroupData("testFinal", "header text, lolkek cheburek", "comment into footer, lalalala added new comment"));
        app.getGroupHelper().initGroupUpdate();
        app.getGroupHelper().returnToGroupPage();
    }
}
