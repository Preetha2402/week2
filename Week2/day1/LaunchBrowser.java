package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		//Initialize the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Getting the Facebook page
		driver.get("https:www.facebook.com");
		
		//Maximize & Close
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		driver.close();
		
	}

}
