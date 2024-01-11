package TutorialNinjaPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	

    public static void main(String[] args) {
	        System.out.println("Welcome");

	        WebDriverManager.chromedriver().setup();
	        System.out.println("Driver Set up is done");

	        ChromeDriver driver = new ChromeDriver();
	        System.out.println("Driver Set up is invoked");

	        try {
	            driver.get("https://www.google.com/");
	            System.out.println("Site Visited");

	            // other code...

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	            
	            System.out.println("Quite");
	        }
	    }
	}
