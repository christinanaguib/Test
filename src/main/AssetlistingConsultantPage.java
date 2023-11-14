import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssetlistingConsultantPage extends PageBase {

    public AssetlistingConsultantPage(WebDriver driver) {
        super(driver);
    }

    public By initNumber = By.cssSelector("input[id$='PONumber']");
    public By submitbtn = By.xpath("//*[@id=\"b4-Form1\"]/div/div[7]/button[1]");
    public By resultField = By.cssSelector("td[data-header^='Initial'] span[class='white-space-nowrap']");
    public By openicon = By.cssSelector("i.icon.fa.fa-eye.fa-1x");


    public void openassetdetails(String InitialDecisionNumber) {
        WaitFor(initNumber);
        driver.findElement(initNumber).sendKeys(InitialDecisionNumber);
        specialButtonClick(submitbtn);
        WaitFor(resultField);
        specialButtonClick(openicon);

    }


}
