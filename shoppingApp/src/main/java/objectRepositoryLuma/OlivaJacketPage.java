package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class OlivaJacketPage {
	public OlivaJacketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[.='XS']")
	private WebElement xsSizeButton;
	
	@FindBy(xpath = "//div[.='M']")
	private WebElement mSizeButton;
	
	@FindBy(xpath = "//a//span[.='My Cart']")
	private WebElement myCartLink;
	
	@FindBy(id = "top-cart-btn-checkout")
	private WebElement checkOutButton;

	
	@FindBy(id = "option-label-color-93-item-50")
	private WebElement blueColorButton;
	
	@FindBy(id = "option-label-color-93-item-57")
	private WebElement purpleColorButton;
	
	@FindBy(id = "product-addtocart-button")
	private WebElement addToCartButton;
	
	@FindBy(linkText = "Add to Wish List")
	private WebElement wishListLink;
	
	@FindBy(linkText = "Add to Compare")
	private WebElement addToCompareLink;
	
	@FindBy(id = "qty")
	private WebElement quantityTextBox;
	
	@FindBy(linkText ="Reviews")
	private WebElement reviewsLink;
	
	@FindBy(id = "Rating_3_label")
	private WebElement rating3Label;
	
	@FindBy(id = "summary_field")
	private WebElement summaryField;
	
	@FindBy(id = "review_field")
	private WebElement reviewField;
	
	@FindBy(id = "nickname_field")
	private WebElement nicknameField;
	
	@FindBy(xpath = "//span[.='Submit Review']")
	private WebElement submitReviewButton;

	public WebElement getReviewsLink() {
		return reviewsLink;
	}
	public WebElement getRating3Label() {
		return rating3Label;
	}
	public WebElement getSummaryField() {
		return summaryField;
	}
	public WebElement getReviewField() {
		return reviewField;
	}
	public WebElement getNicknameField() {
		return nicknameField;
	}
	public WebElement getSubmitReviewButton() {
		return submitReviewButton;
	}
	public WebElement getAddToCompareLink() {
		return addToCompareLink;
	}
	public WebElement getXsSizeButton() {
		return xsSizeButton;
	}
	public WebElement getBlueColorButton() {
		return blueColorButton;
	}
	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	public WebElement getWishListLink() {
		return wishListLink;
	}
	public WebElement getQuantityTextBox() {
		return quantityTextBox;
	}
	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	public WebElement getMyCartLink() {
		return myCartLink;
	}
	public WebElement getmSizeButton() {
		return mSizeButton;
	}
	public WebElement getPurpleColorButton() {
		return purpleColorButton;
	}
}