package WaitTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
 
  public static void waitUntilElementIsVisible(WebDriver driver, int timeSeconds, By by ) {
	  
	  WebDriverWait wait = new WebDriverWait(driver, timeSeconds);
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	  
  }
 public static void waitTillAnAlertIsPresent(WebDriver driver, int timeoutInSeconds) {
	 
	  WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);

	  wait.until(ExpectedConditions.alertIsPresent());
  
}
 public static void waitUntilElementIsClickable(WebDriver driver, int timeSeconds, By by ) {
	 
	 
	 WebDriverWait wait = new WebDriverWait(driver, timeSeconds);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(by));
	  
 
}
 
 public static void waitTillElementVisibleWithFluentWait(WebDriver driver,int pollingTime, int timeoutInSeconds, By by) {
	 Wait<WebDriver> wait = new FluentWait(driver)
			 .withTimeout(Duration.ofSeconds(timeoutInSeconds))
			 .pollingEvery(Duration.ofSeconds(pollingTime))
			 .ignoring(NoSuchElementException.class);
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(by));
 
}
}
