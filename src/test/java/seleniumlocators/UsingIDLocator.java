package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // window lai thulo size banaune

        driver.get("https://www.saucedemo.com/"); // tells the browser to go to url

        driver.findElement(By.id("user-name")).sendKeys("Standard_user");
//        userNameFiled.sendKeys("standard_user"); //username field ma input dine

        WebElement passwordFiled = driver.findElement(By.id("password"));
        passwordFiled.sendKeys("secret_sauce"); //action to perform

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }


}
