package com.bookMySlotForTagTeam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
	WebDriver driver;

	public HomePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//button[@class='sc-gKXOVf jMfcHF'][2]")
	private WebElement clicksignUp;
	
	
	
	public void ClickSignUp() {
		this.clicksignUp.click();
	}
	
	
	
	

	
}
