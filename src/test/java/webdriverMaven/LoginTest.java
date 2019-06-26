package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void doLogin() throws Exception{
		
		driver.get("http://182.75.137.26:7777/iSafeHome/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("appsteksolutionspvtltd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/form/div[4]/button")).click();
		Thread.sleep(3000);
	}
	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
	}
	
}
