package seleniumwait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        usernameField.sendKeys("standard_user");

        WebElement passwordFiled = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        passwordFiled.sendKeys("secret_sauce");

        WebElement loginButton = fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginButton.click();

        driver.quit();

    }
}
