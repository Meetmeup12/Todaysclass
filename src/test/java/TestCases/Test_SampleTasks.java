package TestCases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.SampleTask;

public class Test_SampleTasks  extends BaseClass{
	SoftAssert softAssert = new SoftAssert();
	By verify = By.xpath("//p[text()=\"The factorial of 5 is: 120\"]");
	@Test()
	
	public void intVal() throws InterruptedException {
		
		SampleTask intVal = new SampleTask(driver);
		
		intVal.EnterValue();
		softAssert.assertTrue("The factorial of 5 is: 120".equals(""));
				
		softAssert.assertEquals("The factorial of 5 is: 120", verify);
		System.out.println(verify);
	}
	

}
 