package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusTickets extends HomePage{
	
	
	public BusTickets(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='src']")
	WebElement src;
	
	@FindBy(xpath="//input[@id='dest']")
	WebElement desc;
	
	@FindBy(xpath="//input[@id='onward_cal']")
	WebElement dateClicker;
	
	@FindBy(xpath="//td[@class='current day'][contains(text(),'13')]")
	WebElement dateSelector;

	@FindBy(xpath="//button[@id='search_btn']")
	WebElement searchBtn;
	
	
	public void source(String from) {
		src.sendKeys(from);
	}
	
	public void destination(String destine) {
		desc.sendKeys(destine);
	}
	
	public void dateclicker() {
		dateClicker.click();
	}
	
	public void dateselection() {
		dateSelector.click();
	}
	
	public void searchbtn() {
		searchBtn.click();
	}
	
	
}
