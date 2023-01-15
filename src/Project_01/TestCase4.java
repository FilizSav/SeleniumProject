package Project_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driver;

import java.util.List;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");
        WebElement footer = driver.findElement(By.xpath("//p[@class='pull-left']"));
        if(footer.isDisplayed()) System.out.println("Footer validation PASSED \n" + footer.getText());
        else System.out.println("Footer validation FAILED");
        Driver.quitDriver();
    }
}
