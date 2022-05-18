package functionalTestingForTagService;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bookMySlotForInterviewerService.DashBoardPOMInt;
import com.bookMySlotForInterviewerService.HomePOMInt;
import com.bookMySlotForInterviewerService.LoginPOMInt;
import com.bookMySlotForTagTeam.DashBoardPOM;
import com.bookMySlotForTagTeam.HomePOM;
import com.bookMySlotForTagTeam.LoginPOM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvalidLoginTestTagService {
	WebDriver driver;
	LoginPOMInt loginPOM;
	HomePOMInt homePOM;
	DashBoardPOMInt dashBoardPOM;

	  @Test
	  public void login(String email,String pass) throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		  homePOM.ClickSignUp();
		  loginPOM.SetEmailId(email);
		  loginPOM.SetPassword(pass);
		  loginPOM.ClkLoginBtn();
	  }
	  
	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "mani@gmail.com", "MAnia@99" },
	    };
	  }
	  
	  @BeforeClass
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			loginPOM = new LoginPOMInt(driver);
			homePOM = new HomePOMInt(driver);
			dashBoardPOM = new DashBoardPOMInt(driver);
			driver.manage().window().maximize();
			driver.get("http://localhost:3000");

		}
	  
	  @AfterClass
	  public void close() throws InterruptedException {
		  
		  String Actual ="Username or password is wrong";
		  Assert.assertEquals(Actual,"Username or password is wrong");
		  
		  Thread.sleep(10000);
		  driver.close();
	  }
}
