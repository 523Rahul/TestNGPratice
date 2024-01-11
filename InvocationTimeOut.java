package TutorialNinjaPratice;

import org.testng.annotations.Test;

public class InvocationTimeOut {
	
	@Test(invocationTimeOut=2)
	
	void invoationTimeOutProactice()
	{
		int i=1;
		while(i==1) {
			System.out.println(1);
		}
	}

}
