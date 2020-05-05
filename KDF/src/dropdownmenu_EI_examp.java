import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdownmenu_EI_examp {

	public static void main(String[] args) {
		WebDriver myDriver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthy\\ITelearn-Projects\\Selenium-Nov2019\\Drivers\\chromedriver.exe");
		myDriver=new ChromeDriver(); // Create a new session
        myDriver.manage().window().maximize();  //Maximize
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
        
        
        System.out.println(" Go to AUT");
        
        myDriver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
        //myDriver.findElement(By.id("closeBtn")).click();
        Select drpCountry = new Select(myDriver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("BAHAMAS");
	}

}
