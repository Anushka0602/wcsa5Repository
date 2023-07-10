package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLogin1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/SampleLogin.html");
		
		//Relative xpath
		driver.findElement(By.xpath("//input[@id='n1'")).sendKeys("AnushkaSayare");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='n2'")).sendKeys("AnushkaSayare");
	}
}
		

	