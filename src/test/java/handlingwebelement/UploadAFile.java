package handlingwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadAFile {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement mouseHover = driver.findElement(By.xpath("//h2[text()='Mouse Hover']"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", mouseHover);

        WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
        chooseFileButton.sendKeys("/home/aayu/Pictures/test.png");

        WebElement uploadSingleFileButton = driver.findElement(By.xpath("//button[text()='Upload Single File']"));
        uploadSingleFileButton.click();

        driver.close();
    }

}
