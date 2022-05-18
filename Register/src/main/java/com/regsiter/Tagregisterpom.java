package com.regsiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tagregisterpom {
	
	

	WebDriver driver;
	public Tagregisterpom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(name = "userRole")
private WebElement clktagButton;

@FindBy(xpath = "//input[@type='text']")
private WebElement setusername;

@FindBy(xpath = "//input[@type='userEmailId']")
private WebElement setEmailid;

@FindBy(xpath = "//input[@type='password']")
private WebElement setPassword;

@FindBy(id= "phoneNo")
private WebElement setphno;

@FindBy(xpath = "//button[@class='Signup_SignupButton__mmirw']")
private WebElement SignupClk;

public void setUserRole() {
	this.clktagButton.click();
}
public void setUsername(String userName) {
	this.setusername.sendKeys(userName);
}
public void setEmailid(String Emailid) {
	this.setEmailid.sendKeys(Emailid);
}
public void setPassword(String Password) {
	this.setPassword.sendKeys(Password);
}


public void setPhno(String phNo) {
	this.setphno.sendKeys(phNo);
}

public void signUpClk() {
	this.SignupClk.click();
}
}

