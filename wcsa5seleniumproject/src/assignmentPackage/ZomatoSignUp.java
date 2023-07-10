package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //maximize the web browser
		driver.get("https://www.zomato.com/india");
		
		//to Click on sign up link
		driver.findElement(By.linkText("Sign_up")).click();
		Thread.sleep(4000); 
		//To send the inputes for full name textbox
		driver.findElement(By.cssSelector("input[class='sc-1yz'")).sendKeys("AnushkaSayare");
		Thread.sleep(2000);
		// To send the inputes for gmail textbox
		driver.findElement(By.cssSelector("input[sclass=c-1yzxt5f-9 dFkpnp]")).sendKeys("anushkasayare@gmail.com");

	}

}
