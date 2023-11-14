package dropdown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// Alert handle with ok button
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		
		// Alert handle with Ok and Cancel button 
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		// Alert handle with Input field 
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alertWindow = driver.switchTo().alert();
		alertWindow.sendKeys("Selemium");
		alertWindow.accept();
		
		
	}

}
