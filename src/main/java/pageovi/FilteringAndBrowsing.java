package pageovi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import okhttp3.internal.Util;

public class FilteringAndBrowsing {

	private WebDriver driver;

	public FilteringAndBrowsing(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSearchBar() {
		return Utils.waitForElementPresence(driver, By.id("global-enhancements-search-query"), 10);
	}

	public WebElement getBinocularIcon() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@data-id='gnav-search-submit-button']"), 10);
	}

	public WebElement getNameOfGroupItems() {
		return Utils.waitForElementPresence(driver, By.id("catnav-primary-link-10855"), 10);
	}

	public WebElement getRadioButton() {

		return Utils.waitToBeClickable(driver, By.xpath(
				"/html/body/div[5]/div/div[1]/div/div[4]/div[1]/div/div/form/div[4]/fieldset/div/div/div[2]/a/label"),
				10);
	}

	public WebElement getSortByMenu() {

		return Utils.waitForElementPresence(driver, By.id("sortby"), 10);

	}

	public WebElement getColourCheckBox() {

		return Utils.waitToBeClickable(driver, By.xpath("//div/a/label[@for='attr_1-1']"), 10);

	}

	public WebElement getColourInfo() {

		return Utils.waitForElementPresence(driver,
				By.xpath("/html/body/div[5]/div/div[1]/div/div[4]/div[2]/div[2]/div[2]/ul/li/ul/li/a"), 10);

	}

	public WebElement getPriceInfo() {

		return Utils.waitForElementPresence(driver,
				By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[4]/div[2]/div[2]/div[2]/ul/li"), 10);

	}

	public WebElement getSortByButton() {

		return Utils.waitToBeClickable(driver, By.xpath("//div[@id='sortby']"), 10);
	}

	public WebElement getHighPriceButton() {

		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"sortby\"]/div/a[3]"), 10);

	}

	public WebElement getHighPriceInfo() {

		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"sortby\"]/button/span"), 10);
	}

}
