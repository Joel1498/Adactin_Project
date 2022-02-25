package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_reader {

	public static Properties p;

	public Configuration_reader() throws Throwable {

		File f = new File(
				"D:\\joel workspace\\HotelProject.com\\src\\test\\java\\com\\adactin\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}
	
	public String get_Browser() {

		String browser = p.getProperty("browser");
		return browser;
	}

	public String get_Url() {

		String url = p.getProperty("url");
		return url;
	}

	public String get_Username() {

		String username = p.getProperty("db_username");
		return username;
	}

	public String get_Password() {

		String password = p.getProperty("db_password");
		return password;
	}

	public String get_Firstname() {

		String firstname = p.getProperty("db_Firstname");
		return firstname;
	}

	public String get_Lastname() {

		String lastname = p.getProperty("db_Lastname");
		return lastname;
	}
	
	public String get_Address() {
		String address = p.getProperty("db_Address");
		return address;
	}
	
	public String get_Ccnumber() {
		String ccnumber = p.getProperty("db_Ccnumber");
		return ccnumber;
	}
	
	public String get_Cvvnumber() {
		String cvvnumber = p.getProperty("db_Cvvnumber");
		return cvvnumber;
	}

}
