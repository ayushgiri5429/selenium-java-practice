package handlingwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingDoubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement mouseHoverText = driver.findElement(By.xpath("//h2[text()='Mouse Hover']"));

        JavascriptExecutor jse  = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", mouseHoverText);

        WebElement copyButton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        Actions action = new Actions(driver);
        action.doubleClick(copyButton).build().perform();

    }
}
