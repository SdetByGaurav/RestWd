package JSONParser;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class Test12 {

	
	public static void main(String[] args) {
		
		EmpDetails eobj = new EmpDetails(12, "raj", 10000);
		
		JSONParser1.marshalling(eobj);
	//	System.out.println(eobj);
		System.out.println("pass");
	}
}
