package assignment001;
//verify user is after clicking notes get next page or not
import java.time.Duration;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.SignInPage;

public class TestCase023 {
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
	public void  textVerification() {
		HomePage homePage=new HomePage(driver);
		homePage.getNotesLink().click();
		driver.switchTo().window("https://softwaretestingboard.com/magento-store-notes/?utm_source=magento_store&utm_medium=banner&utm_campaign=notes_promo&utm_id=notes_promotion");
		
	}
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}	
}
