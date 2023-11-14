package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class railwayEticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://eticket.railway.gov.bd/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/div[@id='main_wrapper']/div[9]/div[1]/div[2]/div[2]/button[1]")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("dest_from")).sendKeys("dhaka");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// listing destinations : from
		List<WebElement> fromValues = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for(WebElement fromValue : fromValues) {
			if(fromValue.getText().equalsIgnoreCase("Dhaka")) {
				fromValue.click();
				break;
			}
		}
		
		driver.findElement(By.id("dest_to")).sendKeys("Chattogram");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// listing destinations : to
		List<WebElement> toValues = driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));
		for(WebElement toValue : toValues) {
			if(toValue.getText().equalsIgnoreCase("chattogram")) {
				toValue.click();
				break;
			}
		}
		
		// Calendar 
		driver.findElement(By.xpath("//input[@id='doj']")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[normalize-space()='17']")).click();
		
		// selecting class
		driver.findElement(By.id("choose_class")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[3]/div[1]/form[1]/ul[1]/div[2]/div[2]/div[1]/select[1]/option[2]")).click();
		
		// clicking to the search button
		driver.findElement(By.xpath("//button[normalize-space()='Search Trains']")).click();
	}

}
