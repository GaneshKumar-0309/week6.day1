package week6.day1Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		
		WebDriverManager.chromedriver().setup();
		 
		 //Launch the browser (chrome)
		 
		 driver = new ChromeDriver();
		 
		//Load the URL:
		 
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 
		 //Maximize the browser
		 
		 driver.manage().window().maximize();
		 
		 //Adding implicit waits
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Enter UserName and Password Using Id Locator
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		//Click on Login Button using Class Locator
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		
		driver.quit();
	}

}
