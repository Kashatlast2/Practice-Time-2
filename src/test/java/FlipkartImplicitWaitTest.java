import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartImplicitWaitTest {
	
	ChromeDriver driver;
	String url = "https://www.flipkart.com/communication-preferences/push?t=all";
	
	@BeforeClass
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", 
				"src/main/resources/chromedriver-103/");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		/* driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); */
	}
	
	@Test
	public void mouseHover() {
		
		Actions action = new Actions(driver);
		
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		action.moveToElement(electronicsLink).build().perform();
		
		WebElement samsungLink = driver.findElement(By.linkText("Samsung"));
		
		action.moveToElement(samsungLink).click(samsungLink).build().perform();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
