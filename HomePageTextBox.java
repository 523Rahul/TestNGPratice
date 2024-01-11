package TutorialNinjaPratice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTextBox {
		
	WebDriver driver;
	
	Actions act;

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

	@Test (enabled=false)
	
	void inputBoxTest()
	{
		driver.findElement(By.xpath("(//input[@name=\"search\"])[1]")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\"]")).click();
		System.out.println("Successfully clicked");
	}

	
	@Test(enabled=true)
	 void DeskTopOptionCheck()
	 {
		act= new Actions(driver); 
		
		// driver.findElement(By.xpath("//a[text()=\"Desktops\"]")).click();
			
			 WebElement DesktopIcon = driver.findElement(By.xpath("//a[text()=\"Desktops\"]"));
				act.moveToElement(DesktopIcon).click();
				System.out.println("Clicked");
		
	 }

	@AfterMethod

	void tearUp()
	{

		//driver.quit();
	}


}



