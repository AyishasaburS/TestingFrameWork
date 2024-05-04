package assignment001;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.SignInPage;

//verify user is able to click pants page in womens icon
public class TestCase024 {
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
	public void clickPants() {
		Actions action=new Actions(driver);
		HomePage homePage=new HomePage(driver);
		action.moveToElement(homePage.getWomenDropdown()).perform();
		action.moveToElement(homePage.getBottomsLink()).perform();
		action.click(homePage.getPantsLink()).perform();
		action.moveToElement(homePage.getLogo()).perform();
	}
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}	
}
