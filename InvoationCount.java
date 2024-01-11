package TutorialNinjaPratice;

import org.testng.annotations.Test;

public class InvoationCount {
	
	
	@Test(invocationCount=10)
	
	void InvoationCountTestPratice()
	{
		int a=1; int b=21;
		int c=a+b;
		System.out.println(c);
		
	}

}
