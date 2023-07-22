package project5testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class TestngExample {

    protected WebDriver driver;

    @BeforeTest
    @Parameters ({"browser"}) 
    public void Setup(String browser) {
        if (browser.contains("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        if (browser.contains("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
    }
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://keytorc.com");
    }
  
    @Test
    public void test1(){
        driver.findElement(By.xpath("//a[@href='/blog']")).click();
    }  @Test
    public void test2(){
        driver.findElement(By.xpath("//a[@href='/test-yayinlari']")).click();
    }

    @AfterTest()
    public void afterTest()  {
        driver.quit();
    }

}
