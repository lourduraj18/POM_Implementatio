package com.regsiter;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Interviewerregsiterpom {

	WebDriver driver;
	public Interviewerregsiterpom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "userRole")
	private WebElement clkintrvwrButton;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement setiusername;

	@FindBy(xpath = "//input[@type='userEmailId']")
	private WebElement setiEmailid;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement setiPassword;

	@FindBy(xpath = "//select[@id='cars']")
	private WebElement DeptClk;

	@FindBy(id = "phoneNo")
	private WebElement setiphno;

	@FindBy(xpath = "//button[@class='Signup_SignupButton__mmirw']")
	private WebElement SignupiClick;

	public void setUserRole() {
		this.clkintrvwrButton.click();
		}
	
	public void setUsername(String UserName) {
		this.setiusername.sendKeys(UserName);
	}
	public void setEmailid(String Emailid) {
		this.setiEmailid.sendKeys(Emailid);
	}
	public void setPassword(String Password) {
		this.setiPassword.sendKeys(Password);
	}
	public void selectDept() {
		Select select = new Select(DeptClk);
		select.selectByIndex(1);
	}

	public void setPhno(String phno) {
		this.setiphno.sendKeys(phno);
	}
	
	public void iSignup() {
	this.SignupiClick.click();
		
	}

	
}

