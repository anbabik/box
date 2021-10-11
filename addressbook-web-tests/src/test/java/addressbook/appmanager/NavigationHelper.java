package addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }

    public void returnHomePage() {
        click(By.linkText("home page"));
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

}
