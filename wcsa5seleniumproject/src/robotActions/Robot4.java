package robotActions;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot4 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  //Implicit wait
		//Launch Bluestone
		driver.get("https://www.bluestone.com/");
		
		//Handle Hidden division popup
		driver.findElement(By.id("denyBtn")).click();
		
		//Move to Watch jewellery
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery '] "));
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(2000);
		
		//Click and hold Filter By text
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		
		for(int i=1; i<=2; i++)
		{
			act.doubleClick(target2).perform();
			act.clickAndHold(target2).perform();
		}
		Thread.sleep(4000);
		//Copy the Filter By text
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_C);
	    
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_C);
	    
	    //identify the search box
	    driver.findElement(By.id("//input[@id='search_query_top_elastic_search']")).click();
	    
	    //Paste the filter by text
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    
	    
		
      
	}

}//input[@class='form-text typeahead']--->for spacebar
 //input[@class='button']--->for search icon
