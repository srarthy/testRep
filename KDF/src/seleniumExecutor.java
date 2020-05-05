import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExecutor {
    static WebDriver myDriver;
	public static void runTestStep(String fKW, String fEID, String fTD) {
	    // myDriver = fDriver;
	     
	     if (fKW.equals("openBrowser")) {
	    	openBrowser(fTD); 
	     } 
	     	else if (fKW.equals("closeBrowser")) {
	     		closeBrowser();
	        } 
	            else if (fKW.equals("navigateBrowser")) {
	    	        navigateBrowser(fTD);
	            }else {
	            	System.out.println("~~~~~~~~~~~~~~~Missing Keyword~~~~~~~~~~~~~");
	            }
	     
	}
	 public static void openBrowser(String browserType) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthy\\ITelearn-Projects\\Selenium-Nov2019\\Drivers\\chromedriver.exe"); 
		    myDriver = new ChromeDriver();		
	 }
	 
	 public static void navigateBrowser(String fURL) {
		 myDriver.navigate().to(fURL);
	 }
	 
	 
	 public static void closeBrowser() {
		 myDriver.close();
	 }
	 
	 
}
