package functionalTestingForIntService;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bookMySlotForInterviewerService.DashBoardPOMInt;
import com.bookMySlotForInterviewerService.HomePOMInt;
import com.bookMySlotForInterviewerService.LoginPOMInt;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidLoginTestIntService {
	WebDriver driver;
	LoginPOMInt loginPOM;
	HomePOMInt homePOM;
	DashBoardPOMInt dashBoardPOM;

	  @Test
	  public void login() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		  homePOM.ClickSignUp();
		  loginPOM.SetEmailId("mani@gmail.com");
		  loginPOM.SetPassword("MAnia@99");
		  loginPOM.ClkLoginBtn();
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
		  
		  String Actual = dashBoardPOM.LoginMsg();
		  Assert.assertEquals(Actual,"Welcome back Interviewer !");
		  
		  Thread.sleep(10000);
		  driver.close();
	  }
}
