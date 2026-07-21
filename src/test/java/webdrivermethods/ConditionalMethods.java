package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ConditionalMethods {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.get("https://www.saucedemo.com/");
        driver.get("https://testautomationpractice.blogspot.com/");

        //isDisplayed() = check display status of element
//        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
//        logo.isDisplayed();
//        System.out.println("Display status of logo " + logo.isDisplayed());

//        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
//        System.out.println("Display staus of logo "+ status);

        //isEnabled() = check enable/disable status of element/ conditional operation
//        WebElement presentField = driver.findElement(By.xpath("//input[@id='user-name']"));
//        presentField.isEnabled();
//        System.out.println("Status: " + presentField.isEnabled());

        //isSelected() = check element is selected  or not
        WebElement male_rd = driver.findElement(By.xpath("//input[@id='male']"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='female']"));

        System.out.println("Before Selection.......");
        System.out.println("Male: " + male_rd.isSelected());
        System.out.println("Female: " + female_rd.isSelected());

        System.out.println("After Selecting make.......");
        male_rd.click();
        System.out.println("Male: " + male_rd.isSelected());
        System.out.println("Female: " + female_rd.isSelected());
    }
}
