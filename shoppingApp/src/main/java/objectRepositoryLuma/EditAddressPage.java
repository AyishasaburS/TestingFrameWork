package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAddressPage {
	public EditAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id  = "firstname")
	private WebElement firstNameTextField;
	
	@FindBy(id  = "lastname")
	private WebElement lastNameTextField;
	
	@FindBy(id  = "telephone")
	private WebElement phoneNumberTextField;
	
	@FindBy(id  = "street_1")
	private WebElement street_1_TextField;
	
	@FindBy(id  = "street_2")
	private WebElement street_2_TextField;
	
	@FindBy(id  = "street_3")
	private WebElement street_3_TextField;
	
	@FindBy(id  = "zip")
	private WebElement pincodeTextField;
	
	@FindBy(id  = "country")
	private WebElement countryDropDown;

	@FindBy(className  = "save")
	private WebElement saveAddressButton;

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getStreet_1_TextField() {
		return street_1_TextField;
	}

	public WebElement getStreet_2_TextField() {
		return street_2_TextField;
	}

	public WebElement getStreet_3_TextField() {
		return street_3_TextField;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getSaveAddressButton() {
		return saveAddressButton;
	}

}