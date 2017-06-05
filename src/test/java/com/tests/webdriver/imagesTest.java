package com.tests.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Hemo on 5/28/2017.
 */
public class imagesTest {
    @Test
    public  void images()
    {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Start/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com/");
        WebElement image = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a"));
        image.click();
        Assert.assertTrue("title should start differently",
                driver.getTitle().startsWith("Google"));

        driver.close();
    }
    @Test
    public  void dropdwonlist()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Hemo/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com/");
        WebElement googleapps = driver.findElement(By.xpath(" //*[@id=\"gbwa\"]/div[1]/a"));
        googleapps.click();
        WebElement map= driver.findElement(By.xpath("//*[@id=\"gb8\"]/span[1]"));
        map.click();
        driver.quit();



    }
}
