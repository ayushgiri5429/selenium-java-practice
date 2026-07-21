package handlingwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingDragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement mouseHoverText = driver.findElement(By.xpath("//h2[text()='Mouse Hover']"));

        JavascriptExecutor jse  = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", mouseHoverText);

        WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement, dropElement).build().perform();
    }
}
