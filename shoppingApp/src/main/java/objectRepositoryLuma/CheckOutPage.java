package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='shipping-address-item selected-item']")
	private WebElement shippingAddressSelection;
	
	@FindBy(xpath = "//span[.='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//button//span[.='Place Order']")
	private WebElement placeOrderButton;
	
	@FindBy(linkText = "Print receipt")
	private WebElement printReceiptLink;

	public WebElement getPrintReceiptLink() {
		return printReceiptLink;
	}

	public WebElement getShippingAddressSelection() {
		return shippingAddressSelection;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}

	
	
}
