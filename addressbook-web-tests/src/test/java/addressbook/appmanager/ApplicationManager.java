package addressbook.appmanager;

import addressbook.model.ContactData;
import addressbook.model.GroupData;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {


    private WebDriver wd;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public void init() {
        wd = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    public void login(String username, String password) {
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void returnToGroupPage() {
      wd.findElement(By.linkText("group page")).click();
    }

    public void returnHomePage() {
      wd.findElement(By.linkText("home page")).click();
    }

    public void fillContactForm(ContactData contactData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("address")).clear();
      wd.findElement(By.name("address")).sendKeys(contactData.getUserAddress());
      wd.findElement(By.name("home")).click();
      wd.findElement(By.name("home")).clear();
      wd.findElement(By.name("home")).sendKeys(contactData.getUserHomePhone());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(contactData.getUserEmail());
      fillBirthday();
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void fillBirthday() {
      wd.findElement(By.name("bday")).click();
      new Select(wd.findElement(By.name("bday"))).selectByVisibleText("10");
      wd.findElement(By.name("bmonth")).click();
      new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText("December");
      wd.findElement(By.name("byear")).click();
      wd.findElement(By.name("byear")).click();
      wd.findElement(By.name("byear")).clear();
      wd.findElement(By.name("byear")).sendKeys("1993");
    }

    public void initNewContactCreation() {
      wd.findElement(By.linkText("add new")).click();
    }

    public void logout() {
      wd.findElement(By.linkText("Logout")).click();
    }

    public void submitGroupCreation() {
      wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void goToGroupPage() {
      wd.findElement(By.linkText("groups")).click();
    }

    public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
    }

    public void stop() {
        wd.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
          fail(verificationErrorString);
        }
    }

    public boolean isElementPresent(By by) {
      try {
        wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    public boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public String closeAlertAndGetItsText() {
      try {
        Alert alert = wd.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
          alert.accept();
        } else {
          alert.dismiss();
        }
        return alertText;
      } finally {
        acceptNextAlert = true;
      }
    }

    public void removalSelectedGroup() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();
    }

    public void selectGroup() {
      wd.findElement(By.xpath("//div[@id='content']/form/span[2]/input")).click();
    }
}
