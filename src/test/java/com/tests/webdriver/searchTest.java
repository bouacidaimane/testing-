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
public class searchTest {
    @Test
    public  void searchtesting()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Start/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        element.sendKeys("google!");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("google!");
            }
        });
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();

    }
}
