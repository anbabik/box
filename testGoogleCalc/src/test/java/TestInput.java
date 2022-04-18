import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;


public class TestInput {
    public WebDriver wd;
    public GoogleStartPage googlePage;
    public GoogleCalcPage calcPage;

    @BeforeTest
    public void startSession() {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        googlePage = new GoogleStartPage(wd);
        calcPage = new GoogleCalcPage(wd);
    }

    @Test
    public void firstCase() {

        googlePage.searchInGoogle("Calculator");
        calcPage.pushOne();
        calcPage.pushMultiply();
        calcPage.pushTwo();
        calcPage.pushMinus();
        calcPage.pushThree();
        calcPage.pushPlus();
        calcPage.pushOne();
        calcPage.pushEquality();
        Assertions.assertEquals(calcPage.readMemoString(), "1 \u00D7 2 - 3 + 1 =");
        Assertions.assertEquals(calcPage.readOutputBox(), "0");
        calcPage.wd.quit();

    }

}
