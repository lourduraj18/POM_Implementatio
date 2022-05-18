package functionalTestingForTagService;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bookMySlotForTagTeam.DashBoardPOM;
import com.bookMySlotForTagTeam.HomePOM;
import com.bookMySlotForTagTeam.LoginPOM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidLoginTestTagService {
	WebDriver driver;
	LoginPOM loginPOM;
	HomePOM homePOM;
	DashBoardPOM dashBoardPOM;

	  @Test
	  public void login() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		  homePOM.ClickSignUp();
		  loginPOM.SetEmailId("ajayro@gmail.com");
		  loginPOM.SetPassword("AJayr@99");
		  loginPOM.ClkLoginBtn();
	  }
	  
	  @BeforeClass
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			loginPOM = new LoginPOM(driver);
			homePOM = new HomePOM(driver);
			dashBoardPOM = new DashBoardPOM(driver);
			driver.manage().window().maximize();
			driver.get("http://localhost:3000");

		}
	  
	  @AfterClass
	  public void close() throws InterruptedException {
		  
		  String Actual = dashBoardPOM.LoginName();
		  Assert.assertEquals(Actual,"ajayro");
		  
		  Thread.sleep(10000);
		  driver.close();
	  }
}
