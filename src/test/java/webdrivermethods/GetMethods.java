package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //We can access these methods through webdriiver instance.

        //geturl() = opens the url on the browser
        driver.get("https://www.saucedemo.com/");

        //getTitle() = returns the title of the page
        driver.getTitle();
        System.out.println("Title: " + driver.getTitle());

        //getCurrentUrl() = returns URL of the page
        driver.getCurrentUrl();
        System.out.println("Current Url: " + driver.getCurrentUrl());

        //getWindowHandle() = returns ID of the single browser window
        driver.getWindowHandle();
        System.out.println("Window Handle: " + driver.getWindowHandle());

        //getWindowHandles() = return ID's of the multiple browser window
        driver.getWindowHandles();
        System.out.println("Window Handles: " + driver.getWindowHandles());

        //getPageSouce() = returns souce code of the page
        driver.getPageSource();
        System.out.println("Page Source: " + driver.getPageSource());

    }
}
