package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfSpiceJet {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akash@5566");
		
		driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();
		
		}

	}
