package banana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		
		Thread.sleep(4000);
	//	driver.findElement(By.name("q")).sendKeys("ashritha reddy");
	
	
	WebElement e=driver.findElement(By.name("q"));
	Actions a=new Actions(driver);
//	a.click(e).build().perform();
	
	
		a.sendKeys(e,"gefegsfgsejfgsjgfj").build().perform();
		
		
		
		
		
		
		
		
		Thread.sleep(9000);
		driver.close();

	}

}
