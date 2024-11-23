package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Creating New Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("THAKSH");
		driver.findElement(By.name("lastName")).sendKeys("M");
		
		driver.findElement(By.name("companyName")).sendKeys("Test Leaf");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Selenium Automation Testing");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(10000);
		
		String title = driver.getTitle();
		System.out.println("Title of the Current WebPage is :" + title);
		driver.close();
		
	}


		
	}


