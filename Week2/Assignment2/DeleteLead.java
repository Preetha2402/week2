package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	
		//Finding the leads by using Xpaths
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		
		//finding leads by using phone number
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
			driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
			driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("70");
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7094616724");
			driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
			
			//Printing the msg that has no records to the number
			String message = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			System.out.println("The given Message is:"+ message);
		
		
		//Capture the lead ID of the Existing resulting lead
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//input[@name= 'id']")).sendKeys("14203");
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text() ='17320']")).click();
		
		//Using get text attribute prints the ID
		String id = driver.findElement(By.xpath("//span[text()='TestLeaf (17320)']")).getText();
		System.out.println("The First ID of the Lead is:"+id);

		//Delete the lead
		driver.findElement(By.linkText("Delete")).click();
		
		//Check the deleted lead 
		driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//input[@name= 'id']")).sendKeys("17320");
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		
		//Printing the msg that has no records to the deleted lead
		String msg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println("The given Message is:"+ msg);
		if (msg.contains("No records to display"))
		{
			System.out.println("Account Deleted Successfully");
		}else
		{
			System.out.println(" UnSuccessful");
		}	
		
		
	}


		
	}


