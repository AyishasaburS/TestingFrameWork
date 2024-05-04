package assignment001;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.OlivaJacketPage;
import objectRepositoryLuma.SignInPage;
import objectRepositoryLuma.WomenJacketHomePage;

//verify user is able to give the review of a product
public class TestCase014 {
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
	public void clickProduct() {
		Actions action=new Actions(driver);
		HomePage homePage=new HomePage(driver);
		action.moveToElement(homePage.getWomenDropdown()).perform();
		action.moveToElement(homePage.getTopsLink()).perform();
		action.click(homePage.getJacketsLink()).perform();
		action.moveToElement(homePage.getLogo()).perform();
		WomenJacketHomePage womenPage=new WomenJacketHomePage(driver);
		womenPage.getFirstJacketLink().click();
	}
	@Test(priority = 4)
	public void reviewClicking() {
		OlivaJacketPage jacketPage=new OlivaJacketPage(driver);
		jacketPage.getReviewsLink().click();
		jacketPage.getRating3Label().click();
		jacketPage.getNicknameField().sendKeys("S");
		jacketPage.getSummaryField().sendKeys("Good Product");
		jacketPage.getReviewField().sendKeys("nice");
		jacketPage.getSubmitReviewButton().click();
}
	@Test(priority = 5)
	public void closeBrowser() {
		driver.quit();
	}
}
