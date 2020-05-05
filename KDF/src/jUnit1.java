import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class jUnit1 {

	public static void main(String[] args) throws InterruptedException {
        
		//Southwest Airlines
		System.out.println("Start my Test");
		
		System.out.println("Launch Chrome Browser");
		WebDriver myDriver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthy\\ITelearn-Projects\\Selenium-Nov2019\\Drivers\\chromedriver.exe");
		myDriver=new ChromeDriver(); // Create a new session
        myDriver.manage().window().maximize();  //Maximize
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
        
        
        System.out.println(" Go to AUT");
        
        myDriver.navigate().to("https://www.southwest.com/");
        
        //TC001
        
         myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();
         myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("SAN");
        //To clear a textfield
        //myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
        //myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
        
                
         myDriver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("SFO");
         myDriver.findElement(By.id("LandingAirBookingSearchForm_departureDate")).click();
         myDriver.findElement(By.xpath("//button[@aria-label='Wednesday, May 6 2020']")).click();
         Thread.sleep(2000);
         myDriver.findElement(By.id("LandingAirBookingSearchForm_returnDate")).click();
         myDriver.findElement(By.xpath("//button[@aria-label='Tuesday, May 12 2020']")).click();
         
         //myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
         myDriver.findElement(By.xpath("//input[@aria-label='Passengers count. Opens flyout.']")).click();
         myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount--item-2")).click();
         
         myDriver.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();
        
        
       /*
        //TC002
        myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();
        
        myDriver.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();
        
        myDriver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("LAX");
        
        myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();     
       
        myDriver.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();
        
        System.out.println("End my Test");
        */
	}

}
