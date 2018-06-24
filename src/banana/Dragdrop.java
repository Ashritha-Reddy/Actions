package banana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	driver.switchTo().frame(0);
	
	
			
	
	WebElement e1=driver.findElement(By.id("draggable"));
	
	WebElement e2=driver.findElement(By.id("droppable"));
	
	Actions a=new Actions(driver);
	a.dragAndDrop(e1, e2).build().perform();
	Thread.sleep(10000);
	driver.switchTo().defaultContent();
	driver.close();
	
	
	
	
	
	}

}
