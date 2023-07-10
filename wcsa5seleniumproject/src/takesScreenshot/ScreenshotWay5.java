package takesScreenshot;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay5 {

	public static void main(String[] args) throws IOException {
		//By using EventFiringWebDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");
		
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);//deprecatedm it is a class..it use very less
        File src = efw.getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshots/Screenshot5.png");
        Files.copy(src, dest);
		
	}

}//File not fount it is a run time unchech
//Io it is chechk
