package testrun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testcase1 {
	
	WebDriver driver;
	String URL= "https://google.com/";
	setup set = new setup();
	teardown t = new teardown();
	
	@Test
	@Parameters({"browser"})

	
	public void tc1(String browser)
	

	
	{
		
		try
		{
		
		driver =	set.Setup(browser);		
		
		driver.get(URL);
		
	WebElement search = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
	
	search.sendKeys("hello Deloitte");
	
	WebElement button = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b"));
		
	button.click();	
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement find = driver.findElement(By.linkText("Deloitte Digital Australia"));
	find.click();	
	}

		
	finally {
	t.td(driver);
	}

	}
}
