package NewAutomationProject.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	

	public void TestGoogle() throws Exception{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}
	@Test
	public static void main(String args[]) throws Exception
	{
		
		FirstTest ft = new FirstTest();
	
		ft.TestGoogle();
		
	}

}
