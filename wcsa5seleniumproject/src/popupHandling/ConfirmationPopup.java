 package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/ConfirmationPopup.html");
		
     	driver.findElement(By.xpath("//input[@type='submit']")).click();
     	Thread.sleep(2000);
     	
     	//Handle Confirmation Popup
     	Alert al = driver.switchTo().alert();
   //  	al.accept();
     	al.dismiss();

	}

}

//To generate confirmation Pupup click on submit button
	//	driver.findElement(By.tagName("input")).click();
		
//		handle confirmation Popup by using switchTo()
//	    Alert al = driver.switchTo().alert();
//		al.accept();  //accept the confirmation popup
//		
//		al.dismiss(); //Dismiss the confirmation pupup
		
//		System.out.println(al.getText());
//		al.accept();
//		al.sendKeys(al.getText());     //This line throws the exception NoAlertPresentException--It is from Selenium package



















