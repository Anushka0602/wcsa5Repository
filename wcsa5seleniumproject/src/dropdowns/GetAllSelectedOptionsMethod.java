package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//To avoid illigal state exception
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/MultiSelectDropdown.html");
        
		//Identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//handle the dropdown
		Select sel = new Select(dropDownElement);
		
		//Select multiple options from dropdown
		for(int i=2; i<=5; i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		
		//TO read All selected options from the dropdown
		List<WebElement> allOpts = sel.getAllSelectedOptions();
		
		//To read List of the webElement we use loop
//		for(WebElement op:allOpts)
//		{
//			Thread.sleep(2000);
//			System.out.println(op.getText());
//	}
		
		for(int i=0; i<allOpts.size(); i++)
		{
			Thread.sleep(2000);
			System.out.println(allOpts.get(i).getText());
	}

	}

}
