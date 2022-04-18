
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleCalcPage {
    public WebDriver wd;

    public GoogleCalcPage(WebDriver wd) {
        PageFactory.initElements(wd, this);
        this.wd = wd;
    }


    @FindBy(id="cwos")
    private WebElement outputBox;

    @FindBy(xpath = "//div[@jsname='VkJw6']")
    private WebElement memoString;

    //Цифры 0-3, остальные ищутся аналогично по jsname
    @FindBy(xpath = "//div[@jsname='bkEvMb']")
    private WebElement digitZero;

    @FindBy(xpath = "//div[@jsname='N10B9']")
    private WebElement digitOne;

    @FindBy(xpath = "//div[@jsname='lVjWed']")
    private WebElement digitTwo;

    @FindBy(xpath = "//div[@jsname='KN1kY']")
    private WebElement digitThree;

    // Кнопки действий над числами
    @FindBy(xpath = "//div[@jsname='Pt8tGc']")
    private WebElement equalitySymbol;

    @FindBy(xpath = "//div[@jsname='XSr6wc']")
    private WebElement plusSymbol;

    @FindBy(xpath = "//div[@jsname='pPHzQc']")
    private WebElement minusSymbol;

    @FindBy(xpath = "//div[@jsname='YovRWb']")
    private WebElement multiplySymbol;


    public void pushTheButton(WebElement element) {
            element.click();
    }


    public void pushZero() {
        digitZero.click();
    }

    public void pushOne() {
        digitOne.click();
    }

    public void pushTwo() {
        digitTwo.click();
    }

    public void pushThree() {
        digitThree.click();
    }

    public void pushMultiply() {
        multiplySymbol.click();
    }

    public void pushPlus() {
        plusSymbol.click();
    }

    public void pushMinus() {
        minusSymbol.click();
    }

    public void pushEquality() {
        equalitySymbol.click();
    }

    public String readMemoString () {
        String result = memoString.getText();
        return result;
    }

    public String readOutputBox () {
        String result = outputBox.getText();
        return result;
    }

/* Не успела реализовать
public void inputQuery(String query) {
    char[] symbols = query.toCharArray();
    for(int s = 0; s < symbols.length; s++) {
        switch (s) {
            case '0':
                digitZero.click();
                break;
            case '1':
                digitOne.click();
                break;
            case '2':
                digitTwo.click();
                break;
            case '3':
                digitThree.click();
                break;
            case '*':
                multiplySymbol.click();
                break;
            case '+':
                plusSymbol.click();
                break;
            case '-':
                minusSymbol.click();
                break;
            case '=':
                equalitySymbol.click();
                break;
        }
    }
 */

}

