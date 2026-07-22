package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/progress-bar");

        WebElement startButton = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("startStopButton")));
        startButton.click();

        WebElement resetButton = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
        resetButton.click();

    }
}
