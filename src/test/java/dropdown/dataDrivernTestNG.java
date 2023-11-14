package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataDrivernTestNG {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.driver.chrome",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@DataProvider(name = "create")
	public Object[][] dataSet(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"locked_out_user","secret_sauce"}
		};
	}
	
	@Test(dataProvider = "create")
	public void loginTest(String username, String password) {
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.quit();
	}

}
