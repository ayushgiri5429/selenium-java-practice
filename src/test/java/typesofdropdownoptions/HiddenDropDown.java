package typesofdropdownoptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HiddenDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Login Steps
        WebElement userNameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userNameField.sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("admin123");

        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();

        //Select PIM option
        WebElement pimOption = driver.findElement(By.xpath("//span[text()='PIM']"));
        pimOption.click();

        //Select dropdown
        WebElement dropDownOption = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[3]"));
        dropDownOption.click();
        Thread.sleep(5000);

        //Select single option & find the common path
//        WebElement selectJobTitle = driver.findElement(By.xpath("(//div[@role='option'])[4]"));
//        selectJobTitle.click();

        //Count the option
        List<WebElement> options = driver.findElements(By.xpath("(//div[@role='option'])//span"));
        System.out.println("Number of options = " + options.size());

        //Printing the option
        for (WebElement option : options) {
            System.out.println("Option = " + option.getText());
        }

        driver.quit();

    }
}
