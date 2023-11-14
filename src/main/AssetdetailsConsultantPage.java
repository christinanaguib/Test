import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.ServerSocket;

public class AssetdetailsConsultantPage extends PageBase {

    public AssetdetailsConsultantPage(WebDriver driver) {
        super(driver);
    }

    public By approvebtn = By.xpath("/html/body/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div[1]/div/div[1]/div[2]/div/button[1]");

    public By confirmapprovbtn = By.xpath("/html/body/div[2]/div/div/div/div/div/div[3]/div/div/button");
    public By rebutton = By.cssSelector("button[class$='text-error']");
    public By belowtext = By.cssSelector("#b4-\\$b2 > div.display-flex.justify-content-space-between.align-items-center.card.margin-bottom-base > div:nth-child(1) > div.display-flex.align-items-center.margin-y-s > div.status.pending.OSInline");
    public By text = By.xpath("//*[@id=\"b4-$b2\"]/div[1]/div[1]/div[2]/div[2]/span");
    public By asset = By.cssSelector("div[class*='pending'] span");
    public By viewasset = By.xpath("/html/body/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/table/tbody/tr/td[10]/div/a/span");
    public By approveassetbtn = By.xpath("/html/body/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[2]/button[1]");
    public By assetstatus = By.xpath("/html/body/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div[3]/div[2]/span");
    public By assetconfirmationbtn = By.xpath("/html/body/div[2]/div/div/div/div/div/div[3]/div/div/button");


    public void approveinherit() throws InterruptedException {
        WaitFor(belowtext);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        specialButtonClick(approvebtn);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1000)", "");
        specialButtonClick(confirmapprovbtn);
    }

    public void approveasst() throws AWTException {
        WaitFor(asset);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        specialButtonClick(viewasset);

        WaitFor(assetstatus);
        JavascriptExecutor x = (JavascriptExecutor) driver;
        x.executeScript("window.scrollBy(0,1000)", "");

        WaitandZoom(approveassetbtn);

        specialButtonClick(approveassetbtn);
        WaitFor(assetconfirmationbtn);

        specialButtonClick(assetconfirmationbtn);

    }
}
