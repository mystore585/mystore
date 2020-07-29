package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginPage 
{
	@Test
	public static void url()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\workspace\\MyStore\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
	}

}
