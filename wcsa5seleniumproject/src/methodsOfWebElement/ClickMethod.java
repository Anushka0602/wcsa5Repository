package methodsOfWebElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ClickMethod {

	public static void main(String[] args) throws IOException {  
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/SingleSelectDropdown.html");
		
		// By storing WebElement into referance variable
		WebElement dropDown = driver.findElement(By.name("menu"));
		dropDown.click();
		
		//It is also access getScreenShotAs()
		File src = dropDown.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/dropDowns.png");
		Files.copy(src, dest);   //Files it is a third party class..it throws IOException
		
		
	    // By using Method Chaining
    //  driver.findElement(By.name("menu")).click();
	}

}
