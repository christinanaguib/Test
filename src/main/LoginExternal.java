import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginExternal extends PageBase {

    public LoginExternal(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(css = "input[id$='UsernameVal']")
    WebElement usernameTxt;

    @FindBy(css = "#Input_PasswordVal")
    WebElement passwordTxt;

    @FindBy(css = "button[class*='btn-large']")
    WebElement LoginBtn;

    public void Login(String UserName, String Password) {
//        this function is missing the step of clicking the login button
//        due to the fact that the login button is not clickable by normal selenium click
        WaitFor(usernameTxt);
        usernameTxt.sendKeys(UserName);
        passwordTxt.sendKeys(Password);
        specialButtonClick(LoginBtn);

    }
}
