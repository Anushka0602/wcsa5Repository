package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/SampleLogin.html");
		Thread.sleep(2000);
	    //tagName
		driver.findElement(By.tagName("input")).sendKeys("admin"); //usewrname
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("manager"); //password

        driver.findElement(By.id("n1")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.id("n2")).sendKeys("manager");
        
        //name
//        driver.findElement(By.name("n1")).sendKeys("admin");
//        driver.findElement(By.name("n2")).sendKeys("manager");
        
        //classname
        driver.findElement(By.className("cla1")).sendKeys("admin");
        driver.findElement(By.className("cla1")).sendKeys("manager");
	}

}
