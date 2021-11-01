package addressbook.appmanager;

import addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstName());
        type(By.name("lastname"),contactData.getLastName());
        type(By.name("address"), contactData.getUserAddress());
        type(By.name("home"), contactData.getUserHomePhone());
        type(By.name("email"), contactData.getUserEmail());
        if ((contactData.getUserBday()!=null)
                &&(contactData.getUserBmonth()!=null)
                    &&(contactData.getUserByear()!=null)) {
                        fillBirthday(contactData);
        }
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void editContactForm(ContactData contactData) {
      type(By.name("firstname"),contactData.getFirstName());
      type(By.name("lastname"),contactData.getLastName());
      type(By.name("address"), contactData.getUserAddress());
      type(By.name("home"), contactData.getUserHomePhone());
      type(By.name("email"), contactData.getUserEmail());
      click(By.xpath("//div[@id='content']/form/input[22]"));

    }

    public void initEditContact() {
        click(By.xpath("//*[@id='maintable']/tbody/tr[2]/td[8]/a"));
    }

    //Дополнительно попробовала вводить дату рождения пользователя
    public void fillBirthday(ContactData contactData) {
        select(By.name("bday"), contactData.getUserBday());
        select(By.name("bmonth"), contactData.getUserBmonth());
        type(By.name("byear"), contactData.getUserByear());
    }

    public void initNewContactCreation() {
        click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void selectContactById(int id) {
        wd.findElements(By.name("selected[]")).get(id).click();
    }

    public void removeContact() {
        click(By.xpath("//input[@value='Delete']"));
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));

    }

    public void newContact(ContactData contact) {
        initNewContactCreation();
        fillContactForm(contact);
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getUsersList() {
    List<ContactData> users = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.name("entry"));
    List<WebElement> cells = new ArrayList<WebElement>();

    for(WebElement element : elements) {
        cells = element.findElements(By.tagName("td"));
        String firstName = cells.get(2).getText();
        String lastName = cells.get(1).getText();
        String userAddress = cells.get(3).getText();
        users.add(new ContactData(firstName, lastName, userAddress, null, null));
    }
        return users;
    }

}
