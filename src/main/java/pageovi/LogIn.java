package pageovi;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageovi.Utils;

public class LogIn {

	private final int WaitTime = 100;
	private WebDriver driver;

	public LogIn(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSignUpButton() {
		return Utils.waitForElementPresence(driver, By.cssSelector("button.wt-mr-xs-1"), WaitTime);
	}

	public WebElement getSignUpMenu() {
		return Utils.waitForElementPresence(driver, By.id("join-neu-form"), WaitTime);
	}

	public WebElement getEmail() {
		return Utils.waitForElementPresence(driver, By.name("email"), WaitTime);
	}

	public WebElement getPassword() {
		return Utils.waitForElementPresence(driver, By.id("join_neu_password_field"), WaitTime);
	}

	public WebElement getCloseButton() {

		return Utils.waitToBeClickable(driver, By.xpath(
				"//button[@class='wt-btn wt-btn--transparent wt-btn--icon wt-overlay__close-icon wt-btn--light']"),
				WaitTime);

	}

	public WebElement getContinueButton() {

		return Utils.waitForElementPresence(driver,
				By.xpath("//div/button[@class='wt-btn wt-btn--primary wt-width-full']"), WaitTime);

	}

	public WebElement getFirstName() {
		return Utils.waitForElementPresence(driver, By.name("first_name"), WaitTime);
	}

	public WebElement getCreateAccountMenu() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"join-neu-form\"]"), WaitTime);
	}

	public WebElement getInvalidRegisterMessage() {

		return Utils.waitForElementPresence(driver, By.id("aria-join_neu_email_field-error"), WaitTime);

	}

	public WebElement getRegisterInButton() {

		return  Utils.waitForElementPresence(driver, By.xpath("//div/button[@value='register']"), WaitTime);

		
	}

	public WebElement getTroubleButton() {

		return Utils.waitForElementPresence(driver, By.xpath("//p/a[@href='/help/article/18?ref=signin']"), WaitTime);

	}

	public WebElement getSignInIcons() {

		return Utils.waitForElementPresence(driver, By.xpath("//div/nav[@aria-label='Main navigation']"), WaitTime);

	}
	
	
}
