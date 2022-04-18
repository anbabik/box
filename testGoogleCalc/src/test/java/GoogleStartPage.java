import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleStartPage {
    public WebDriver wd;

    public GoogleStartPage(WebDriver wd) {
        PageFactory.initElements(wd, this);
        this.wd = wd;
        wd.get("https://google.com");
    }

    @FindBy(name="q")
    private WebElement searchBox;

    @FindBy(name="btnK")
    private WebElement searchButton;

    protected void type(WebElement element, String text) {
        element.click();
        if (text!=null) {
            element.clear();
            element.sendKeys(text);
        }
    }

    // Проверить google.com
    public void isOpenGoogle(WebDriver wd) {
        Assertions.assertEquals("Google", wd.getTitle());
    }

    // Ввести запрос в поисковую строку
    public void searchInGoogle(String request) {
        type(searchBox, request);
       searchButton.click();
    }
}
