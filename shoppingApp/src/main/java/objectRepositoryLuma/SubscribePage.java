package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribePage {
	public SubscribePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id  = "mce-EMAIL")
	private WebElement emailTextField;
	
	@FindBy(id  = "mce-FNAME")
	private WebElement firstNameTextField;

	@FindBy(id  = "mce-LNAME")
	private WebElement lastNameTextField;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getPositionTextField() {
		return positionTextField;
	}

	public WebElement getSubscribeButton() {
		return subscribeButton;
	}
	@FindBy(id  = "mce-COMPANY")
	private WebElement companyTextField;
	
	@FindBy(id  = "mce-POSITION")
	private WebElement positionTextField;

	@FindBy(id  = "mc-embedded-subscribe")
	private WebElement subscribeButton;

	
}
