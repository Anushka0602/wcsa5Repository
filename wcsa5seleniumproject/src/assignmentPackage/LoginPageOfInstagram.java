package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfInstagram {
 	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //maximize the web browser
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("admin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='word']")).sendKeys("anu1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='ap']")).click();

	}

}
