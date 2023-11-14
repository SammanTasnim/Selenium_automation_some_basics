package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class autoSuggestiveDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.via.com/hotels");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("destination")).sendKeys("lon");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> locations = driver.findElements(By.xpath("//li[@class='ui-menu-item']//span"));
		for(WebElement location : locations) {
			if(location.getText().equalsIgnoreCase("Lonavala,Maharashtra,India")) {
				location.click();
				break;
			}
		}
		// alternative
//		WebElement location = driver.findElement(By.xpath("//span[contains(text(),'Lonavala,Maharashtra,India')]"));
//		location.click();
		
		

	}

}
