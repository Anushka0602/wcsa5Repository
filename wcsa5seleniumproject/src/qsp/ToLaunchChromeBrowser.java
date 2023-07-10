package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Upcast into webdriver(I)
		WebDriver driver = new ChromeDriver(); //Launch the chrome browser
		
		//Maximise the browser
		driver.manage().window().maximize();
		
		//Provide the delay of 2 seconds
		Thread.sleep(2000);
		
		//To close the browser
		driver.close();
	}

}
