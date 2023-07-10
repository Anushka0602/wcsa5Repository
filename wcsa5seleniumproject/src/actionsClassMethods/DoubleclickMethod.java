package actionsClassMethods;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleclickMethod {

	public static void main(String[] args) throws InterruptedException {
		//Use to perform Double Click
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=fjg7tron3ffg");
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
         
		//Perform Login Operation
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("liginButton")).click();
		
		//HomePage
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		//Click on setting Module..
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
		//Click on logo and colour
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		
		//Click on use custom logo
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		
		//Click on button to select the file
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		//Perform Double Click
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
