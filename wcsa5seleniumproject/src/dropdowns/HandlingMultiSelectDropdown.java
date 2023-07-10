package dropdowns;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/MultiSelectDropdown.html");
        
        WebElement multiSelectDD = driver.findElement(By.id("menu"));
        Select sel = new Select(multiSelectDD);
        
        //To selectn using Index
        sel.selectByIndex(1);
        Thread.sleep(2000);
        
        //To select using Visible Text
        sel.selectByVisibleText("Pani Puri");
        Thread.sleep(2000);
        
        //To select using Value
        sel.selectByValue("v5");
        
        //To deselect using Index
        sel.deselectByIndex(3);
        Thread.sleep(2000);
        
        //To deselect using Visible Text
        sel.deselectByVisibleText("Misal Pav ");
        Thread.sleep(2000);
        
        //To deselect using Value
        sel.deselectByValue("v5");
        Thread.sleep(2000);
        
        //To select multiple options
        for(int i=0; i<5; i++) 
        {
           sel.selectByIndex(i);
           Thread.sleep(1000);
        }
        Thread.sleep(3000);
        
//        for(int i=0; i<5; i++)
//        {
//        	sel.deselectByIndex(i);
//        	Thread.sleep(1000);
//        }
//        
        
        //To deslect All options usinf deselectAll()
        sel.deselectAll();
	}

}


