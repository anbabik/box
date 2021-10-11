package addressbook.appmanager;

import addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        fillBirthday(By.name("bday"), "10", By.name("bmonth"), "December", By.name("byear"), "1993");
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    //Дополнительно попробовала вводить дату рождения пользователя
    public void fillBirthday(By bday, String day, By bmonth, String month, By byear, String year) {
        select(bday, day);
        select(bmonth, month);
        type(byear, year);
    }

    public void initNewContactCreation() {
        click(By.linkText("add new"));
    }
}
