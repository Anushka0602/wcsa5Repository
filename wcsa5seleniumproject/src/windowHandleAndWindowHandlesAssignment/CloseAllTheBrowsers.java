package windowHandleAndWindowHandlesAssignment;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTheBrowsers {

	public static void main(String[] args) throws InterruptedException {
		//Que1.How to close all the browsers
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		//launch the child window
		Thread.sleep(2000);
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		Point elementLoc = childWindow.getLocation();
		int xasix = elementLoc.getX();
		int yasix = elementLoc.getY();
		
		//Scroll till open a popup window link
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");

		
		//Click on link to open child browser
		childWindow.click();
		
		//Close the browsers
		Thread.sleep(2000);
		driver.quit();
				
		
	}

}
