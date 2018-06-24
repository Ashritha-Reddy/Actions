package banana;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word to search");
		String x=sc.nextLine();
		
		System.out.println("enter expected suggestion");

		String y=sc.nextLine();
		System.setProperty("webdriver.gecko.driver", "C:\\testing1\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
        Thread.sleep(5000);		
        WebElement e=driver.findElement(By.id("q"));
       Actions a=new Actions(driver);
       
        

		
		
		
		
	}

}
