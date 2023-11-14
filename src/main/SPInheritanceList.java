import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SPInheritanceList extends PageBase {
    public SPInheritanceList(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[id$='PONumber']")
//            this filed is misnamed in site
    WebElement initialDecisionNumberTxt;

    //    search button
    @FindBy(css = "button[class*='btn-primary']")
    WebElement searchBtn;


    @FindBys({
            @FindBy(css = "div[class$='pending'] span"),

    })
    public List<WebElement> StatusList;


    @FindBy(xpath = "//i[contains(@class, 'fa-eye')]")
    public WebElement viewBtn;


    @FindBy(css = "td[data-header$='Assets'] span")
    public WebElement NumberOfAssetsTxt;

    @FindBy(css = "td[data-header^='Initial']")
    public WebElement spanWhiteSpace;


    //    this function is to choose the correct inheritance from list after searching for it

    public int chooseInheritance(String initialDecisionNumber) throws InterruptedException {
        WaitFor(initialDecisionNumberTxt);
        Thread.sleep(1000);
        initialDecisionNumberTxt.clear();
        initialDecisionNumberTxt.sendKeys(initialDecisionNumber);
//        click with javascript because the button is not clickable by normal selenium click
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", searchBtn);

        Thread.sleep(1000);
        if (!StatusList.isEmpty()) {
            System.out.println("skipped this step because the inheritance is already in progress");
            return 1;
        } else {
            Thread.sleep(1000);
            specialButtonClick(viewBtn);
            return 0;
        }

    }

    public int chooseInheritanceForAssets(String initialDecisionNumber) throws InterruptedException {
        WaitFor(initialDecisionNumberTxt);
        Thread.sleep(1000);
        initialDecisionNumberTxt.clear();
        initialDecisionNumberTxt.sendKeys(initialDecisionNumber);
        specialButtonClick(searchBtn);
        try {
            WaitFor(spanWhiteSpace);
            if (!NumberOfAssetsTxt.getAttribute("innerHTML").equals("0")) {
                System.out.println(NumberOfAssetsTxt.getAttribute("innerHTML") + " assets");
                System.out.println("skipped this step because the inheritance has assets");
                return 0;
            } else {
                Thread.sleep(1000);
                specialButtonClick(viewBtn);
                return 1;
            }
        } catch (NoSuchElementException e) {
            System.out.println("skipped this step because the inheritance does not exist");
            return 0;
        }


    }

}
