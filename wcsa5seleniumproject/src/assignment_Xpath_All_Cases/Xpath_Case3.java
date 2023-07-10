package assignment_Xpath_All_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Case3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='_381fS' and @name='mobile']")).sendKeys("9876543210");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='name' and @name='name']")).sendKeys("Anushka");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='_381fS' and @id='email']")).sendKeys("anushkasayare07@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();

	}

}
