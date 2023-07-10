package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuiteMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://omayo.blogspot.com/");
		
		//click on the link for chile browser
		driver.findElement(By.linkText("Open a popup window"));
		Thread.sleep(2000);
		
		//Close parent as well as child browser
		driver.quit();

	}

}
