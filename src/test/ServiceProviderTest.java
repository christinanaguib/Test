
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class ServiceProviderTest extends TestBase {

    SPInheritanceList SPInheritanceList;
    LoginExternal LoginExternal;
    InheritanceDetails inheritanceDetails;
    APICall apiCall = new APICall();



    CaseReportsForm caseReportsForm;

    @Test
    public void CreateUniqueCall() throws IOException {
        APICall.InitialDecisionNumber = apiCall.makeUniqueFile("src/resources/CreateInheritance.json");
        apiCall.sendCreateInheritance("src/resources/CreateInheritance.json");
    }

    @Test(dependsOnMethods = "CreateUniqueCall", groups = "SP")
    public void viewInheritance() throws InterruptedException {
        LoginExternal = new LoginExternal(driver);
        LoginExternal.Login(LoadPropertiesFile.Userdata.getProperty("SP1Username"),
                LoadPropertiesFile.Userdata.getProperty("SP1Password"));
        SPInheritanceList = new SPInheritanceList(driver);
        SPInheritanceList.chooseInheritance(APICall.InitialDecisionNumber);
    }

    @Test(dependsOnMethods = "viewInheritance", groups = "SP")
    public void FillInheritanceDetails() throws InterruptedException {
        SPInheritanceList = new SPInheritanceList(driver);
        if (!SPInheritanceList.StatusList.isEmpty()) {
            System.out.println("skipped this step because the inheritance is already in progress");
        } else {
            inheritanceDetails = new InheritanceDetails(driver);
            inheritanceDetails.fillInheritanceDetails("test", "0512345678");
            inheritanceDetails.fillHeirsDetails();
            inheritanceDetails.confirmInheritance();
        }
    }

    @Test(dependsOnMethods = "FillInheritanceDetails", groups = "SP")
    public void addAsset() throws InterruptedException, AWTException {

        SPInheritanceList = new SPInheritanceList(driver);
        SPInheritanceList.chooseInheritanceForAssets(APICall.InitialDecisionNumber);
        specialButtonClick(SPInheritanceList.viewBtn);
        inheritanceDetails = new InheritanceDetails(driver);
        inheritanceDetails.addAsset();
    }

    @Test(dependsOnMethods = "addAsset", groups = "SP")
    public void FillingCaseReport() throws InterruptedException {

        caseReportsForm = new CaseReportsForm(driver);

        caseReportsForm.FillCaseReport();
        Thread.sleep(2000);
        caseReportsForm.LogoutfromSP1();
        System.out.println("All forms have been filled and SP1 is logged out successfully");
    }

}
