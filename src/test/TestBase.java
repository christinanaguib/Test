import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    DevTools devtools;



    public void WaitFor(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void WaitFor(By ByElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ByElement));
    }

    public void specialButtonClick(WebElement LoginBtn) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", LoginBtn);
    }

    public void specialButtonClick(By by) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }

    @BeforeSuite
    public void StartDriver() throws IOException {

//        options.addArguments("--disable-features=msHubApps");
//        String dir ="src/test/java/com/infath/infathdemo/Files/chromedriver.exe";

//        String dir = System.getProperty("user.dir");
//        FileReader reader=new FileReader(dir+"\\src\\resources\\Data.properties\\TestData.properties");
        LoadPropertiesFile loadPropertiesFile =new LoadPropertiesFile();

//        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
//        driver = new EdgeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://es-qa.infath.sa/Eservices_External/Login");
//        driver.manage().window().maximize();

//        WaitFor(By.cssSelector("button[class*='btn-large']"));
    }



    @AfterSuite
    public void StopDriver() {
//        driver.quit();
    }
}