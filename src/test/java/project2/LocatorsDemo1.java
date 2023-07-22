package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LocatorsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize(); // maximize browser window
		
		//search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirts");
		
		//search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//link text & partial linktext
		driver.findElement(By.linkText("Amazon Essentials Women's Classic-Fit Short-Sleeve Crewneck T-Shirt, Multipacks")).click();
		//driver.findElement(By.partialLinkText("Printed Chiffon")).click();
		


	}

}
