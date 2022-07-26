

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTest{
	
	ChromeDriver driver;
	String url = "https://amazon.com";
	
	@BeforeClass
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-103/");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
	}
	
	@Test
	public void verifyTitleOfHomePage() {
		
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}