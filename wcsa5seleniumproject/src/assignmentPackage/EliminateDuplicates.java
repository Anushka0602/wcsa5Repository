package assignmentPackage;

import java.time.Duration;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/MultiSelectDropdown.html");
		
		//identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//handle the dropdown
		Select sel = new Select(dropDownElement);
		
		HashSet<String> hs = new HashSet<String>();
		
		//To get options from dropdown
		List<WebElement> allOpts = sel.getOptions();
		
		//To read options from dropdown
		for(int i=0; i<allOpts.size();i++)
		{
			WebElement op = allOpts.get(i);
			
			//get Text of WebElement and add into set
			String value = op.getText();
			
			//add the value into set that meansduplicates will not be allowed
			//insertion order wont be maintained
			hs.add(value);
		}
		
		//Read the value from set
		for(String element : hs)
		{
			Thread.sleep(2000);
			System.out.println(element);
		}
				
	}

}
