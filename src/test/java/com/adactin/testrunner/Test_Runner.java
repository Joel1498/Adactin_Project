package com.adactin.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.base.Base_Class;
import com.adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\joel workspace\\HotelProject.com\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature", 
glue = "com.adactin.stepdef",
monochrome = true,
dryRun = false,
strict = true,
plugin = {"html:HtmlReort/output2.html",
		"pretty",
		"json:JsonReport/output.json",
		"com.cucumber.listener.ExtentCucumberFormatter:ExtentsReport/joel1.html"}
		)

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		String browser = File_Reader_Manager.get_Instance_FR().get_Instance_CR().get_Browser();
		Base_Class.getBrowser(browser);
		Thread.sleep(2000);
	}
	
	@AfterClass
	public static void tear_Down() {
		Base_Class.close();
		System.out.println("Successfull");
		
	}
	
}
