package handlingwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

//        WebElement tuesdayOption = driver.findElement(By.id("tuesday"));
//        tuesdayOption.click();
//        WebElement fridayOption = driver.findElement(By.id("friday"));
//        fridayOption.click();
//    }

        List<WebElement> dayOptions = driver.findElements(By.xpath("//label[@class='form-check-label']"));

        for (WebElement dayOption : dayOptions) {
        String day = dayOption.getText();

        if (day.equals("Sunday")) {
            dayOption.click();
        }

        if (day.equals("Tuesday")) {
            dayOption.click();
        }

        if (day.equals("Thursday")) {
            dayOption.click();
        }


        if (day.equals("Saturday")) {
            dayOption.click();
        }

        }
    }
}
