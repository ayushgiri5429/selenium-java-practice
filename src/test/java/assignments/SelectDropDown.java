package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropDown {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        usernameField.sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("admin123");

        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        WebElement profile = driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']"));
        profile.click();

        WebElement logoutOption = driver.findElement(By.xpath("//a[text()='Logout']"));
        logoutOption.click();

        driver.close();
    }
};
