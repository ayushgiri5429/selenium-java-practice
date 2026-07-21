package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AutomatePractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice-automation.com/form-fields/");

        // Username
        WebElement userName = driver.findElement(By.id("name-input"));
        userName.sendKeys("Ayush");

        // Password
        WebElement passWord = driver.findElement(By.cssSelector("input[type='password']"));
        passWord.sendKeys("Test123");

        // Drinks
        WebElement water = driver.findElement(By.id("drink1"));
        water.click();

        WebElement milk = driver.findElement(By.id("drink2"));
        WebElement coffee = driver.findElement(By.id("drink3"));
        WebElement wine = driver.findElement(By.id("drink4"));
        WebElement ctrlAltDelight = driver.findElement(By.id("drink5"));

        // Colors
        WebElement red = driver.findElement(By.id("color1"));
        red.click();

        WebElement blue = driver.findElement(By.id("color2"));
        WebElement yellow = driver.findElement(By.id("color3"));
        WebElement green = driver.findElement(By.id("color4"));
        WebElement fFC0CB = driver.findElement(By.id("color5"));

        // Dropdown menu
        WebElement selectElement = driver.findElement(By.id("automation"));

        Select dropDown = new Select(selectElement);
        dropDown.selectByValue("yes");

        WebElement noValue = driver.findElement(By.cssSelector("option[value='default']"));
        WebElement no = driver.findElement(By.cssSelector("option[value='no']"));
        WebElement undecided = driver.findElement(By.cssSelector("option[value='undecided']"));

        // Email
        WebElement eMail = driver.findElement(By.id("email"));
        eMail.sendKeys("ayush@gmail.com");

        // Message
        WebElement messageBox = driver.findElement(By.id("message"));
        messageBox.sendKeys("Hello!!!!!!!!!!!!!!!!!!!!");

        // Submit Button
        WebElement submitButton = driver.findElement(By.id("submit-btn"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);

        Thread.sleep(1000);

        submitButton.click();

        Thread.sleep(3000);

        driver.quit();
    }
}