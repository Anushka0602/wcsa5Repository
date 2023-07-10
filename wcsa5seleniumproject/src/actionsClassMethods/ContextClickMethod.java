package actionsClassMethods;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		//It is Use to perform Right Click
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/SingleSelectDropdown.html");
		
		WebElement target = driver.findElement(By.id("menu"));
		
		//To perform Right Click
		Actions act = new Actions(driver);
		Thread.sleep(3000);
        act.contextClick(target).perform();
        
	}

}
