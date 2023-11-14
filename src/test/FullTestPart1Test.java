import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;

public class FullTestPart1Test extends TestBase {
    APICall apiCall = new APICall();
    LoginExternal loginExternal;
    SPInheritanceList SPInheritanceList;

    InheritanceDetails inheritanceDetails;

    CaseReportsForm caseReportsForm;



    @Test

    public void FullTestPart1() throws IOException, InterruptedException, AWTException {
//        define pages that we need
        loginExternal = new LoginExternal(driver);
        SPInheritanceList = new SPInheritanceList(driver);
        inheritanceDetails = new InheritanceDetails(driver);
        caseReportsForm =new CaseReportsForm(driver);
//        first we send api request to create inheritance
        String filepath = "src/resources/CreateInheritance.json";
        String initDecisionNumber = apiCall.makeUniqueFile(filepath);
        System.out.println(initDecisionNumber);
        apiCall.sendCreateInheritance(filepath);
//        System.out.println("initDecisionNumber: "+initDecisionNumber);

//        second we add inheritance basic data using Service Provider
//        login using service


        loginExternal.Login(LoadPropertiesFile.Userdata.getProperty("SP1Username"),
                LoadPropertiesFile.Userdata.getProperty("SP1Password"));
//get the inheritance and go to inheritance details
        SPInheritanceList.chooseInheritance(initDecisionNumber);
//fill inheritance basic details

        //if the request is pending on the evaluator we will skip this step
        if (!SPInheritanceList.StatusList.isEmpty()) {
            System.out.println("skipped this step because the inheritance is already in progress");
        } else//else we will fill the inheritance details
        {
            inheritanceDetails.fillInheritanceDetails("test", "0512345678");
//            go to inheritance list details
            driver.navigate().to("https://es-qa.infath.sa/Eservices_External/Inheritance_Requests");
            SPInheritanceList.chooseInheritanceForAssets(initDecisionNumber);
            inheritanceDetails.fillHeirsDetails();
            inheritanceDetails.confirmInheritance();
        }

//        add asset
        int isAddingAssets = SPInheritanceList.chooseInheritanceForAssets(initDecisionNumber);
        if (isAddingAssets == 1) {
            inheritanceDetails.addAsset();
        }

        System.out.println("Case Report is ready for fill");
//*******************************************************************************
//        public void FillingCaseReport(){
//
//            caseReportsForm = new CaseReportsForm(driver);
//        }
        Thread.sleep(2000);

        caseReportsForm.FillCaseReport();
        caseReportsForm.LogoutfromSP1();
        System.out.println("All forms have been filled and SP1 is logged out successfully");






    }
}
