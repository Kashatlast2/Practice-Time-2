package guru99tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTests {
	
	WebDriver driver;
	
	@BeforeClass
	public void invokeBrowser() {
		
		String currentWorkingDir = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", currentWorkingDir + "/src/main/resources/chromedriver-103");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/v4");
		
	}
	
	@Test
	public void verifyLogin() {
		
		driver.findElement(By.name("uid")).sendKeys("mngr425716");
		
		driver.findElement(By.name("password")).sendKeys("sytUbej");
	
		driver.findElement(By.name("btnLogin")).click();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}