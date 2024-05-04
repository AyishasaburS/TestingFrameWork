package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
		public SignInPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id = "email")
		private WebElement emailTextField;
		
		@FindBy(id = "pass")
		private WebElement passwordTextField;
		
		@FindBy(id = "send2")
		private WebElement signInButton;

		public WebElement getEmailTextField() {
			return emailTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getSignInButton() {
			return signInButton;
		}
}
