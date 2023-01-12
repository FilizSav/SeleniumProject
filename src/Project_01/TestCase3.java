package Project_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driver;

import java.util.List;

public class TestCase3 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        //System.out.println(driver.findElement(By.xpath("//div[@class='single-widget']/h2")).getText());
        List<WebElement> elements = driver.findElements(By.cssSelector("div[class='single-widget"));

        for (WebElement e : elements){
            if(driver.findElement(By.id("susbscribe_email")).isDisplayed()) System.out.println("email placeholder validation PASSED");
            if(driver.findElement(By.cssSelector("i[class*='fa fa-arrow'")).isDisplayed()) System.out.println("arrow submit validation PASSED");
            System.out.println(e.getText());
        }
        Driver.quitDriver();
    }
}
