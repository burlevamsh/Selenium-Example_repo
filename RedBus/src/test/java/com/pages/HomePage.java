package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[@class='redbus-logo home-redirect']")
	WebElement logo;
	
	@FindBy(xpath="//a[@id='redBus']")
	WebElement busTickets;
	
	@FindBy(xpath="//a[@id='cars']")
	WebElement rpool;
	
	@FindBy(xpath="//a[@id='redBus Bus Hire']")
	WebElement busHire;
	
	@FindBy(xpath="//a[contains(text(),'Help')]")
	WebElement help;
	
	public void homePageLogo() {
		logo.click();
	}
	
	public void bookingTickets() {
		busTickets.click();
	}
	
	public void pooling() {
		rpool.click();
	}
	
	public void busHire() {
		busHire.click();
	}
	
	public void help() {
		help.click();
	}
}
