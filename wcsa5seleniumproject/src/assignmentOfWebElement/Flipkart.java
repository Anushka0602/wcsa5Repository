package assignmentOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='X']")).click();
		driver.findElement(By.name("q")).sendKeys("Hp Laptop");
		
		driver.findElement(By.xpath("button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']following-sibling::div[text()='HP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
		List<WebElement> priceOfLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class'_3pLy-c row']/descendant::div[@class='_30jeq3_1_WHN1']"));
		Thread.sleep(2000);
		
		for(int i=0; i<laptops.size(); i++)
		{
		    String op = laptops.get(i).getText();
		    
		    for(int j=i; j<=i; j++) 
		    {
		    	String ops = priceOfLaptops.get(j).getText();
		    	System.out.println(op+"  :  "+ops);
		    	Thread.sleep(2000);
		    }
		    
		    System.out.println();
		}
	}
}