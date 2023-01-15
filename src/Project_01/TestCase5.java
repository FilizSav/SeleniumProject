package Project_01;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Driver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("(//a[@href='/test_cases'])[1]")).click();
        String mainWindow = driver.getWindowHandles().toString();
        Set<String> handles = driver.getWindowHandles();
        for (String child : handles) {
            if (!mainWindow.equalsIgnoreCase(child)) {
                driver.switchTo().window(child);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



    }
}
