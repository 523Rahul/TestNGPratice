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

public class HomePageDependsMonths {

	WebDriver driver;
	
		
	
	
	@Test (priority=1)
	void LoginTest()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		System.out.println("Clciked on login option");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("523rahulshinde@gmail.com");
		System.out.println("Clciked on login TextBox and sent username");
	//	driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("9175066699");
		System.out.println("Clciked on login TextBox and sent Password");
		
	}
		
	@Test (priority=2, dependsOnMethods ="LoginTest") 
	void editYourInfirmation() // this test case depend on my Log in test
	{
		driver.findElement(By.xpath("//a[text()=\"Edit your account information\"]")).click();
		System.out.println("Clicked on the Method");
	}

	

}
