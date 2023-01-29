package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SampleTask {
	
	WebDriver driver;	
	
		public SampleTask(WebDriver driver) {
			
			this.driver = driver;
			
			
		}
	
		
		By intval = By.xpath("//input[@id=\"number\"]");
		
		By Calculate = By.xpath("//button[@type=\"submit\"]");
		
		By verify = By.xpath("//p[text()=\"The factorial of 5 is: 120\"]");
		
		
		



		public void EnterValue() throws InterruptedException {
			// TODO Auto-generated method stub
			
			driver.findElement(intval).sendKeys("5");
			Thread.sleep(500);
			driver.findElement(Calculate).click();
			
		}

}
