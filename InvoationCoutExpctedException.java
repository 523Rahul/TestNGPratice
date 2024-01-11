package TutorialNinjaPratice;

import org.testng.annotations.Test;

public class InvoationCoutExpctedException {
	
	@Test(expectedExceptions=ArithmeticException.class)
	
	void InvoationCoutExpctedExceptionPractice()
	{
		int a=12; int b=0;
		int c =a/b;
		
		System.out.println(c);
	}

}
