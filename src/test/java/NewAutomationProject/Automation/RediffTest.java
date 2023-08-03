package NewAutomationProject.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;



public class RediffTest {

	

	//@SuppressWarnings("deprecation")
	@Test
	public void redifTest() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\padhy\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.wait(5000);
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String abc = driver.getTitle();
		//Assert.assertEquals(abc, "Facebook – log in or sign up");
		Assert.assertEquals("it is working",abc, "Facebook – log in or sign up");
		System.out.println("Gorila");

		//Assert.a
		//Assert.assertEquals(abc,"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		driver.quit();
		
	}
}
