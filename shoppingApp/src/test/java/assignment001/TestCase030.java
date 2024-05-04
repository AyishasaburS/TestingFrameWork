package assignment001;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.RegisterPage;

//verify user is able to get the text and print it in console
public class TestCase030 {
	WebDriver driver;
	@Test(priority = 1)
	public void launchBrowser() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test(priority = 2)
	public void registerPage() {
		HomePage homePage=new HomePage(driver);
		homePage.getAccountCreationLink().click();
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.getFirstNameTextField().sendKeys("Ayisha");
		registerPage.getLastNameTestField().sendKeys("Sabur");
		registerPage.getEmailAddressTextField().sendKeys("ayishasabur.s@gmail.com");
		registerPage.getPasswordTextField().sendKeys("Ayisha@1998");
		registerPage.getConfirmPasswordTextField().sendKeys("Ayisha@1998");
		registerPage.getCreateAccountButton().click();
	}
	
	@Test
	public void getText() {
		HomePage home=new HomePage(driver);
		System.out.println(home.getAccountCreationLink().getText());
	}
	@Test
	public void closeBrowser() {
		driver.close();
	}
}
