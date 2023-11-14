
import org.testng.annotations.Test;

import java.awt.*;

public class ApproveAssetConsultantTest extends TestBase {
    AssetlistingConsultantPage assetlistingConsultantPage;
    AssetdetailsConsultantPage assetdetailsConsultantPage;
    LoginPage loginPage;

    @Test(dependsOnGroups = "EV" ,groups = "IC")
    public void approveInheritance() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.login(LoadPropertiesFile.Userdata.getProperty("IC1Username")
                ,LoadPropertiesFile.Userdata.getProperty("IC1Password"));
        assetdetailsConsultantPage= new AssetdetailsConsultantPage(driver);
        assetlistingConsultantPage = new AssetlistingConsultantPage(driver);
        assetlistingConsultantPage.openassetdetails(APICall.InitialDecisionNumber);
        assetdetailsConsultantPage.approveinherit();
    }
    @Test(dependsOnGroups = "EV" , groups = "IC")
    public void approveasset() throws InterruptedException, AWTException {
        assetlistingConsultantPage = new AssetlistingConsultantPage(driver);
        assetlistingConsultantPage.openassetdetails(APICall.InitialDecisionNumber);
        assetdetailsConsultantPage = new AssetdetailsConsultantPage(driver);
        assetdetailsConsultantPage.approveasst();
    }

}
