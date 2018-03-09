package helpers;

import org.apache.log4j.Logger;

public class Log {
	
	 Logger log = Logger.getLogger("devpinoyLogger");
	 
	public static void startTestCase(String sTestCaseName){
		Log.startTestCase(sTestCaseName);
		
		
	}
	public static void signin(String sTestCaseName){
		Log.signin(sTestCaseName);
	}
	public static void signout(String sTestCaseName){
		Log.signout(sTestCaseName);
	}
	public static void shoppingcart(String sTestCaseName){
		Log.shoppingcart(sTestCaseName);
	}

	public static void shoppingsummary(String sTestCaseName){
		Log.shoppingsummary(sTestCaseName);
	}
	public static void endTestCase(String sTestCaseName){
		Log.endTestCase(sTestCaseName);
	}
	public static void info(String message){
        Log.info(message);;
    }

}