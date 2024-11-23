package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrApp {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//Choosing cinema and booking ticktes
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("(//span[text()='Select Movie'])")).click();
		driver.findElement(By.xpath("INOX Vishaal De Mal,Madurai Madurai")).click();
		driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		driver.findElement(By.xpath("//div[@id='date']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("(//span[text()='AMARAN'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='12:40 PM']")).click();
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[text()=12'])[3]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//Printing the seat information
		String seat=driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
		System.out.println("The seat info is:" +seat);
		
		//Printing the total cost
		String cost=driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println("The total cost is:" +cost);
		
		//Proceeding further and closing the popup
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//printing the title of the page
		String title=driver.getTitle();
		System.out.println("The title of the current page is:" +title);
		
		Thread.sleep(1000);
		driver.close();
		
}

}


		
		
		
	
	
	
	
	

		
		
		