package typesofdropdownoptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement scrollFunction = driver.findElement(By.xpath("//h2[text()='Alerts & Popups']"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", scrollFunction);

        WebElement dropDown = driver.findElement(By.id("country"));
        Select dropdown = new Select(dropDown);


        //Select option from the dropdown

//        dropdown.selectByVisibleText("Germany");

//        Select dropdown = new Select(dropDown);
//        dropdown.selectByValue("france");

//        Select dropdown = new Select(dropDown);
//        dropdown.selectByIndex(3);

        //Capture the option from the dropdown

        List<WebElement> options = dropdown.getOptions(); //getOptions() = returns all the options from the dropdown as a WebElement
        System.out.println("Number of options in the dropdown: " + options.size());

        //Printing the option
//        for(int i = 0; i < options.size(); i++) {
//            System.out.println("Option " + (i + 1) + ": " + options.get(i).getText());
//        }

        //Enhanced for loop
        for (WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }

        driver.quit();

    }
}
