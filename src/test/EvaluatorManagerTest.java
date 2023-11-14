import org.testng.annotations.Test;

public class EvaluatorManagerTest extends TestBase{
    private LoginPage loginPage;
    private ReportListsPage assetListsPage;
    private ReportdetailsPage assetdetailsPage;

    private ViewRequestsEvaluatorManager viewRequestsEvaluatorManager;

    @Test(dependsOnGroups = "SP",groups = "EM")
    public void setEmployeeForAsset() throws InterruptedException {
        loginPage = new LoginPage(driver);

        loginPage.login(LoadPropertiesFile.Userdata.getProperty("EMUsername")
                , LoadPropertiesFile.Userdata.getProperty("EMPassword"));
        assetListsPage = new ReportListsPage(driver);
        assetListsPage.openRequestsList();
        viewRequestsEvaluatorManager = new ViewRequestsEvaluatorManager(driver);
        viewRequestsEvaluatorManager.SearchForDeedNumber(InheritanceDetails.deedNumber);
        viewRequestsEvaluatorManager.chnageRequestEmployee(1,"Omnia");
        viewRequestsEvaluatorManager.EvaluatorManagerLogout();

    }

}
