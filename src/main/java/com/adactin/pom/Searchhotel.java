package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {

	public static WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomnos;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkindate;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkoutdate;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adults;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement children;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//input[@type='reset']")
	private WebElement resetBtn;
	
	
	
	public WebElement getResetBtn() {
		return resetBtn;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public Searchhotel(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
