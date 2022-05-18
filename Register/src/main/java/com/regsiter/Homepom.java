package com.regsiter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepom {
	
		WebDriver driver;
		public Homepom(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath ="//button[@class='sc-gKXOVf jMfcHF'][1]")
		private WebElement clickSignup ;
		
		public void ClickSignup() {
			this.clickSignup.click();
		}
	

}
