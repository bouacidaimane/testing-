package com.tests.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Hemo on 5/28/2017.
 */
public class pagetest {
    @Test
    public  void interfaceTest()
    {
        //getTitle
        System.setProperty("webdriver.chrome.driver", "C:/Users/Start/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com/");
        Assert.assertTrue("title should start differently",
                driver.getTitle().startsWith("Google"));

        driver.close();
    }
}
