package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practiceSuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mawbiz.com.bd/Bangla.Air.Services.BD");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//input[@id='search_item']")).sendKeys("Dhaka");
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    List<WebElement> whatLocations = driver.findElements(By.xpath("//body/ul[@id='ui-id-1']/li//div"));
	    for(WebElement whatLocation : whatLocations) {
	    	if(whatLocation.getText().equalsIgnoreCase("A. G. Church School Dhaka")) {
	    		whatLocation.click();
	    		break;
	    	}
	    }
	    driver.findElement(By.xpath("//input[@id='where']")).click();
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    
	}

}
