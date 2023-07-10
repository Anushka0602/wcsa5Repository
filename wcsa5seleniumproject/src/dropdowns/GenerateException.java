package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/SingleSelectDropdown.html");
        
		//Identify dropdown on WebPage
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//Handle the dropdown by creating obj of Select..
		Select sel = new Select(dropDownElement);
		
		//Select the option from dropdown
		//use selection Method
		Thread.sleep(2000);
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		//try to deselect given option from dropdown
		sel.deselectByIndex(2);  //Get the Exception- UnsupportedOperationException
	}

}
