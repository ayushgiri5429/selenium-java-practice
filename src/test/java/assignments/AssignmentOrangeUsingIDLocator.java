package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AssignmentOrangeUsingIDLocator {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement userNameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.tagName("button"));

        userNameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");
        submitButton.click();
        
    }
}
