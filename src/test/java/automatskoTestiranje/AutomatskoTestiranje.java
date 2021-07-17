package automatskoTestiranje;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.StandardSystemProperty;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ObjectInputValidation;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageovi.FilteringAndBrowsing;
import pageovi.LogIn;

public class AutomatskoTestiranje {


	public static void main(String[] args) throws InterruptedException {
		int WaitTime = 3000;		

		LogIn login;
		FilteringAndBrowsing filteringAndBrowsing;
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		// WebDriverManager.chromedriver().setup(); //OPCIJA ZA DRUGI BROWSER
		// ChromeDriver driver = new ChromeDriver();
		login = new LogIn(driver);
		filteringAndBrowsing = new FilteringAndBrowsing(driver);
		
		
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
       
		
		// User can not register with invalid mail address
		
	    login.getSignUpButton().click();
		assertEquals(true, login.getSignUpMenu().isDisplayed());
		login.getEmail().clear();
		login.getEmail().sendKeys("(@gmail.com");
		login.getContinueButton().click();
		Thread.sleep(WaitTime);
		String invalidMessage = login.getInvalidRegisterMessage().getText();
		assertEquals("Please enter a valid email address.",invalidMessage);
		login.getCloseButton().click();
	
	    
	    //User can find help with trouble signing in
	    
	    login.getTroubleButton().click();
	    String helppage = driver.getCurrentUrl();
	    assertEquals("https://help.etsy.com/hc/en-us/articles/115015410188", helppage);
		System.out.println("gugi");
		driver.navigate().back();
						
		
		//User can register 
		
		login.getSignUpButton().click();
		login.getEmail().clear();
		login.getEmail().sendKeys("jelicaa1234@gmail.com");
		login.getContinueButton().click();
        assertEquals(true, login.getCreateAccountMenu().isDisplayed());
        System.out.println("gugi");
        Thread.sleep(WaitTime);
       	login.getFirstName().click();
		login.getFirstName().clear();
		login.getFirstName().sendKeys("Jelica");
		Thread.sleep(WaitTime);
		login.getPassword().click();
		login.getPassword().clear();
		login.getPassword().sendKeys("jelicaa4567");
		Thread.sleep(WaitTime);
		login.getRegisterInButton().click();
		assertTrue(login.getSignInIcons().isDisplayed());
		
		//User can search for the specific items using search bar
		
		filteringAndBrowsing.getSearchBar().click();
		filteringAndBrowsing.getSearchBar().sendKeys("purse");
		filteringAndBrowsing.getBinocularIcon().click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		assertEquals("https://www.etsy.com/search?q=purse", currentUrl);
		
		//User can filter wanted items with price range filter
		
		filteringAndBrowsing.getNameOfGroupItems().click();
		String currentUrl1 = driver.getCurrentUrl();
		assertEquals("https://www.etsy.com/c/jewelry-and-accessories?ref=catnav-10855", currentUrl1);
		System.out.println(currentUrl1);
		filteringAndBrowsing.getRadioButton().click();
		assertEquals(true,filteringAndBrowsing.getPriceInfo().isDisplayed());
		System.out.println("kjskdjsk");
		filteringAndBrowsing.getPriceInfo().click();
		
		//User can fiter wanted items with colour filter
		
		filteringAndBrowsing.getColourCheckBox().click();
		assertEquals(true,filteringAndBrowsing.getColourInfo().isDisplayed());
		filteringAndBrowsing.getColourInfo().click();
		
		//User can sort wanted items with sort by filter
		
		filteringAndBrowsing.getSortByButton().click();
		filteringAndBrowsing.getHighPriceButton().click();
		assertEquals(true,filteringAndBrowsing.getHighPriceInfo().isDisplayed());
		System.out.println("oki");
		
		driver.close();
		
		
        
        
        
        
        
        
		
		
		
		
	}

}
