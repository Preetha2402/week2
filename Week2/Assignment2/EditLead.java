package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	private static WebElement WebElement;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Finding the Xpaths to the necessary fields
		driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Preetha");
		driver.findElement(By.xpath("//input[contains(@id ,'lastName')]")).sendKeys("D");
		driver.findElement(By.xpath("//input[contains(@id ,'firstNameLocal')]")).sendKeys("Preetha");
		driver.findElement(By.xpath("//input[contains(@name ,'departmentName')]")).sendKeys("ECE");
		driver.findElement(By.xpath("(//textarea[@class ='inputBox'])[1]")).sendKeys("Automation Tester");
		driver.findElement(By.xpath("(//input[@class ='inputBox'])[20]")).sendKeys("preethanjali.d@gmail.com");
		
		WebElement = driver.findElement(By.name("generalStateProvinceGeoId"));
		
		Select state=new Select(WebElement) ;
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();  //created lead
		driver.findElement(By.linkText("Edit")).click(); //Edit Lead
		
		//Cleared the existing description 
		WebElement user = driver.findElement(By.name("description"));
		user.sendKeys("Automation Tester");
		user.clear();
		user.sendKeys("Emerging Tester");
		
		//Updated the Lead
		driver.findElement(By.name("importantNote")).sendKeys("Creative Tester");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Prints the title of webpage
		String title = driver.getTitle();
		System.out.println("Title of the  WebPage is :" + title);
		
		Thread.sleep(10000);
		driver.close();
		
	
	}


		
	}


