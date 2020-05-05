import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SW1 {

	   WebDriver myDriver;
	   
	   @Before
	   public  void myBeforeTest() throws InterruptedException {
		   // @Before gets executed before every test
		    System.out.println(">>>>>>>>>>This is Before my Test>>>>>>>>>>>");
			System.out.println("Launch Chrome Browser");
			
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthy\\ITelearn-Projects\\Selenium-Nov2019\\Drivers\\chromedriver.exe"); 
		    myDriver = new ChromeDriver();		
	        myDriver.manage().window().maximize();  //Maximize
	        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
	        System.out.println("3 Go to AUT");
	        myDriver.navigate().to("https://www.southwest.com/");
	        Thread.sleep(2000);
	   }
	   
	   @Test    // This is one of my tests
	   
	   public  void myTest1() throws InterruptedException {
		    System.out.println("This is my Test1");
		    myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("ABCD");
	        //To clear a textfield
	        //myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
	        //myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
	        
	                
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("EFGH");
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_departureDate")).click();
	         
	        /* myDriver.findElement(By.xpath("//button[@aria-label='Thursday, April 30 2020']")).click();
	         Thread.sleep(2000);
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_returnDate")).click();
	         myDriver.findElement(By.xpath("//button[@aria-label='Tuesday, May 12 2020']")).click();
	         
	         //myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
	         myDriver.findElement(By.xpath("//input[@aria-label='Passengers count. Opens flyout.']")).click();
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount--item-2")).click();
	         
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();
		    */
	        
	   }
	   
	   @Test    // This is one of my tests
	   public  void myTest2() throws InterruptedException {
		    System.out.println("This is my Test2");
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
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount--item-4")).click();
	         
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();
		    
	        
	   }
	   
	   @Test    // This is one of my tests
	   public  void myTest3() throws InterruptedException {
		    System.out.println("This is my Test3");
		    myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("JFK");
	        //To clear a textfield
	        //myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
	        //myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
	        
	                
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("CUN");
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_departureDate")).click();
	         myDriver.findElement(By.xpath("//button[@aria-label='Saturday, May 2 2020']")).click();
	         Thread.sleep(2000);
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_returnDate")).click();
	         myDriver.findElement(By.xpath("//button[@aria-label='Saturday, May 9 2020']")).click();
	         
	         //myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
	         myDriver.findElement(By.xpath("//input[@aria-label='Passengers count. Opens flyout.']")).click();
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount--item-6")).click();
	         
	        // myDriver.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();
		    
	   }
	   
	   @Test    // This is one of my tests
	   public  void myTest4() throws InterruptedException {
		    System.out.println("This is my Test4");
		    myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("ABCD");
	        //To clear a textfield
	        //myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
	        //myDriver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
	        
	                
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("EFGH");
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_departureDate")).click();
	         myDriver.findElement(By.xpath("//button[@aria-label='Wednesday, May 6 2020']")).click();
	         Thread.sleep(2000);
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_returnDate")).click();
	         myDriver.findElement(By.xpath("//button[@aria-label='Tuesday, May 12 2020']")).click();
	         
	         //myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
	         myDriver.findElement(By.xpath("//input[@aria-label='Passengers count. Opens flyout.']")).click();
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount--item-6")).click();
	         
	         myDriver.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();
			   
		    
	   }
	   @After   // gets executed after every test
	   
	   public  void myAfterTest() {
		   myDriver.close();
		   System.out.println("This is After my Test");
		   
	   }
}
