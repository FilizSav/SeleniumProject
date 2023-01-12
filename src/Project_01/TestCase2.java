package Project_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args){

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        List<WebElement> elements = driver.findElements(By.cssSelector("ul[class*='nav navbar-nav'"));

        for (WebElement e : elements){
            if(e.isDisplayed()) System.out.println("Display Validation Passed");
            if(e.isEnabled()) System.out.println("Enabled Validation Passed");
            System.out.println(e.getText());
        }

        Driver.quitDriver();
    }
}
