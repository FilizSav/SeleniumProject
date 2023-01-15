package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver() {
       if(driver == null) {
           System.setProperty("webdriver.chrome.driver", "/Users/filizsav/IdeaProjects/selenium_initial_project_5/chromedriver");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
       } return driver;
    }

    public static void quitDriver(){
        driver.quit();
        driver = null;
    }

}
