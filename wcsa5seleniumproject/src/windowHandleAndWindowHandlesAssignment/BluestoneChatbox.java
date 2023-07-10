package windowHandleAndWindowHandlesAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneChatbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chhrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
	    driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();
		
	    driver.findElement(By.id("chat-fc-name")).sendKeys("Anushka");

	}

}
