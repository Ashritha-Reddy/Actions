package banana;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprogram {

	public static void main(String[] args) throws InterruptedException
	{
	// run chromedriver.exe to get chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\testing1\\chromedriver.exe");
	// create object to access chrome browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(10000);
		
	
		
		driver.close();
		
		
	}

	

}
