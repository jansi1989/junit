package JunitProgram;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selewithjunit {
	static WebDriver driver;
	@BeforeClass
	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\3\\Desktop\\jansi\\Junit\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("facebook"));
		Assert.assertEquals("https://www.facebook.com/", url);
		String t = driver.getTitle();
		Assert.assertTrue(t.contains("Facebook"));
	}
	@AfterClass
	public static void ClosedBrowser() {
		driver.quit();	
	}
	@Before
	public void startTime() {
		Date d=new Date(); 
		System.out.println("start:" +d);
	}
		@After
		public void endTime() {
			Date e=new Date(); 
			System.out.println("end:" +e);
		}
	@Test
	public void aTest() {
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("jansi");
	String e = email.getAttribute("value");
	System.out.println("Email:" +e);
	Assert.assertEquals("jansi", email);
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("1234567a");
	String p = pass.getAttribute("value");
	System.out.println("Password:" +p);
	Assert.assertEquals("1234567a",pass);
	}
	@Test
	public void bTest() {
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
