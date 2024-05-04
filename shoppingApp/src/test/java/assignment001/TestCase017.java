package assignment001;

import java.time.Duration;

import org.checkerframework.checker.units.qual.h;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.SignInPage;
import objectRepositoryLuma.SubscribePage;

//verify user is able to click on subscribe button
public class TestCase017 {
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
	public void clickSubscribe() {
	//Scroll until we get subscribe button
		HomePage home=new HomePage(driver);
		Actions action=new Actions(driver);
		action.scrollToElement(home.getSubscripeButton()).perform();
		action.click(home.getSubscripeButton()).perform();
		driver.switchTo().window("https://softwaretestingboard.com/subscribe/?utm_source=magento_store&utm_medium=banner&utm_campaign=notes_promo&utm_id=email_subscribe");
		SubscribePage subscribe=new SubscribePage(driver);
		subscribe.getEmailTextField().sendKeys("ayishasabur.s@gmail.com");
		subscribe.getFirstNameTextField().sendKeys("Ayisha");
		subscribe.getLastNameTextField().sendKeys("Sabur");
		subscribe.getCompanyTextField().sendKeys("QSpiders");
		subscribe.getPositionTextField().sendKeys("Test Engineer");
		subscribe.getSubscribeButton().click();
	}
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}
}
