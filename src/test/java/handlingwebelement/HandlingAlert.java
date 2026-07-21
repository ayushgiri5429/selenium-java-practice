package handlingwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingAlert {

    WebDriver driver = new ChromeDriver();

    public void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

    }

    public void simpleAlert(){
       setup();
        WebElement simpleAlertButton = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
        simpleAlertButton.click();

        driver.switchTo().alert().accept();
    }

    public void confirmAlert(){
        setup();
        WebElement confirmAlertButton = driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
        confirmAlertButton.click();
        driver.switchTo().alert().dismiss();
    }

    public void promptAlert(){
        setup();
        WebElement promptAlertButton = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
        promptAlertButton.click();
        driver.switchTo().alert().sendKeys("Ayush Giri");
        driver.switchTo().alert().accept();
    }

    public static void main(String[] args) {
        HandlingAlert alert = new HandlingAlert();
        alert.simpleAlert();

        alert.confirmAlert();

        alert.promptAlert();

    }
}