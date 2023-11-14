import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportListsPage extends PageBase {

    public By deednumber = By.id("b4-b1-Input_DeedId");//
    public By searchbutton = By.id("b4-b1-SearchBTN");
    public By card = By.cssSelector("html > body > div > div > div > div > div > div > div > div > div:nth-of-type(3) > div:nth-of-type(2) > div > div:nth-of-type(3) > div > div > div > div:nth-of-type(2) > div > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(1)");
    public By card1 = By.cssSelector("div[class$='position-relative']");

    @FindBy(css = "i[id='b2-b3-Icon3']")
    public WebElement iIcon;

    @FindBy(xpath = "//div[@id='b3-b1-Menu']//span[contains(text(),'Requests')]")
    public WebElement RequestsListDropDown;

    @FindBy(css = "a[tabindex='0']")
    public WebElement linkRequests;

    

    public ReportListsPage(WebDriver driver) {
        super(driver);
    }


    public String getpagetitle() {
        return driver.getTitle();

    }

    public void searchbytaskid(String taskid) {
        driver.findElement(deednumber).sendKeys(taskid);//INH305776
    }


    public void submitsearchbutton(By by) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }

    public ReportdetailsPage clickattask(By by) {
        driver.findElement((card)).click();
        ;
        return new ReportdetailsPage(driver);
    }

    public ReportdetailsPage opentaskdetails(By by) {
        driver.findElement(card).click();
        return new ReportdetailsPage(driver);
    }

    public void openassetdetails(String deedid) {
        driver.findElement(deednumber).sendKeys(deedid);
        submitsearchbutton(searchbutton);
        WaitFor(card1);
        driver.findElement(card1).click();
    }
    public void Logout(){
        WaitFor(iIcon);
        specialButtonClick(iIcon);
    }
    public void openRequestsList(){
        WaitFor(RequestsListDropDown);
        specialButtonClick(RequestsListDropDown);
        WaitFor(linkRequests);
        specialButtonClick(linkRequests);
    }
}

