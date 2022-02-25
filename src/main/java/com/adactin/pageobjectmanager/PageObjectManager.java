package com.adactin.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Bookahotel;
import com.adactin.pom.Confirmation;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Searchhotel;
import com.adactin.pom.Selecthotel;

public class PageObjectManager {

	private WebDriver driver;
	private Login_Page login;
	private Searchhotel search;
	private Selecthotel select;
	private Bookahotel book;
	private Confirmation confirm;

	public WebDriver getDriver() {
		return driver;
	}

	public Login_Page get_Instance_Login() {
		login = new Login_Page(driver);
		return login;
	}

	public Searchhotel get_Instance_Search() {
		search = new Searchhotel(driver);
		return search;
	}

	public Selecthotel get_Instance_Select() {
		select = new Selecthotel(driver);
		return select;
	}

	public Bookahotel get_Instance_Book() {
		book = new Bookahotel(driver);
		return book;
	}

	public Confirmation get_Instance_Confirm() {
		confirm = new Confirmation(driver);
		return confirm;
	}

	public PageObjectManager(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

}
