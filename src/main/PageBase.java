import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.function.Function;

public class PageBase {
    protected WebDriver driver;
    public WebDriverWait wait;
    public Actions action ;

//    public Select Dropdown;
    DevTools devtools;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void specialButtonClick(WebElement LoginBtn) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", LoginBtn);
    }


    public void specialButtonClick(By by) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }

    public void JSinput(WebElement element, String value) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value='" + value + "';", element);
    }


    public void WaitFor(By ByElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ByElement));
    }

    public void WaitFor(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void WaitForEnable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }




    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,4000)");
    }


    public void ScrollTo(WebElement webElement) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }
    public void Zoom() throws AWTException {
//        zoom using robot

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ADD);
        robot.keyRelease(KeyEvent.VK_ADD);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
    public void WaitandZoom(WebElement element){
//        FLuent wait and zoom
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                try {
                    Zoom();
                } catch (AWTException e) {
                    throw new RuntimeException(e);
                }
                return element;
            }
        });

    }

    public void WaitandZoom(By by){
//        FLuent wait and zoom
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                try {
                    Zoom();
                } catch (AWTException e) {
                    throw new RuntimeException(e);
                }
                return driver.findElement(by);
            }
        });

    }

    public void resetZoom() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_0);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

//    public void waitFor(WebElement element) {
//        try{
//            wait.until(ExpectedConditions.elementToBeClickable(element));
//        }
//        catch(Exception E){
//            wait.until(ExpectedConditions.visibilityOf(element));
//
//        }
//    }
}
