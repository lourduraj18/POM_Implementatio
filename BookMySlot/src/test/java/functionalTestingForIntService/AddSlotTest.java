package functionalTestingForIntService;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bookMySlotForInterviewerService.AddSlotPOMInt;

import com.bookMySlotForTagTeam.HomePOM;
import com.bookMySlotForTagTeam.LoginPOM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddSlotTest {
	WebDriver driver;
	LoginPOM loginPOM;
	HomePOM homePOM;
	AddSlotPOMInt addSlotPOM;

	@Test
	public void addSlot() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		homePOM.ClickSignUp();
		loginPOM.SetEmailId("mani@gmail.com");
		loginPOM.SetPassword("MAnia@99");
		loginPOM.ClkLoginBtn();
		addSlotPOM.ClickAddSlot();
		addSlotPOM.setEnterDate("07/06/2022");
		addSlotPOM.SelStartTime();
		addSlotPOM.SelEndTime();
		addSlotPOM.setSelBookedStatus();
		addSlotPOM.SetDescription("Testing");
		addSlotPOM.ClkAddSlotBtn();
	}

	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPOM = new LoginPOM(driver);
		homePOM = new HomePOM(driver);
		addSlotPOM = new AddSlotPOMInt(driver);
		driver.manage().window().maximize();
		driver.get("http://localhost:3000");

	}

	@AfterClass
	public void exit() throws InterruptedException {
		String Actual = "Slot is added successfully";
		Assert.assertEquals(Actual, "Slot is added successfully");

		Thread.sleep(10000);
		driver.close();
	}
}
