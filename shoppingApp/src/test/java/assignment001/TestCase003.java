package assignment001;
//"verify user is able to change the password"
//pass
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.MyAccountPage;
import objectRepositoryLuma.SignInPage;

public class TestCase003 {

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
	public void changePassword() {
		HomePage homePage=new HomePage(driver);
		
		homePage.getAccountDropDown().click();
		homePage.getMyAccountLink().click();
		MyAccountPage account=new MyAccountPage(driver);
		account.getChangePasswordLink().click();
		account.getCurrentPasswordTextField().sendKeys("Ayisha@1998");
		account.getNewPasswordTextField().sendKeys("Ayisha@1998");
		account.getNewPasswordTextField().sendKeys("Ayisha@1998");
		account.getConfirmPasswordTextField().sendKeys("Ayisha@1998");
		account.getSaveButton().click();
	}
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}

}
