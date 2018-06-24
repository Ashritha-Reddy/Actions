package banana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropbyxandy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		//automate horizontal slider
		
		WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/span"));
		int x1=e1.getLocation().getX();
		int y1=e1.getLocation().getY();
		Actions a=new Actions(driver);
		a.dragAndDropBy(e1, x1+100, y1).build().perform();
		
		
		Thread.sleep(5000);
		
		
		a.dragAndDropBy(e1,x1-100,y1).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//click link
		
		
		driver.findElement(By.linkText("Vertical slider")).click();
		
		Thread.sleep(5000);
		
		
driver.switchTo().frame(0);
		
		//automate vertical slider
		
		WebElement e11=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		int x11=e11.getLocation().getX();
		int y11=e11.getLocation().getY();

		a.dragAndDropBy(e11, x11, y11+100).build().perform();
		
		
		Thread.sleep(5000);
		
		
		a.dragAndDropBy(e11,x11,y11-200).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
