import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportdetailsPage extends PageBase {

    public By reporttab = By.id("b4-b5-Title");
    public By approvebtn = By.id("b4-b19-b1-b33-Btn_EvaluationEmployee_Approve");
    public By searchsource = By.id("b4-b19-b1-SearchSource2");
    public By indicated = By.id("b4-b19-b1-IndictiveValue");

    public ReportdetailsPage(WebDriver driver) {
        super(driver);
    }


    public void approveAssetReport() {
        specialButtonClick(reporttab);
        WaitFor(approvebtn);
        //        driver.findElement(usenamefield).sendKeys(name);
        driver.findElement(searchsource).sendKeys("udemy");
        //WaitFor(indicated,driver);
        driver.findElement(indicated).clear();
        driver.findElement(indicated).sendKeys("123");
        specialButtonClick(approvebtn);

    }

}



