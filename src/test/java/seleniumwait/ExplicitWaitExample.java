package seleniumwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        WebElement userName = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        userName.sendKeys("standard_user");

        WebElement passwordField = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginButton.click();

        driver.quit();
    }
}
