package handlingwebelement;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingIframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice-automation.com/iframes/");

        driver.switchTo().frame("iframe-1"); //by id value

        WebElement selectDocs = driver.findElement(By.xpath("//a[text()='Docs']"));
        selectDocs.click();

        driver.switchTo().defaultContent(); // back to default page

        WebElement meTooText = driver.findElement(By.xpath("//p[text()='Me too!']"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()", meTooText);

        driver.switchTo().frame("bottom-iframe");

        WebElement selectDownload = driver.findElement(By.xpath("//span[text()='Downloads']"));
        selectDownload.click();

    }
}
