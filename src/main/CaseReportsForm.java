
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CaseReportsForm extends PageBase {

    public CaseReportsForm(WebDriver driver) {
        super(driver);
        this.driver = driver;
        action = new Actions(driver);
    }


    //    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b8-Input_DateVar']")
//    public WebElement inputDateVar;
    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b8-Input_DateVar']")
    public WebElement inputDateVar;

    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b8-Input_DateVar2']")
    public WebElement inputDateVar2;
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b8-Input_DateVar2']

    @FindBy(css = "select[id='b5-b2-b2-b2-b5-b1-b1-b8-Dropdown1']")
    public WebElement selectDropdown;

    @FindBy(css = "select[id='b5-b2-b2-b2-b5-b1-b1-b8-Dropdown1'] option[value='0']")
    public WebElement optionCost;

    //    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b8-Input_DateVar3']")
//    public WebElement inputDateVar3;
    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b8-Input_DateVar3']")
    public WebElement inputDateVar3;

    //    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b8-Input_DecimalVar']")
//    public WebElement inputDecimalVar;
    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b8-Input_DecimalVar']")
    public WebElement inputDecimalVar;

    //    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b8-b2-Button'] button[class$='btn-primary']")
//    public WebElement buttonSave;
    @FindBy(xpath = "//div[@id='b5-b2-b2-b2-b5-b1-b1-b8-b2-Button']//button[@type='submit'][normalize-space()='Save']")
    public WebElement buttonSave;

    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b10-Input_TextVar']")
    public WebElement ReportIdTextVar;
    //    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b10-Input_TextVar']")
//    public WebElement ReportIdTextVar;
    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b10-Input_TextVar2']")
    public WebElement CostBasisTextVar;
    //    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b10-Input_TextVar2']")
//    public WebElement CostBasisTextVar;
    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b10-Checkbox1']")
    public WebElement inputCheckbox;
    //    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b10-Checkbox1']")
//    public WebElement inputCheckbox;
    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b10-b1-Button'] button[class$='btn-primary']")
    public WebElement buttonSave2;

//    @FindBy(xpath = "//div[@id='b5-b2-b2-b2-b5-b1-b1-b10-b1-Button']//button[@type='submit'][normalize-space()='Save']")
//    public WebElement buttonSave2;

//    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar2']")
//    public WebElement inputDecimalVar2;

    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar2']")
    public WebElement inputDecimalVar2;

//    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b12-Input_Construction_Area']")
//    public WebElement inputConstructionArea;

    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_Construction_Area']")
    public WebElement inputConstructionArea;
//    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b11-ContentWrapper']")
//    public WebElement StreetNameInput;

    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar5']")
    public WebElement StreetNameInput;
    //    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b12-Input_varText']")
//    public WebElement NameofNearestStreetInput;
    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_varText']")
    public WebElement NameofNearestStreetInput;

//    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar6")
//    public WebElement NumOfRoomsInput;


    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div/div/form/div[4]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]")
    public WebElement GetGoogleMap;

    @FindBy(xpath = "/html/body/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div/div/form/div[4]/div/div[2]/div/div[1]/div[2]/div/div/div[4]/div/div[1]/ul")
    public WebElement clickonGoogleMap;
//    /html/body/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div/div/form/div[4]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[4]

//    another location;
//    /html/body/div/div/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div/div/form/div[4]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div[2]


    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar6']")
    public WebElement NumOfRoomsInput;

//    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar7")
//    public WebElement NumberOfHallInput;

    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar7']")
    public WebElement NumberOfHallInput;


    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar8")
    public WebElement NumberOfApartmentsInput;
    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar9']")
    public WebElement NumberOfBathroom;


    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar10")
    public WebElement PropertyAgeInput;

    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_varText2")
    public WebElement DemandVolumeInput;

    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar13")
    public WebElement NumberOfGalleryInput;

    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar15")
    public WebElement NumberOfTowersInput;

    @FindBy(css = "textarea[id$='PropertyDescription']")
    public WebElement TextAreaPropertyDescription;

    //    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b12-b6-DropdownBar']")
//    public WebElement AvailableDropdownBar;
    @FindBy(xpath = "//div[@id='b5-b2-b2-b2-b5-b1-b1-b12-b6-DropdownBar']//i[contains(@class,'icon fa fa-angle-right fa-2x')]")
    public WebElement AvailableDropdownBar;

    @FindBy(xpath = "//span[normalize-space()='Water']")
    public WebElement SelectWater;
    @FindBy(xpath = "//div[@id='b5-b2-b2-b2-b5-b1-b1-b12-b6-SelectAllCheckboxText']")
    public WebElement Selectall;

    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-b6-Input_SearchTerm']")
    public WebElement ClickonspaceDropdown;

    //    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b12-b7-DropdownBar']")
//    public WebElement FacilityDropdownBar;
    @FindBy(xpath = "//div[@id='b5-b2-b2-b2-b5-b1-b1-b12-b7-DropdownBar']//i[@class='icon fa fa-angle-right fa-2x']")
    public WebElement FacilityDropdownBar;

//    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-b7-l1-234_0-Checkbox_ListItem']")
//    public WebElement SelectMosques;
//@FindBy(xpath = "//label[@for='b5-b2-b2-b2-b5-b1-b1-b12-b7-l1-234_0-Checkbox_ListItem']//span[contains(text(),'Mosques')]")
//public WebElement SelectMosques;

    //    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-b7-l1-234_0-Checkbox_ListItem")
//    public WebElement SelectMosques;
    @FindBy(xpath = "//span[normalize-space()='Mosques']")
    public WebElement SelectMosques;


    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b12-b7-Input_SearchTerm']")
    public WebElement ClickonspaceDropdown2;


    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar11")
    public WebElement WellsNumberInput;
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar11']

    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar16")
    public WebElement ADInput;
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar16']
    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar17")
    public WebElement WayInput;
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar17']

    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar18']")
    public WebElement NotesOnPropertyInput;
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b12-Input_DecimalVar18']

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b12-b8-Button'] button[class$='btn-primary']")
    public WebElement buttonSave3;
    //div[@id='b5-b2-b2-b2-b5-b1-b1-b12-b8-Button']//button[@type='submit'][normalize-space()='Save']

    @FindBy(css = "textarea[id*='North']")
    public WebElement TextAreaNorthBorder;
    //textarea[@id='b5-b2-b2-b2-b5-b1-b1-b14-TextArea_North_Border']

    @FindBy(css = "input[id$='NorthNumber']")
    public WebElement inputNorthNumber;
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b14-Input_NorthNumber']

    @FindBy(css = "textarea[id*='South']")
    public WebElement TextSouthBorder;
//    Border From South
    //textarea[@id='b5-b2-b2-b2-b5-b1-b1-b14-TextArea_South_Border']

    @FindBy(css = "input[id$='SouthNumber']")
    public WebElement inputSouthNumber;
//    Length From South
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b14-Input_SouthNumber']

    @FindBy(css = "textarea[id*='East']")
    public WebElement TextEastBorder;
    //    Border From East
//textarea[@id='b5-b2-b2-b2-b5-b1-b1-b14-TextArea_East_Border']
    @FindBy(css = "input[id$='EastNumber']")
    public WebElement inputEastNumber;
//    Length From East
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b14-Input_EastNumber']

    //    @FindBy(css = "textarea[id*='West']")
//    public WebElement TextWestBorder;
    @FindBy(xpath = "//textarea[@id='b5-b2-b2-b2-b5-b1-b1-b14-TextArea_West_Border']")
    public WebElement TextWestBorder;

    @FindBy(css = "input[id$='WestNumber']")
    public WebElement inputWestBorder;
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b14-Input_WestNumber']

    @FindBy(css = "input[id$='BuildingFloorsNo']")
    public WebElement inputBuildingFloors;
    @FindBy(css = "input[id$='BasementArea']")
    public WebElement inputBuildingFloors2;
    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b14-Input_AnnexArea']")
    public WebElement inputAnnexArea;
    @FindBy(css = "input[id$='BuildingArea']")
    public WebElement inputBuildingArea;

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b14-b5-Button'] button[class*='btn-primary']")
    public WebElement BordersSaveBtn;
    //div[@id='b5-b2-b2-b2-b5-b1-b1-b14-b5-Button']//div[@class='btn-label OSInline'][normalize-space()='Save']

    @FindBy(css = "button[class*='ThemeGrid']")
    public WebElement buttonThemeGutter;
    //button[normalize-space()='No']

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b16-b1-Button'] button[class*='btn-primary']")
    public WebElement LinkedAssetSaveBtn;
    //div[@id='b5-b2-b2-b2-b5-b1-b1-b16-b1-Button']//div[@class='btn-label OSInline'][normalize-space()='Save']

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b18-b3-Button'] button[class*='btn-primary']")
    public WebElement CadastralSaveBtn;
    //div[@id='b5-b2-b2-b2-b5-b1-b1-b18-b3-Button']//div[@class='btn-label OSInline'][normalize-space()='Save']

    @FindBy(css = "input[id$='LandNumericalValue']")
    public WebElement inputLandNumericalValue;

    @FindBy(css = "input[id$='BuildingNumericalValue']")
    public WebElement inputBuildinglValue;

    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b20-Input_TotalPropertyNumerical2']")
    public WebElement inputTotalPropertyNumerical2;

    @FindBy(css = "input[id$='DosciuntPercentageValue']")
    public WebElement inputDosciuntPercentageValue;

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b20-b1-Button'] button[class*='btn-primary']")
    public WebElement EstimatedSaveBtn;
    //div[@id='b5-b2-b2-b2-b5-b1-b1-b20-b1-Button']//button[@type='button']

    //    @FindBy(css = "input[id$='AssetLocation']")
//    public WebElement inputAssetLocation;
    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b22-Input_AssetLocation']")
    public WebElement inputAssetLocation;
//  css
//  #b5-b2-b2-b2-b5-b1-b1-b22-Input_AssetLocation


    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b22-b1-FileUploadInput']")
    public WebElement inputFileUpload;

    @FindBy(xpath = "//i[@class='icon fa fa-download fa-1x']")
    public WebElement DownloadIcon;

    //    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b22-b3-FileUploadInput']")
//    public WebElement inputFileUpload2;
    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b22-b3-FileUploadInput']")
    public WebElement inputFileUpload2;

    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b22-b5-FileUploadInput']")
    public WebElement inputFileUpload3;

    //input[@id='b5-b2-b2-b2-b5-b1-b1-b22-b5-FileUploadInput']

    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b22-b7-FileUploadInput']")
    public WebElement inputFileUpload4;
    //input[@id='b5-b2-b2-b2-b5-b1-b1-b22-b7-FileUploadInput']

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b22-b9-Button'] button[class$='btn-primary']")
    public WebElement AssetSaveBtn;
    //div[@id='b5-b2-b2-b2-b5-b1-b1-b22-b9-Button']//button[@type='button'][normalize-space()='Save']

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b24-AddBtn'] button[class$='btn-primary']")
    public WebElement buttonAddPerson;

    @FindBy(css = "select[id='b5-b2-b2-b2-b5-b1-b1-b24-Dropdown1']")
    public WebElement RoleDropdown;

    @FindBy(css = "input[id$='Name']")
    public WebElement inputName;

    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b24-Input_Name2")
    public WebElement licenseNumber;

    @FindBy(css = "#b5-b2-b2-b2-b5-b1-b1-b24-Input_Name3")
    public WebElement DateInput;

    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b24-b2-FileUploadInput']")
    public WebElement LicenseFileUpload5;

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b24-b4-Button'] button[class$='btn-primary']")
    public WebElement PersonSaveBtn;

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b26-b1-Button'] button[class$='btn-primary']")
    public WebElement ResearchDomainSaveBtn;

    @FindBy(css = "input[id='b5-b2-b2-b2-b5-b1-b1-b28-b1-FileUploadInput']")
    public WebElement inputFileUpload5;

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b28-b3-Button'] button[class*='btn-primary']")
    public WebElement buttonSave11;

    @FindBy(css = "html > body > div > div > div > div > div > div > div > div > div:nth-of-type(3) > div > div > div > div > div > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(3) > button:nth-of-type(2)")
    public WebElement buttonAdd;

    @FindBy(xpath = "//textarea[@id='b5-b2-b2-b2-b5-b1-b1-b28-TextArea_Notes']")
    public WebElement NotesText;
    @FindBy(xpath = "//input[@id='b5-b2-b2-b2-b5-b1-b1-b28-b1-FileUploadInput']")
    public WebElement LastUploadFile;

    @FindBy(xpath = "//span[normalize-space()='Add']")
    public WebElement LastAddBtn;


    @FindBy(xpath = "//div[@style='z-index: 3; position: absolute; height: 100%; width: 100%; padding: 0px; border-width: 0px; margin: 0px; left: 0px; top: 0px; touch-action: pan-x pan-y;']")
    public WebElement divNavigatePressTheArrow2;

    @FindBy(css = "i[class*='fa-download']")
    public WebElement LastIconDownload;

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b28-b3-Button'] button[class*='btn-primary']")
    public WebElement LastSaveButton;

    @FindBy(xpath = "//*[text() = 'Asset Location']")
    public WebElement labelAssetLocation;

    @FindBy(css = "html > body > div:nth-of-type(2) > div > div > div > div > form > div:nth-of-type(5) > div:nth-of-type(2) > div > table > tbody > tr > td > div > div:nth-of-type(2) > div:nth-of-type(1) > a > i")
    public WebElement PersonIconDownload;

    @FindBy(css = "div[id='b5-b2-b2-b2-b5-b1-b1-b23-Title'] span[class='margin-left-base']")
    public WebElement LastScrollAnchor;

//    @FindBy(xpath = "//input[@id='b5-b2-b6-l1_0-105_0-Is_Invoiced']")
//    public WebElement SelectAssettoSubmit;
    @FindBy(css = "input[id$='Invoiced']")
    public WebElement SelectAssettoSubmit;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement SubmitAsset;

    @FindBy(xpath = "//div[@class='btn-label OSInline']")
    public WebElement YesBtntoSubmit;

    @FindBy(id = "b3-b1-Icon3")
    public WebElement LogOutBtn;



    public void FillCaseReport() throws InterruptedException {

        inputDateVar.sendKeys("10/05/2023");
        inputDateVar2.sendKeys("10/06/2023");
        Select Dropdown1 = new Select(selectDropdown);
        Dropdown1.selectByIndex(1);
        System.out.println("the Date fields are done");
        inputDateVar3.sendKeys("22-testAdress" + Keys.TAB);
        inputDecimalVar.sendKeys("0522223333" + Keys.TAB + Keys.ENTER);
        System.out.println("1st section fields are done & Saved");
//      WaitFor(ReportIdTextVar);
        Thread.sleep(2000);
        try {
            ScrollTo(ReportIdTextVar);
            JSinput(ReportIdTextVar, "556");
            ReportIdTextVar.sendKeys("776", Keys.TAB);
            CostBasisTextVar.sendKeys("65656");
        } catch (TimeoutException e) {
            System.out.println("first or 2nd field skipped Element not found");
        }
        specialButtonClick(inputCheckbox);
        specialButtonClick(buttonSave2);
        System.out.println("2nd data section is done & Saved");

        JSinput(inputDecimalVar2, "777");
        JSinput(inputConstructionArea, "555777");
        JSinput(StreetNameInput, "666777");
        JSinput(NameofNearestStreetInput, "888777");

//        try {
//            specialButtonClick(LocationOnGoogleMap);
//        } catch (TimeoutException e) {
//            System.out.println("Unable to set Location , Element not found");
//        }

//        mahmoud code
//        Thread.sleep(7000);
//        try {
//            devtools = ((ChromeDriver) driver).getDevTools();
//            devtools.createSession();
//            devtools.send(Emulation.setGeolocationOverride(
//                    Optional.of(24.7311),
//                    Optional.of(46.6701),
//                    Optional.of(100)));
//        } catch (TimeoutException e) {
//            System.out.println("Unable to set Location , Element not found");
//        }
/////////////////////////////////////////////////////////////////////////////////////////////////////
        ClickOnMap(divNavigatePressTheArrow2);

        String dir = System.getProperty("user.dir");

        inputFileUpload.sendKeys(dir + "\\src\\resources\\Java-Path.png");
        WaitFor(DownloadIcon);
        boolean frststdownicon = DownloadIcon.isDisplayed();
        System.out.println("Status for 1st file uploaded is " + frststdownicon);

        inputFileUpload2.sendKeys(dir + "\\src\\resources\\Screenshot (166).png");
        WaitFor(DownloadIcon);
        boolean secstdownicon = DownloadIcon.isDisplayed();
        System.out.println("Status for 2nd file uploaded is " + secstdownicon);

        inputFileUpload3.sendKeys(dir + "\\src\\resources\\Screenshot (166).png");
        WaitFor(DownloadIcon);
        boolean Thirddownicon = DownloadIcon.isDisplayed();
        System.out.println("Status for 3rd file uploaded is " + Thirddownicon);

        inputFileUpload4.sendKeys(dir + "\\src\\resources\\Screenshot (166).png");
        WaitFor(DownloadIcon);
        boolean forthdownicon = DownloadIcon.isDisplayed();
        System.out.println("Status for 4th file uploaded is " + forthdownicon);
        System.out.println("upload Done");
        Thread.sleep(5000);
        ScrollTo(NumOfRoomsInput);
        JSinput(NumOfRoomsInput, "55");
        JSinput(NumberOfHallInput, "50");
        JSinput(NumberOfApartmentsInput, "66");
        JSinput(NumberOfBathroom, "15");
        JSinput(PropertyAgeInput, "66");
        JSinput(DemandVolumeInput, "77");
        JSinput(NumberOfGalleryInput, "68");
        JSinput(NumberOfTowersInput, "75");
        JSinput(TextAreaPropertyDescription, "textareaTextAreaPropertyDescription");

        System.out.println("txt field is done");
        scrollToBottom();
        specialButtonClick(AvailableDropdownBar);
        Thread.sleep(2000);
        try {
            specialButtonClick(SelectWater);
            JSinput(WellsNumberInput, " ");
        } catch (TimeoutException e) {
            System.out.println("1st dropdown skipped Element not found");
        }
        Thread.sleep(2000);
        System.out.println("Selection is done from 1st dropdown");
        specialButtonClick(FacilityDropdownBar);
        Thread.sleep(2000);
        try {
            specialButtonClick(SelectMosques);
            JSinput(WellsNumberInput, " ");
        } catch (TimeoutException e) {
            System.out.println("2nd dropdown skipped Element not found");
        }
        System.out.println("Selection is done from 2nd dropdown");
        Thread.sleep(2000);
        JSinput(WellsNumberInput, "77");
        JSinput(ADInput, "88");
        JSinput(WayInput, "99");
        JSinput(NotesOnPropertyInput, "55"+Keys.TAB+Keys.ENTER);
        specialButtonClick(buttonSave3);

//        NotesOnPropertyInput.sendKeys(Keys.TAB, Keys.ENTER);
        System.out.println("Map location and dropdown Section are done");

        TextAreaNorthBorder.sendKeys("TessssstTextArea North");
        inputNorthNumber.sendKeys("33");
        TextSouthBorder.sendKeys("TessssstTextArea South");
        inputSouthNumber.sendKeys("66");
        TextEastBorder.sendKeys("TessssstTextArea East");
        inputEastNumber.sendKeys("55");

        JSinput(TextWestBorder, "TessssstTextArea West");
        JSinput(inputWestBorder, "44");
        JSinput(inputBuildingFloors, "56");
        JSinput(inputBuildingFloors2, "577");
        JSinput(inputAnnexArea, "588");
        inputBuildingArea.sendKeys("56666", Keys.TAB, Keys.ENTER);
        System.out.println("Borders & Length are done");

        specialButtonClick(LinkedAssetSaveBtn);
        specialButtonClick(CadastralSaveBtn);

        inputLandNumericalValue.sendKeys("5666899");
        inputBuildinglValue.sendKeys("5666899");
        inputTotalPropertyNumerical2.sendKeys("5666999");
        inputDosciuntPercentageValue.sendKeys("20", Keys.TAB, Keys.ENTER);
        System.out.println("Estimated Section are done");
        try {
            ScrollTo(inputAssetLocation);
            inputAssetLocation.sendKeys("333 test location address");
        } catch (TimeoutException e) {
            System.out.println("Location field skipped Element not found");
        }

        specialButtonClick(AssetSaveBtn);
        JSinput(NotesText, "Last tesssssst Test txt ");
//        add person
        specialButtonClick(buttonAddPerson);
        inputName.sendKeys("ay7ga");
        licenseNumber.sendKeys("123456");
        DateInput.sendKeys("10/10/2020");
        LicenseFileUpload5.sendKeys(dir + "\\src\\resources\\Java-Path.png");
        WaitFor(PersonIconDownload);
        boolean PersonIconDownload2 = PersonIconDownload.isDisplayed();
        System.out.println("Status for add Person details file uploaded is " + PersonIconDownload2);

        specialButtonClick(PersonSaveBtn);
        Thread.sleep(2000);

        LastUploadFile.sendKeys(dir + "\\src\\resources\\Java-Path.png");
        ScrollTo(LastScrollAnchor);
        WaitFor(LastIconDownload);
        boolean LastIconDownload2 = LastIconDownload.isDisplayed();
        System.out.println("Status for last file uploaded is " + LastIconDownload2);
//      specialButtonClick(buttonSave11);


        specialButtonClick(ResearchDomainSaveBtn);
        Thread.sleep(2000);
        specialButtonClick(LastSaveButton);
        Thread.sleep(2000);
        specialButtonClick(LastAddBtn);

        WaitFor(SelectAssettoSubmit);
        specialButtonClick(SelectAssettoSubmit);
        specialButtonClick(SubmitAsset);
        specialButtonClick(YesBtntoSubmit);
    }

    public void LogoutfromSP1(){
        WaitFor(LogOutBtn);
        specialButtonClick(LogOutBtn);
    }

    public void ClickOnMap(WebElement Map) throws InterruptedException {
////click Map with offset

        ScrollTo(NameofNearestStreetInput);
        Thread.sleep(5000);
        Point location = Map.getLocation();
        int width = Map.getSize().getWidth() / 2 + location.getX();
        int height = Map.getSize().getHeight() / 2 + location.getY();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("$(document.elementFromPoint(arguments[0], arguments[1])).click(); ", width, height);

    }
}
