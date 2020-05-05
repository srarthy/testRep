import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KDF_Driver2 {
  //Global Class Variables
  String xTC[][],xTS[][];
  String xlPath="C:\\Users\\Arthy\\Documents\\JobSearch_Testing\\arthy_ job_search\\software_testing _itelearn\\Selenium\\Selenium_with_Java nov2019\\KDF\\KDF_SW.xls";
  int xTC_r,xTS_r;
  String xTC_TCID,xTC_Execute;
  String xTS_TCID,xTS_KW,xTS_EID,xTS_TD;
  
  @Before
  public void myBefore() throws Exception{
	//Read the Excel into a 2-D Array of type string
	  System.out.println("---------------Starting to Read Excel------------------------");
	  xTC = Utilities.readXL(xlPath,"TestCases");
	  xTS = Utilities.readXL(xlPath,"TestSteps");
	  
	  xTC_r = xTC.length;
	  System.out.println(">>>>>>>>>>>>>> Number of Test Cases" + xTC_r);
	  
	  xTS_r = xTS.length;
	  System.out.println(">>>>>>>>>>>>>> Number of Test Steps" + xTS_r);
	  
	  System.out.println("---------------Done Reading Excel-----------------------------");
  }
  
  @Test
  public void myTest() {
	  System.out.println("---------------Starting to Run Main Test------------------------");
      
	  //Go through Each Row Test Case. [Main Test]
	  for (int i=1; i<xTC_r; i++) {
		  //See if Execute is Y
		  xTC_TCID = xTC[i][0];
		  xTC_Execute = xTC[i][3];
		  if (xTC_Execute.equalsIgnoreCase("Y")) {
			  //Then go to each row in Test Steps
			  System.out.println(">>>>>>>>>>>>>> Executing TCID:  " + xTC_TCID);
			  for (int j=1;j<xTS_r;j++) {
				  xTS_TCID = xTS[j][0];
				  xTS_KW = xTS[j][3];
				  xTS_EID = xTS[j][4];
				  xTS_TD = xTS[j][5];  		  
			      
				  //See for a matching TCID
				  if (xTC_TCID.equals(xTS_TCID)) {
					//Print the Test Step Details
				    System.out.println(">>>>>>>>>>>>>>>>>>>> Keyword is : " + xTS_KW);
				    System.out.println(">>>>>>>>>>>>>>>>>>>> EID is : " + xTS_EID);
				    System.out.println(">>>>>>>>>>>>>>>>>>>> TD is : " + xTS_TD);
				    seleniumExecutor.runTestStep(xTS_KW, xTS_EID, xTS_TD);
				  }
			    
		     } 
		  
	     }
	     else {
	      System.out.println("*********** Skipping TCID : " +xTC_TCID);
         }
	  
	  }  
	  System.out.println("---------------Done Running Main Test------------------------");
  }
   
  @After
  public void myAfter() {
	  System.out.println("---------------Starting to Write Excel------------------------");
  
	  
	  
	  System.out.println("---------------Done Writing Excel------------------------");
  }

}
