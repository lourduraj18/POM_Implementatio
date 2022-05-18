package FunctionalTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.regsiter.Homepom;
import com.regsiter.Tagregisterpom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagteamRegister {
	WebDriver driver;
	
	Homepom homePOM;
	Tagregisterpom tagregisterpom;
	
	  @Test
	  public void regis() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		  homePOM.ClickSignup();
		  tagregisterpom.setUserRole();
		  tagregisterpom.setUsername("sania");
		  tagregisterpom.setEmailid("sania@gmail.com");
		  tagregisterpom.setPassword("SAnia@99");
		  tagregisterpom.setPhno("9988776655");
		  tagregisterpom.signUpClk();
	  }
	  @BeforeClass
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			homePOM = new Homepom(driver);
			tagregisterpom = new Tagregisterpom(driver);
			driver.manage().window().maximize();
			driver.get("http://localhost:3000");
		}
	 
	  @AfterClass
	  public void close() throws InterruptedException {
		  Thread.sleep(10000);
		  driver.close();
	  }
}
