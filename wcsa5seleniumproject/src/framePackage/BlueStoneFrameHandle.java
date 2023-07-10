package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlueStoneFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chhrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		//Handle hidden division popup
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		//Identify frame by using xpath
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		//Hanmdle the frame by switch the contriols to frame...
	//	driver.switchTo().frame(5);   //Handle frame by using index
	//	driver.switchTo().frame("fc_widget");  //handle frame by using nameOrId
		driver.switchTo().frame(frameElement);
		
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();		
		
//      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='chat-icon']"))).click();
		
		//switch the controls again again back to the main webpage...
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("chat-fc-name")).sendKeys("Anushka");
	    driver.findElement(By.id("chat-fc-email")).sendKeys("anu@123");
	    driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");

		
		
		
	}

}//try with xpath 
//try with javascript executor
// 3 methyods from the method overloading and 2 are tghe
//parentframe--switch tye control to parent frame
//defaultContent---switch the control to the current frame to directly main web page
