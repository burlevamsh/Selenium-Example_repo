package com.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.BusTickets;
import com.pages.HomePage;
import com.pages.XLSLFile;

public class BookingTickets {

	WebDriver driver;
	HomePage homepage;
	BusTickets busticket;

	@BeforeSuite
	public void setingproperties() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	}

	@BeforeTest
	public void invokebrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		busticket = new BusTickets(driver);

	}

	@DataProvider(name = "dp")
	public Object[][] searchingDetails() {
		return XLSLFile.getXLSXFile("D:\\ctsjava\\RedBus\\src\\test\\resources\\TestData\\testingdata.xlsx");

	}

	@Test(dataProvider = "dp")
	public void booking(String src, String desc) {
		busticket.source(src);
		busticket.destination(desc);

	//	busticket.dateclicker();
		driver.findElement(By.xpath("//*[@id=\'search\']/div/div[3]/div/label")).click();
		//This is from date picker table
		WebElement dateWidgetFrom = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tbody"));
		//This are the columns of the from date picker table
		        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
		        for (WebElement cell: columns) {
		        	
		            //If you want to click 18th Date
		          //  if (cell.getText().equals("18")) {
		           
		            //Select Today's Date
		            if (cell.getText().equals("18")) {
		                cell.click();
		                break;
		            }
		        }
		        
		
	}
	

	@AfterMethod
	public void close() {
		driver.close();
	}

}
	
