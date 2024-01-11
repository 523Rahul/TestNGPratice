package TutorialNinjaPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInFunctionality {


	WebDriver driver;

	@BeforeMethod
	void setUpMwthod()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test

	void inputFunctionalityCheckUp()
	{
		driver.findElement(By.xpath("(//a[text()=\"Login\"])[1]")).click();
		

	}


	@AfterMethod

	void tearUp()
	{

		//	driver.quit();
	}


}
