package com.adactin.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static Actions driver1;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\joel workspace\\Adactin.com\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"D:\\joel workspace\\Adactin.com\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		else if (type.equalsIgnoreCase("internetexplorer")) {

			System.setProperty("webdriver.ie.driver",
					"D:\\joel workspace\\Adactin.com\\Driver\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void sendkey(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void getURL(String url) {

		driver.get(url);

	}

	public static void close() {

		driver.close();

	}

	public static void quit() {

		driver.quit();

	}

	public static void sleep(Integer value) throws Throwable {

		Thread.sleep(value);

	}

	public static void dropdown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("Byvalue")) {

			s.selectByValue(value);
		}

		else if (type.equalsIgnoreCase("Byvisibletext")) {

			s.selectByVisibleText(value);

		}

		else if (type.equalsIgnoreCase("Byindex")) {

			int index = Integer.parseInt(value);

			s.selectByIndex(index);
		}

	}

	public static void enabled(WebElement element) {

		boolean enabled = element.isEnabled();
		System.out.println("The text is :" + enabled);

	}

	public static void displayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		System.out.println("The text is :" + displayed);

	}

	public static void selected(WebElement element) {

		boolean selected = element.isSelected();
		System.out.println("Select or not :" + selected);

	}

	public static void getattribut(WebElement element) {

		String attribute = element.getAttribute("value");
		System.out.println("Passed data is :" + attribute);

	}

	public static void gettext(WebElement element) {

		String text = element.getText();
		System.out.println("The text is :" + text);

	}

	public static void robot() throws Exception {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void windohandling(String arg0) {

		String title = driver.switchTo().window(arg0).getTitle();
		System.out.println(title);

	}

	public static void movetoelement(WebElement actions) {

		Actions a = new Actions(driver);
		a.moveToElement(actions).build().perform();

	}

	public static void movetoelementclick(WebElement actions) {

		Actions b = new Actions(driver);
		b.moveToElement(actions).click().perform();

	}

	public static void gettitle(String url) {

		String title = driver.getTitle();
		System.out.println("The title is :" + title);

	}

	public static void getcurrenturl(String url) {

		String currentUrl = driver.getCurrentUrl();
		System.out.println("The url is :" + currentUrl);

	}

	public static void retreiveurl(String url) {

		driver.get(url);

	}

	public static void frame(WebElement element) {

		driver.switchTo().frame(element);

	}

	public static void scrollpage(String arg0, WebElement arg1) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(arg0, arg1);

	}

	public static void takescreenshot(String url) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("url");
		FileUtils.copyFile(source, destination);

	}

	public static void alert() {

		Alert alert = driver.switchTo().alert();

		if (alert.equals(alert)) {
			alert.accept();

		}

		else if (alert.equals(alert)) {
			alert.dismiss();

		}

	}

	public static void navigate() {

		driver.navigate();

	}

	public static void navigateto(String url) {

		driver.navigate().to(url);

	}

	public static void navigateback() {

		driver.navigate().back();

	}

	public static void refresh() {

		driver.navigate().refresh();

	}

	public static void forward() {

		driver.navigate().forward();

	}

	public static void clear(WebElement element) {

		element.clear();

	}

}
