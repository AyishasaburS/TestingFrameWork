package assignment001;
//verify user is able to edit an address
import java.time.Duration;

import org.checkerframework.checker.units.qual.h;
import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepositoryLuma.EditAddressPage;
import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.MyAccountPage;
import objectRepositoryLuma.SignInPage;

public class TestCase015 {
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
	public void addAddress() {
		HomePage homePage=new HomePage(driver);
		homePage.getAccountDropDown().click();
		homePage.getMyAccountLink().click();
		MyAccountPage account=new MyAccountPage(driver);
		account.getShippingAddressEditLink().click();
		EditAddressPage edit=new EditAddressPage(driver);
		edit.getFirstNameTextField().clear();
		edit.getFirstNameTextField().sendKeys("Ayisha");
		edit.getLastNameTextField().clear();
		edit.getLastNameTextField().sendKeys("Sabur");
		edit.getStreet_1_TextField().sendKeys("123");
		edit.getStreet_2_TextField().sendKeys("XYZ Street");
		edit.getStreet_3_TextField().sendKeys("Chennai");
		edit.getPincodeTextField().sendKeys("1234");
		Select countryDropDown=new Select(edit.getCountryDropDown());
		countryDropDown.selectByVisibleText("Norway");
		edit.getSaveAddressButton().click();
	}
	@Test(priority = 4)
	public void editAddress() {
		EditAddressPage edit=new EditAddressPage(driver);
		edit.getFirstNameTextField().clear();
		edit.getFirstNameTextField().sendKeys("Ayisha");
		edit.getLastNameTextField().clear();
		edit.getLastNameTextField().sendKeys("Sabur");
		edit.getStreet_1_TextField().clear();
		edit.getStreet_1_TextField().sendKeys("123");
		edit.getSaveAddressButton().click();
	}
	@Test(priority = 5)
	public void closeBrowser() {
		driver.quit();
	}
}