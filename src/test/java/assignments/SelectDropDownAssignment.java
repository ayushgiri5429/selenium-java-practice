package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectDropDownAssignment {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

        // Country Dropdown
        WebElement countryList = driver.findElement(By.id("country-list"));

        Select select = new Select(countryList);
        select.selectByVisibleText("Brazil");

        // Print Country Options
        List<WebElement> options = select.getOptions();
        System.out.println("Total Countries = " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Wait for State dropdown to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("state-list"), "Santa Catarina"));

        // State Dropdown
        WebElement stateList = driver.findElement(By.id("state-list"));

        Select select2 = new Select(stateList);
        select2.selectByVisibleText("Santa Catarina");

        driver.quit();
    }
}