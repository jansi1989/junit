package JunitProgram;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterSelenium {
	static WebDriver driver;
	@BeforeClass
	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\3\\Desktop\\jansi\\Junit\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterClass
	public static void ClosedBrowser() {
		driver.quit();	
	}
	@Before
	public void startTime() {
		Date d=new Date(); 
		System.out.println(d);
	}
		@After
		public void endTime() {
			Date e=new Date(); 
			System.out.println(e);
		}
	@Test
	public void aTest() {
		driver.findElement(By.id("email")).sendKeys("jansi");
		driver.findElement(By.id("pass")).sendKeys("1234567a");
		
	}
	@Test
	public void bTest() {
		driver.findElement(By.id("loginbutton")).click();
		
	}
    
}
