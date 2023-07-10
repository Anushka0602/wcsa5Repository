package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/AlertPupup.html");
		
		//To generate Pop up click on Button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//handle alert popup by using Robot Class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		 
		//handle Alert popup by using switchTo()
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
	//	al.accept();  //For accept the alert Popup--return type of accept is void
	//	al.dismiss(); //For dismiss the alert Popup--return type-void
		System.out.println(al.getText());

	}

}
