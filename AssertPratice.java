package TutorialNinjaPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertPratice {
	
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

	@Test(priority=1)

	void getTitleOfHomePage()

	{
		String HomePagetitle = driver.getTitle();
		System.out.println(HomePagetitle);
		Assert.assertEquals(HomePagetitle ,"Your Store"); 

	}
		
	@Test
	
	void verfiyLogo()

	{
		boolean logo =driver.findElement(By.xpath("//a[text()=\"Qafox.com\"]")).isDisplayed(); 
		System.out.println(logo);

	}
	

}
