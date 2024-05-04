package assignment001;
//verifyuser is able to print the recepit
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepositoryLuma.CheckOutPage;
import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.OlivaJacketPage;
import objectRepositoryLuma.SignInPage;
import objectRepositoryLuma.WomenJacketHomePage;

public class TestCase011 {
	WebDriver driver;
	@Test(priority = 1)
	public void launchBrowser() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test(priority = 2)
	public void login() {
		HomePage homePage=new HomePage(driver);
		SignInPage signInPage=new SignInPage(driver);
		homePage.getSignInLink().click();
		signInPage.getEmailTextField().sendKeys("ayishasabur.s@gmail.com");
		signInPage.getPasswordTextField().sendKeys("Ayisha@1998");
		signInPage.getSignInButton().click();
	}
	
	@Test(priority = 3)
	public void addToCart() {
		Actions action=new Actions(driver);
		HomePage homePage=new HomePage(driver);
		action.moveToElement(homePage.getWomenDropdown()).perform();
		action.moveToElement(homePage.getTopsLink()).perform();
		action.click(homePage.getJacketsLink()).perform();
		action.moveToElement(homePage.getLogo()).perform();
		WomenJacketHomePage womenPage=new WomenJacketHomePage(driver);
		womenPage.getFirstJacketLink().click();
		OlivaJacketPage jacketPage=new OlivaJacketPage(driver);
		jacketPage.getXsSizeButton().click();
		jacketPage.getBlueColorButton().click();
		jacketPage.getAddToCartButton().click();
	}
	@Test(priority = 4)
	public void placeOrder() {
		OlivaJacketPage jacketPage=new OlivaJacketPage(driver);
		jacketPage.getMyCartLink().click();
		jacketPage.getCheckOutButton().click();
		CheckOutPage checkOut=new CheckOutPage(driver);
		checkOut.getShippingAddressSelection().click();
		checkOut.getPlaceOrderButton().click();
		checkOut.getNextButton().click();
		checkOut.getPrintReceiptLink().click();
		driver.switchTo().activeElement().click();
	}
	@Test(priority = 5)
	public void closeBrowser() {
		driver.quit();
	}

}
