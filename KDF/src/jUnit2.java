import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class jUnit2 {
   @Before  // gets executed before every test
   
   public  void myBeforeTest() {
	   System.out.println("This is Before my Test");
   }
   
   @Test    // This is one of my tests
   
   public  void myTest1() {
	   System.out.println("This is my Test1");
   }
   
   @Test    // This is one of my tests
   public  void myTest2() {
	   System.out.println("This is my Test2");
   }
   
   @After   // gets executed after every test
   
   public  void myAfterTest() {
	   System.out.println("This is After my Test");
   }
}
