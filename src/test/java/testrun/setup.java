package testrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setup {

	 WebDriver driver;
	 //String URL = "google.com";
	
	
	public WebDriver Setup(String browser) 
	
	
	{
		// TODO Auto-generated method stub
		
		
		
		
		WebDriverManager.chromedriver().setup();
	 	driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		
		return driver;


	}

	
}
