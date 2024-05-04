package assignment001;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.SignInPage;

//verify user is able to search any product in search text field
public class TestCase019 {
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
	public void searchProduct() throws AWTException {
		HomePage home=new HomePage(driver);
		home.getSearchTextField().sendKeys("tops");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}
}
