import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

public class ViewRequestsEvaluatorManager extends PageBase{

    public ViewRequestsEvaluatorManager(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//button[@class='btn btn-primary OSFillParent']")
    WebElement ChangeEmployeeSaveBtn;




    @FindBy(xpath = "//*[@id='b4-b1-Input_NumberOfAssets3']")
    public WebElement deednumber;

    @FindBy(xpath = "//button[@class='btn btn-primary ']")
    public WebElement buttonSearch;

    @FindBy(xpath = "//*[@id='b9-l2_0-175_0-Dropdown2']")
    public WebElement selectRequestEmployeeDropdown;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/table/thead/tr/th[6]/span")
    public WebElement WaitAnchor;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div/div/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/table/tbody/tr/td[5]/div/div/select")
    public WebElement selectDropdown;

    @FindBy(xpath = "//*[@id='b2-b3-Icon3']")
    public WebElement iIcon;


    public void chnageRequestEmployee(int emoployeeNumber, String defaultEmployee) throws InterruptedException {
        WaitFor(WaitAnchor);
        Thread.sleep(3000);
        Select EmployeeList = new Select(selectDropdown);
        if(Objects.equals(EmployeeList.getFirstSelectedOption().getText(), defaultEmployee)){
            System.out.println("the selected option is"+EmployeeList.getFirstSelectedOption().getText());
        }
        else{
            specialButtonClick(selectDropdown);

            Thread.sleep(1000);
            EmployeeList.selectByIndex(emoployeeNumber);
            Thread.sleep(1000);
            specialButtonClick(ChangeEmployeeSaveBtn);
        }



    }
    public void SearchForDeedNumber(String deedid){
        WaitFor(deednumber);
        deednumber.sendKeys(deedid);
        specialButtonClick(buttonSearch);
    }

    public void EvaluatorManagerLogout(){

        specialButtonClick(iIcon);
    }

}
