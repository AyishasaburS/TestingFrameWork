package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(id  = "firstname")
private WebElement firstNameTextField;

@FindBy(id="lastname")
private WebElement lastNameTestField;

@FindBy(id = "email_address")
private WebElement emailAddressTextField;

@FindBy(id = "password")
private WebElement passwordTextField;

@FindBy(id = "password-confirmation")
private WebElement confirmPasswordTextField;

@FindBy(className = "submit")
private WebElement createAccountButton;

public WebElement getFirstNameTextField() {
	return firstNameTextField;
}

public WebElement getLastNameTestField() {
	return lastNameTestField;
}

public WebElement getEmailAddressTextField() {
	return emailAddressTextField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getConfirmPasswordTextField() {
	return confirmPasswordTextField;
}

public WebElement getCreateAccountButton() {
	return createAccountButton;
}


}
