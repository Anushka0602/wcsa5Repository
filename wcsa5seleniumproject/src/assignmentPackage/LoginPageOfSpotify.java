package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfSpotify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spotify.com/us/signup");
		
		driver.findElement(By.id("email")).sendKeys("anushkasayare@gmail.com");

		driver.findElement(By.id("password")).sendKeys("anushkas@123");
		
		driver.findElement(By.id("displayname")).sendKeys("anushkasayare");
		
		driver.findElement(By.id("month")).sendKeys("March");
		
		driver.findElement(By.id("day")).sendKeys("07");
		
		driver.findElement(By.id("year")).sendKeys("2002");
		


	}

}
