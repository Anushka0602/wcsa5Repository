package takesScreenshot;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay3 {

	public static void main(String[] args) throws IOException {
		//By creating Object of browser specific classes
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
		RemoteWebDriver cdriver = (RemoteWebDriver)driver;
        File src = cdriver.getScreenshotAs(OutputType.FILE);
		
	    File dest = new File("./screenshots/screenshot3.jpg");
		
		Files.copy(src, dest);
		

	}

}
