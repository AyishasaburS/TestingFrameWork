package assignment001;
//verify  user is able to click video download button in that page
import java.time.Duration;
//verify text of the page in video download
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepositoryLuma.HomePage;
import objectRepositoryLuma.SignInPage;
import objectRepositoryLuma.TrainingPage;

public class TestCase026 {
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
	public void downloadVideo() {
		HomePage homePage=new HomePage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(homePage.getTrainingDropdown()).perform();
		action.click(homePage.getVideoDownloadLink()).perform();
		TrainingPage train=new TrainingPage(driver);
		if(train.getVideoDownloadText().getText().equals("Video Download")) {
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
	}
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}
}