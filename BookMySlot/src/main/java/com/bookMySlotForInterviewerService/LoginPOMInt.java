package com.bookMySlotForInterviewerService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMInt {
	WebDriver driver;

	public LoginPOMInt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement setEmailId;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement setPassword;
	
	@FindBy(xpath = "//button[@class='Signin_SigninButton__1dtoP']")
	private WebElement clkLoginBtn;

	public void SetEmailId(String EmailId) {
		this.setEmailId.sendKeys(EmailId);
	}

	public void SetPassword(String Password) {
		this.setPassword.sendKeys(Password);
	}

	public void ClkLoginBtn() {
		this.clkLoginBtn.click();
	}

	




}
