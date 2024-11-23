package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String totalresult = driver.findElement(By.xpath("(//div[@class='sg-col-inner']/div)[1]")).getText();
		
		System.out.println(totalresult);
		
		
		driver.findElement(By.xpath("(//i[contains(@class,'a-icon-checkbox')])[3]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//i[contains(@class,'a-icon-checkbox')])[2]")).click();
		
		
		driver.findElement(By.xpath("(//span[contains(@class,'declarative')])[2]")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		
		String baginfo = driver.findElement(By.xpath("//div[contains(@class,'puis-padding-right-micro')]")).getText();
		
		System.out.println(baginfo);
		
		String pagename = driver.getTitle();
		System.out.println("Current page name : "+pagename);
		
		driver.close();

			
		}

	

		
	}


