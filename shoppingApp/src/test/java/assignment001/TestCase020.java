package assignment001;
//verify user is able to view email text in that page
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.PrivacyCookiesPage;
import objectRepositoryLuma.SignInPage;

public class TestCase020 {
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
	public void privacyCookies() {
		HomePage homePage=new HomePage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(homePage.getPrivacyAndCookieLink()).perform();
		action.click(homePage.getPrivacyAndCookieLink()).perform();
		PrivacyCookiesPage privacy=new PrivacyCookiesPage(driver);
		action.moveToElement(privacy.getEmailText()).perform();
		System.out.println("Scrolled to at that element");
	}
	
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}
}
