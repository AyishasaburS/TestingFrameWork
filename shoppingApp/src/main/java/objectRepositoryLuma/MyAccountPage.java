package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id = "default-shipping-edit-link")
	private WebElement shippingAddressEditLink;
	
	@FindBy(linkText = "My Downloadable Products")
	private WebElement myDownloadableProductLink;
	
	@FindBy(linkText  = "Change Password")
	private WebElement changePasswordLink;
	
	@FindBy(id = "current-password")
	private WebElement currentPasswordTextField;
	
	@FindBy(id = "password")
	private WebElement newPasswordTextField;
	
	@FindBy(id = "password-confirmation")
	private WebElement confirmPasswordTextField;
	
	@FindBy(xpath = "//span[.='Save']")
	private WebElement saveButton;
	
	public WebElement getCurrentPasswordTextField() {
		return currentPasswordTextField;
	}
	public WebElement getMyDownloadableProductLink() {
		return myDownloadableProductLink;
	}

	public WebElement getShippingAddressEditLink() {
		return shippingAddressEditLink;
	}

	public WebElement getNewPasswordTextField() {
		return newPasswordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public WebElement getChangePasswordLink() {
		return changePasswordLink;
	}
	
}
