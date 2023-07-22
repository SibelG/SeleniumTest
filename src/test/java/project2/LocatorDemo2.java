package project2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("https://www.vatanbilgisayar.com/");
		driver.manage().window().maximize(); // maximize browser window
		
		//Finding number of sliders on home page	
		List<WebElement> sliders=driver.findElements(By.cssSelector("swiper-lazy img-responsive hidden-xs lazy-init swiper-lazy-loaded"));
		System.out.println("Number of sliders:"+sliders.size());
		
		//Find Total number of images in home page
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:"+images.size());
		
		//Find total number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		
		driver.quit();
		
		
	}

}
