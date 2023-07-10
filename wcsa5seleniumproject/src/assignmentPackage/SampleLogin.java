package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/SampleLogin.html");
		
		//Absolute xPath
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("AnushkaSayare");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("anus@123");

	}

}
