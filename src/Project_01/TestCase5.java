package Project_01;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Driver;

public class TestCase5 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");
        System.out.println(driver.findElement(By.xpath("(//a[@href='/test_cases'])[1]")).getText());

        Driver.quitDriver();



    }
}
