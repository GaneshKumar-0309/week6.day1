package week6.day1Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseClass {

	@Test(groups = {"UpdateLead"},enabled = false)
	public void deleteLead() throws InterruptedException {

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

		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Ganesh Kumar");


		//10	Click find leads button

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(3000);

		//11	Capture lead ID of First Resulting lead

		String leadid = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).getText();

		System.out.println("The first resulting lead is : "+leadid);

		// 12 Click on first resulting lead

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();

		//13	Click Delete

		driver.findElement(By.linkText("Delete")).click();

		//14	Click Find leads

		driver.findElement(By.linkText("Find Leads")).click();

		//15	Enter captured lead ID

		//label[text()='Lead ID:']/following::input

		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(leadid);

		//16	Click find leads button

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion

		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(text2.contains("No records")) {
			System.out.println("Successfully deleted");
		}
		else {
			System.out.println("Unsuccessful");



		}

	}
}
