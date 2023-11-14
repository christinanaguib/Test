
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ApproveReportTest extends TestBase {

    LoginPage loginPage;
    ReportListsPage assetListsPage;
    ReportdetailsPage assetdetailsPage;

    @Test(groups = "EV", dependsOnGroups = "EM")
    public void approvereport() throws FileNotFoundException {
        loginPage = new LoginPage(driver);

        loginPage.login(LoadPropertiesFile.Userdata.getProperty("EV1Username")
                , LoadPropertiesFile.Userdata.getProperty("EV1Password"));
        assetListsPage = new ReportListsPage(driver);
        WaitFor(assetListsPage.deednumber);
        assetListsPage.openassetdetails(InheritanceDetails.deedNumber);
        assetdetailsPage = new ReportdetailsPage(driver);
        WaitFor(assetdetailsPage.reporttab);
        assetdetailsPage.approveAssetReport();
        assetListsPage.Logout();


    }


}
