package assignment001;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.SignInPage;
import objectRepositoryLuma.TrainingPage;

//verify user is able to click hot sale optin in home page
public class TestCase027 {
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
	public void hotSale() {
		HomePage homePage=new HomePage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(homePage.getHotSalebutton()).perform();
		action.click(homePage.getHotSalebutton()).perform();
		TrainingPage train=new TrainingPage(driver);
	}
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}

}
