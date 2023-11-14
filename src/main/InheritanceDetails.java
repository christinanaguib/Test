import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;


public class InheritanceDetails extends PageBase {
    public InheritanceDetails(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[id$='Name']")
    WebElement nameTxt;

    @FindBy(css = "input[id*='Mobile']")
    WebElement mobileTxt;

    @FindBy(css = "button[class*='btn-primary']")
    WebElement NextBtn;


    @FindBy(css = "input[id='b5-b1-b7-b1-RadioButton3-input']")
    WebElement passportRadioBtn;

    @FindBy(css = "#b5-b1-b7-b1-ID_Number")
    WebElement IDNumberTxt;


    @FindBy(css = "html > body > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > select:nth-of-type(2) > option:nth-of-type(1)")
    WebElement YearsUp;

    @FindBy(css = "select[title='Change the year']")
    WebElement yearSelect;


    @FindBy(css = "a[title='Select Wednesday, Rab2 14, 1375']")
    WebElement daySelect;

    @FindBy(css = "input[id='b5-b1-b7-b1-Name']")
    WebElement InheritorNameTxt;

    @FindBy(css = "input[id='b5-b1-b7-b1-Nationality']")
    WebElement InheritorNationalityTxt;

    @FindBy(css = "button[class$='margin-right-base']")
    WebElement AddInheritorBtn;

    @FindBy(css = "div[id='b5-b1-b7-b6-Button'] button[class$='btn-primary']")
    WebElement NextBtn2;

    @FindBy(xpath = "//*[text() = 'Send']")
    public WebElement buttonSend;

    @FindBy(css = "div[id='b5-b1-b8-b4-Button'] button[class$='btn-primary']")
    public WebElement buttonSend2;

    @FindBy(css = "div[style='text-align: left;'] button[class='btn']")
    public WebElement buttonAddAsset;

    @FindBy(css = "input[id='b5-b2-b2-Property-input']")
    public WebElement inputProperty;


    @FindBy(css = "html > body > div:nth-of-type(2) > div > div > div > div > div > div:nth-of-type(3) > div > div > button")
    public WebElement PopupInheritanceButtonApprove;

    @FindBy(xpath = "//*[@id=\"b4-$b2\"]/div[1]/div[2]/div/button[1]")
    public WebElement inheritanceButtonApprove;


    @FindBy(css = "input[id='b5-b1-b7-b1-b1-Switch1']")
    public WebElement inputSwitch;

//    Asset Property details

    @FindBy(css = "#b5-b2-b2-b2-b4-Deed_Number")
    public WebElement inputDeedNumber;

    public static String deedNumber;


    @FindBy(css = "input[id$='SubType']")
    public WebElement inputPropertySubType;

    @FindBy(css = "select[id$='Status']")
    public WebElement selectPropertyStatus;

    @FindBy(css = "select[id$='Status'] option[value='0']")
    public WebElement optionEmpty;

    @FindBy(css = "#b5-b2-b2-b2-b4-Deed_Type")
    public WebElement selectDeedType;

    @FindBy(css = "#b5-b2-b2-b2-b4-Deed_Type option[value='2']")
    public WebElement optionOther;

    @FindBy(css = "select[id='b5-b2-b2-b2-b4-Region']")
    public WebElement selectRegion;

    @FindBy(css = "select[id='b5-b2-b2-b2-b4-Region'] option[value='0']")
    public WebElement optionAsir;

    @FindBy(css = "select[id='b5-b2-b2-b2-b4-City']")
    public WebElement selectCity;

    @FindBy(css = "select[id='b5-b2-b2-b2-b4-City'] option[value='0']")
    public WebElement optionKhamisMsheet;

    @FindBy(css = "input[id$='Area']")
    public WebElement inputArea;

    @FindBy(css = "input[id='b5-b2-b2-b2-b4-RadioButton23-input']")
    public WebElement inputRadioButton;

    @FindBy(css = "input[id='b5-b2-b2-b2-b4-RadioButton17-input']")
    public WebElement inputRadioButton2;

    @FindBy(css = "input[id='b5-b2-b2-b2-b4-RadioButton20-input']")
    public WebElement inputRadioButton3;

    @FindBy(css = "input[id='b5-b2-b2-b2-b4-RadioButton25-input']")
    public WebElement inputRadioButton4;

    @FindBy(css = "input[id='b5-b2-b2-b2-b4-RadioButton18-input']")
    public WebElement inputRadioButton5;

    @FindBy(css = "input[id='b5-b2-b2-b2-b4-RadioButton19-input']")
    public WebElement inputRadioButton6;

    @FindBy(css = "textarea[id$='Notes']")
    public WebElement textareaTextAreaNotes;


    @FindBy(css = "button[class$='btn-primary']")
    public WebElement buttonNext;

    @FindBy(css = "input[id='b5-b2-b2-b2-b4-b6-FileUploadInput']")
    public WebElement inputFileUpload;

    @FindBy(css = "input[id='b5-b2-b2-b2-b4-b16-FileUploadInput']")
    public WebElement inputFileUpload2;

    @FindBy(css = "html > body > div > div > div > div > div > div > div > div > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(2) > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(3) > form > div > div:nth-of-type(7) > div:nth-of-type(4) > div:nth-of-type(2) > div > div > table > tbody > tr > td > div > div:nth-of-type(2) > div:nth-of-type(1) > a > i")
    public WebElement iIconDownload;

    @FindBy(css = "button[class$='btn-primary']")
    public WebElement buttonValidate;


    public void fillInheritanceDetails(String name, String mobile) {
        try {
            WaitFor(nameTxt);
            nameTxt.sendKeys(name + Keys.TAB);
            mobileTxt.sendKeys(mobile);
            specialButtonClick(NextBtn);
        } catch (TimeoutException e) {
            System.out.println("first step skipped Element not found");
        }


    }

    public void fillHeirsDetails() throws InterruptedException {
        try {
            Thread.sleep(2000);
            ScrollTo(IDNumberTxt);
            specialButtonClick(passportRadioBtn);
            Thread.sleep(1000);


            JSinput(IDNumberTxt, "123456789");

            IDNumberTxt.sendKeys("123456789" + Keys.TAB);
            inputSwitch.sendKeys(Keys.TAB);

//        needs refactoring
            Thread.sleep(500);
            specialButtonClick(yearSelect);
            YearsUp.click();

            specialButtonClick(yearSelect);
            YearsUp.click();

            specialButtonClick(yearSelect);
            YearsUp.click();

            specialButtonClick(yearSelect);
            YearsUp.click();

            Select select = new Select(yearSelect);
            select.selectByVisibleText("1375");


//
            specialButtonClick(daySelect);
            InheritorNameTxt.sendKeys("SonTest");
            InheritorNationalityTxt.sendKeys("Saudi");
            specialButtonClick(AddInheritorBtn);
            specialButtonClick(NextBtn2);
        } catch (TimeoutException e) {
            System.out.println("second step skipped already filled");
        } catch (NoSuchElementException e) {
            System.out.println("second step skipped Element not found");
        }


    }

    public void confirmInheritance() {
        WaitFor(buttonSend);
        specialButtonClick(buttonSend);
        specialButtonClick(buttonSend2);
    }

    public void addAsset() throws InterruptedException {
        WaitFor(buttonAddAsset);
        specialButtonClick(buttonAddAsset);
        WaitFor(inputProperty);
        specialButtonClick(inputProperty);

        Thread.sleep(2000);
        inputProperty.sendKeys(Keys.TAB);
        ScrollTo(inputDeedNumber);
        long deeDNumber = System.currentTimeMillis() % (long) 1000000000000.0;
        deedNumber = deeDNumber + "";
        inputDeedNumber.sendKeys(deeDNumber + "" + Keys.TAB);
//        choose date
        //        needs refactoring
        Thread.sleep(500);
        specialButtonClick(yearSelect);
        YearsUp.click();

        specialButtonClick(yearSelect);
        YearsUp.click();

        specialButtonClick(yearSelect);
        YearsUp.click();

        specialButtonClick(yearSelect);
        YearsUp.click();

        Select select = new Select(yearSelect);
        select.selectByVisibleText("1375");
        specialButtonClick(daySelect);
//
        Thread.sleep(1000);
        specialButtonClick(buttonValidate);
        Thread.sleep(2000);
        specialButtonClick(inputPropertySubType);
        inputPropertySubType.sendKeys("test" + Keys.TAB);
        specialButtonClick(selectPropertyStatus);
        optionEmpty.click();
        specialButtonClick(selectDeedType);
        optionOther.click();
        specialButtonClick(selectRegion);
        optionAsir.click();
        specialButtonClick(selectCity);
        WaitFor(optionKhamisMsheet);
        optionKhamisMsheet.click();
        JSinput(inputArea, "123");
        inputArea.sendKeys("123" + Keys.TAB);
        specialButtonClick(inputRadioButton);
        specialButtonClick(inputRadioButton2);
        specialButtonClick(inputRadioButton3);
        specialButtonClick(inputRadioButton4);
        specialButtonClick(inputRadioButton5);
        specialButtonClick(inputRadioButton6);
        JSinput(textareaTextAreaNotes, "test");

        textareaTextAreaNotes.sendKeys("test" + Keys.TAB);
        String dir = System.getProperty("user.dir");
        inputFileUpload.sendKeys(dir + "\\src\\resources\\Screenshot (161).png");
        inputFileUpload2.sendKeys(dir + "\\src\\resources\\Screenshot (166).png");
        WaitFor(iIconDownload);
        specialButtonClick(buttonNext);


    }

    public void approveInheritance() {
        WaitFor(inheritanceButtonApprove);
        specialButtonClick(inheritanceButtonApprove);
        WaitFor(PopupInheritanceButtonApprove);
        specialButtonClick(PopupInheritanceButtonApprove);
    }
}
