package week6.day1Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass {

	@Test(groups = {"UpdateLead"},dependsOnMethods = "week6.day1Assignments.CreateLead.createlead",priority = 1,alwaysRun = true)
	public void editLead() throws InterruptedException {
		
		// 5	Click crm/sfa link
		
		//a[contains(text(),'CRM/SFA')]
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		// 6	Click Leads link
		
		//a[text()='Leads']
		
		driver.findElement(By.linkText("Leads")).click();
		
		// 7	Click Find leads
		
		//a[text()='Find Leads']
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		// 8	Enter first name
		
		//input[@class=' x-form-text x-form-field ']
		
		//driver.findElement(By.className(" x-form-text x-form-field ")).sendKeys("Ganesh Kumar");
		
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Ganesh Kumar");
		
		// 9	Click Find leads button
		
		//button[text()='Find Leads']
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		// 10 Click on first resulting lead
		
		//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		
		// 11 Verify title of the page
		
	     //get title
		
		System.out.println("The Title of the page is : "+driver.getTitle());
		
		//12 Click Edit
		
		//a[text()='Edit']
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//13 Change the company name
		
		//input[@id='updateLeadForm_companyName']
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Volante Technologies Pvt Limited");
		
		//14 Click Update
		
		//input[@class='smallSubmit'])[1]
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		
		//15 Confirm the changed name appears
		
		//td[@id='viewLead_companyName_sp']
		
		String Name = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println("The Company Name is : "+Name);
		
		if (Name.contains("Volante Technologies Pvt Limited")) {
			
			System.out.println("Company Name Succesfully changed");
			
		} else {

			System.out.println("The Company Name is not changed");
		}
		
		
	}

}
