package NewAutomationProject.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //System.out.println( "Hello World!" );
    	System.setProperty("webdriver.edge.driver","C:\\Users\\padhy\\eclipse-workspace\\Automation\\Driver\\msedgedriver.exe");
    	WebDriver driver=new EdgeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.goodreads.com/ap/signin?openid.return_to=https%3A%2F%2Fwww.goodreads.com%2Fap-handler%2Fregister&prevRID=SRKC395GDCWK8H5WRGKR&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_goodreads_web_na&openid.mode=checkid_setup&siteState=31acd61d811267635663be4260465d7b&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=amzn_goodreads_web_na&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("bugmeharder@mailinator.com");
    	driver.findElement(By.name("password")).sendKeys("bugmeharder");
    	driver.findElement(By.id("signInSubmit")).click();
    	Thread.sleep(3000);
    	
    	
    	
    	driver.quit();
    }
}
