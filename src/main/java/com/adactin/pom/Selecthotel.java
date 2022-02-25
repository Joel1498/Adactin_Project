package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {

	private WebDriver driver;

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement first;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continueBtn;

	@FindBy(xpath = "//input[@name='cancel']")
	private WebElement cancel;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public Selecthotel(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
