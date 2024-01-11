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

public class RegistrationFunctinality {
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

	@Test(priority=2)

	void registerTestWithCorrectData()
	{
		driver.findElement(By.xpath("(//span[@class=\"hidden-xs hidden-sm hidden-md\"])[3]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://tutorialsninja.com/demo/index.php?route=account/register\"])[1]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Abc");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Sss"); 
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("XXyyzzd@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys("564211");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("India---1947");
		driver.findElement(By.xpath("//input[@name=\"confirm\"]")).sendKeys("India---1947");
		driver.findElement(By.xpath("(//input[@name=\"newsletter\"])[1]")).click();
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();

		System.out.println("All Done Sucessfully"); 
	}

	@Test (priority=3)

	void sucessPagetitleTest()
	{
		String title =driver.getTitle();
		System.out.println("sucessPagetitleTest " +title);
		Assert.assertEquals("Your Store", title);
	}
	
	@Test 
	
	void registerTestWithIncorrrectData()
	{
		driver.findElement(By.xpath("(//span[@class=\"hidden-xs hidden-sm hidden-md\"])[3]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://tutorialsninja.com/demo/index.php?route=account/register\"])[1]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("k");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("k"); 
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abcdsd@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys("564211");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@name=\"confirm\"]")).sendKeys(" ");
		driver.findElement(By.xpath("(//input[@name=\"newsletter\"])[1]")).click();
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
		String CurrentURL=	driver.getCurrentUrl();
		Assert.assertEquals("https://tutorialsninja.com/demo/index.php?route=account/success", CurrentURL);
		
		
	}

	@AfterMethod

	void tearUp()
	{

	//	driver.quit();
	}


}
