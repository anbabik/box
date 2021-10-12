package addressbook.tests;

import org.testng.annotations.Test;

public class ContactRemovalTest extends TestBase{

    @Test
    public void testContactRemoval() throws Exception {

        app.getContactHelper().selectContact();
        app.getContactHelper().removeContact();

    }

}
