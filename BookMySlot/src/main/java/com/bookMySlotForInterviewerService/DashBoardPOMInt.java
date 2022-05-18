package com.bookMySlotForInterviewerService;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPOMInt {
	WebDriver driver;
	
	public DashBoardPOMInt(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginMsg = By.xpath("//h2[text()='Welcome back Interviewer !']");
	

	public String LoginMsg() {
		return driver.findElement(loginMsg).getText();
	}
	
}
