package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_input_text");
		driver.manage().window().maximize();
		
		//Switching to iframe and getting back to parent frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/input[1]")).sendKeys("AZ");
		driver.switchTo().parentFrame();
		

	}

}
