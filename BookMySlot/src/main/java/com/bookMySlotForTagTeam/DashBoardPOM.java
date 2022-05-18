package com.bookMySlotForTagTeam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPOM {
	WebDriver driver;
	
	public DashBoardPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginName = By.xpath("//div[text()='ajayro']");
	
	public String LoginName() {
		return driver.findElement(loginName).getText();
	}
	
	
}
