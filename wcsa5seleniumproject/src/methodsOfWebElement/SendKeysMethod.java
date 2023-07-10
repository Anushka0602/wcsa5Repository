package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		//it is used to send inputes to text box and active element
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//identify WebElement and use methods of webElement
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("Admin");
		
		//By using Method Chaining
	//	driver.findElement(By.name("username")).sendKeys("Admin");
	}

}
