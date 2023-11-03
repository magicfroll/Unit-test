package test;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class SeleniumTest {

    @Test
    void seleniumTest() {
        System.setProperty("webdriver.chrome.driver",
                "D:/programs/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        searchBox.submit();
        List<WebElement> searchresult = driver.findElements(By.cssSelector("div"));
        boolean isFind = false;
        for (WebElement ls:searchresult) {
            if (ls.getText().contains("https://www.selenium.dev")) {
                isFind = true;
                break;
            };
        }
        assertTrue(isFind);
        driver.quit();
    }

    @Test
    void seleniumTest2() {
        System.setProperty("webdriver.chrome.driver",
                "D:/programs/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement button = driver.findElement(By.id("login-button"));
        button.click();
        WebElement productTitle = driver.findElement(By.className("title"));
        assertEquals("Products", productTitle.getText());
        driver.quit();
    }
}
