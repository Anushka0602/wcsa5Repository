package windowHandleAndWindowHandlesAssignment;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildBrowser {

	public static void main(String[] args) {
		//Que4.How to close only child browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);

		//launch the child window
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		
		Point elementLoc = childWindow.getLocation();
		int xasix = elementLoc.getX();
		int yasix = elementLoc.getY();
		
		//scroll till open a popup window link
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
		
		//Click on link to open a child browser
		childWindow.click();
		
		//get the address or handle of parent window
		String parentHandle = driver.getWindowHandle();
		
		//get the address or handle of parent and child window
		Set<String> allHandles = driver.getWindowHandles();
		
		//how to close only child browser...
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh).close();
				break;
			}
		}

	}

}
