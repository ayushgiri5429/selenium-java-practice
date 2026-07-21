package handlingwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class HandlingNestedIframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement selectText = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
        selectText.click();

        WebElement outerFrameElement = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrameElement);

        WebElement innerFrameElement = driver.findElement(By.xpath("//iframe[contains(@src, 'SingleFrame.html')]"));
        driver.switchTo().frame(innerFrameElement);

        WebElement textMessage = driver.findElement(By.xpath("//input[@type='text']"));
        textMessage.sendKeys("Broadway infosys");

        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        WebElement singleIframe = driver.findElement(By.linkText("Single Iframe"));
        singleIframe.click();

        WebElement singleFrame = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(singleFrame);

        WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
        inputField.sendKeys("Broadway infosys");

        Thread.sleep(2000);

        driver.close();


    }
}