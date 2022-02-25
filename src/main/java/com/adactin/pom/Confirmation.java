package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='search_hotel']")
	private WebElement searchHotel;

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement myitenerary;

	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logoutBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getMyitenerary() {
		return myitenerary;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public Confirmation(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
