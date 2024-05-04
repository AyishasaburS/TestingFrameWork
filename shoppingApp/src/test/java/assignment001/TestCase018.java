package assignment001;
//verify user is able to verify the text of the jacket web page
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.SignInPage;
import objectRepositoryLuma.WomenJacketHomePage;

public class TestCase018 {
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
	public void textMatching() {
		HomePage homePage=new HomePage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(homePage.getWomenDropdown()).perform();
		action.moveToElement(homePage.getTopsLink()).perform();
		action.click(homePage.getJacketsLink()).perform();
		action.moveToElement(homePage.getLogo()).perform();
		WomenJacketHomePage women=new WomenJacketHomePage(driver);
		if(women.getTitle().getText().equals("Jackets")) {
			System.out.println("Title Matched as per requirement");
		}
		else {
			System.out.println("Title Not Matched");
		}
	}
	
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}
}
