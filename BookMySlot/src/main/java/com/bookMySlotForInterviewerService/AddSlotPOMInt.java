package com.bookMySlotForInterviewerService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddSlotPOMInt {
	WebDriver driver;

	public AddSlotPOMInt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath ="//button[@class='btn btn-primary']")
	private WebElement clickAddSlot;
	
	@FindBy(xpath = "//input[@id='date']")
	private WebElement enterDate;
	
	@FindBy(name ="startTime")
	private WebElement selStartTime;
	
	@FindBy(name = "endTime")
	private WebElement selEndTime;
	
	@FindBy(name = "bookedStatus")
	private WebElement selBookedStatus;
	
	@FindBy(id = "description")
	private WebElement setDescription;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clkAddSlotBtn;
	

	public void ClickAddSlot() {
		this.clickAddSlot.click();
	}

	public void setEnterDate(String Date) {
		this.enterDate.sendKeys(Date);
	}

	public void SelStartTime() {
		Select select = new Select(selStartTime);
		select.selectByIndex(1);
		}

	public void SelEndTime() {
		Select select = new Select(selEndTime);
		select.selectByIndex(1);
	}

	public void setSelBookedStatus() {
		Select select = new Select(selBookedStatus);
		select.selectByIndex(0);
	}

	public void SetDescription(String Description) {
		this.setDescription.sendKeys(Description);
	}
	
	public void ClkAddSlotBtn() {
		this.clkAddSlotBtn.click();
	}
}
