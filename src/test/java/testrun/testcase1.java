package testrun;

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
	
	search.sendKeys("Microsoft");
		
		
		
	}

	finally {
	t.td(driver);
	}

	}
}
