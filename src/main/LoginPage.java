import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    public By usenamefield = By.id("Input_UsernameVal");//tomsmith
    public By Passwordfield = By.id("Input_PasswordVal"); //SuperSecretPassword!
    public By loginbttn = By.cssSelector("#b2-Button > button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
   /* @FindBy(css = "#b2-Button > button")
   public WebElement loginbttn;*/


    public ReportListsPage login( String name, String password) {
        driver.navigate().to("https://es-qa.infath.sa/Eservices_Internal/Login?CurrentLocale=en-US");
        WaitFor(usenamefield);
        driver.findElement(usenamefield).sendKeys(name);
        driver.findElement(Passwordfield).sendKeys(password);
        specialButtonClick(loginbttn);
        return new ReportListsPage(driver);
    }
}
