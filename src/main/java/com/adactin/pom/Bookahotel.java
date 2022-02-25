package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookahotel {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccnumber;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cctype;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expmonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expyear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvnumber;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookBtn;

	@FindBy(xpath = "//input[@name='cancel']")
	private WebElement cancelBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public Bookahotel(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
