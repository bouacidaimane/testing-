package com.tests.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Hemo on 5/28/2017.
 */
public class gamiltesting {//
    @Test
    public  void gmail()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/imane/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"));

        element.click();

        //driver.quit();

    }
    @Test
    public  void gmaillogin()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Start/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/gmail/about/#");
        driver.manage().window().maximize();
        WebElement signin = driver.findElement(By.xpath(" /html/body/nav/div/a[2]"));
        signin.click();
        WebElement username= driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        username.sendKeys("bouacidaimane1@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
        WebElement pasword = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        pasword.sendKeys("password");
        //driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
        //WebElement next = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span"));
        //next.click();

        driver.quit();

    }

}
