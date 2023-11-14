package dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class lmsUIUTestNG {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver.get("http://lms.uiu.ac.bd/");
	}
	
	@DataProvider(name = "datas")
	public static Object[][] before(){
		return new Object[][]{
			{"446464","54456"},
			{"011201107","54456"},
			{"555555","5456"},
			{"464","help"}
		};
	}
	
	@Test(dataProvider = "datas")
	public void test(String id, String password) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(id);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
//	@AfterClass
//	public void quit() {
//		driver.quit();
//	}
	
}
