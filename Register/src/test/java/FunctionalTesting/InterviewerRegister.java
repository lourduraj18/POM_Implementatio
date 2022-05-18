package FunctionalTesting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.regsiter.Homepom;
import com.regsiter.Interviewerregsiterpom;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class InterviewerRegister {
		WebDriver driver;
		
		Homepom homePOM;
		Interviewerregsiterpom intrvwregisterpom;
		
		  @Test
		  public void Register() throws InterruptedException {
			  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
			  homePOM.ClickSignup();
			  intrvwregisterpom.setUserRole();
			  intrvwregisterpom.setUsername("molia");
			  intrvwregisterpom.setEmailid("molia@gmail.com");
			  intrvwregisterpom.setPassword("MOlia@99");
			  intrvwregisterpom.selectDept();
			  intrvwregisterpom.setPhno("9988776655");
			  intrvwregisterpom.iSignup();
			  
			  
		  }
		  @BeforeClass
			public void launchBrowser() {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				homePOM = new Homepom(driver);
				intrvwregisterpom = new Interviewerregsiterpom(driver);
				driver.manage().window().maximize();
				driver.get("http://localhost:3000");
			}
		  @AfterClass
		  public void exit() {
			  driver.quit();
		  }
	}
