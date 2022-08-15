package week6.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BaseClass {

	@Test(groups = {"UpdateLead"},dependsOnMethods = "week6.day1Assignments.CreateLead.createlead",priority = 2)
	public void duplicateLead() throws InterruptedException {
		 
		 //Click on CRM/SFA Link
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();

		 Thread.sleep(3000);
		 
		 //Click on Leads Button
		 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 Thread.sleep(3000);
		 
		 //Click on Create Lead
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 Thread.sleep(3000);
		 
		 //Enter CompanyName Field Using id Locator
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Volante");
		 
		 Thread.sleep(3000);
		 
		 //Enter FirstName Field Using id Locator
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ganesh Kumar");
		 
		 Thread.sleep(3000);
		 
		 //Enter LastName Field Using id Locator
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		 
		 Thread.sleep(3000);
		 
		 //Enter FirstName(Local) Field Using id Locator
		 
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ganesh Kumar");

		 Thread.sleep(3000);
		 
		 //Enter Department Field Using any Locator of Your Choice
		 
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Product Engineering");
		 
		 Thread.sleep(3000);
		 
		 //Enter Description Field Using any Locator of your choice
		 
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Payments Tester");
		 
		 Thread.sleep(3000);
		 
		 //Enter your email in the E-mail address Field using the locator of your choice
		 
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("reachganesh95@gmail.com");
		 
		 Thread.sleep(3000);
		 
		 //Select State/Province as NewYork Using Visible Text
		 
		 WebElement drop1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 
		 //Conver to select class
		 
		 Select select = new Select(drop1);
		 
		 //Select by visible
		 
		 select.selectByVisibleText("New York");
		 
		 Thread.sleep(3000);
		 
		 //Click on create button
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 //Get the Title of Resulting Page.
		 
		 System.out.println("The tiltle of the Resulting page is "+driver.getTitle());
	
		 Thread.sleep(3000);
		 
		 //Click on Duplicate button
		 
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 
		 Thread.sleep(3000);
		 
		 //Clear the CompanyName Field using .clear() And Enter new CompanyName
	
		 driver.findElement(By.id("createLeadForm_companyName")).clear();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Volante Technologies");
	
		 //Clear the FirstName Field using .clear() And Enter new FirstName
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ganesh");
		 
		 //Click on Create Lead Button
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 //Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		 
		 System.out.println("The tiltle of the Resulting page is "+driver.getTitle());
	
	}

}
