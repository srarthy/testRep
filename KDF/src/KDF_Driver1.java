import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KDF_Driver1 {
   @Before  // gets executed before every test
   
   public  void myBeforeTest() {
	   System.out.println("This is Before my Test");
   }
   
   @Test    
   
   public  void myTest1() {
	   /*
	    *  1. Read the 2 Excel's - 2D Array String
	    *  2. Go to each TC and see if it is Execute Y
	    *  3.If Y,Go to TS and see if it has a matching TCID
	    *  4.If it matches, print the step details
	    */
	   
	   
   }
   
      
   @After   // gets executed after every test
   
   public  void myAfterTest() {
	   System.out.println("This is After my Test");
   }
}

