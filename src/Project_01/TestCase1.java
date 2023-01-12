package Project_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.Driver;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com");

        System.out.println(driver.findElement(By.cssSelector("img[src*='logo']")).isDisplayed());

        Driver.quitDriver();

    }
}
