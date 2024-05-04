package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id="small-searchterms")
	private WebElement searchField;
	
	@FindBy(css = "[value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement demoWebShopLogo;
	
	@FindBy(linkText = "ayishasabur.s@gmail.com")
	private WebElement accountLink;
	
	@FindBy(xpath = "//span[.='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath = "//span[.='Wishlist']")
	private WebElement wishListLink;
	
	@FindBy(linkText = "BOOKS")
	private WebElement bookLink;
	
	@FindBy(linkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(linkText = "Desktops")
	private WebElement desktopsDropDownLink;
	
	@FindBy(linkText = "Notebooks")
	private WebElement noteBooksDropDownLink;
	
	@FindBy(linkText = "Accessories")
	private WebElement accessoriesLink;
	
	@FindBy(linkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(linkText = "Camera, photo")
	private WebElement cameraAndPhotoDropDownLink;
	
	@FindBy(linkText = "Cell phones")
	private WebElement cellPhonesDropDownLink;
	
	@FindBy(partialLinkText = "APPAREL ")
	private WebElement apparelAndShoesLink;
	
	@FindBy(linkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloadsLink;
	
	@FindBy(linkText = "JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(linkText = "GIFT CARDS")
	private WebElement giftCardsLink;
	
	@FindBy(id = "newsletter-email")
	private WebElement newsLetterEmailTextField;
	
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement newsLetterSubscribeButton;
	
	@FindBy(linkText = "Tricentis")
	private WebElement manufacturesTricentisLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(linkText = "Compare products list")
	private WebElement compareProductListLink;

	public WebElement getCompareProductListLink() {
		return compareProductListLink;
	}

	public WebElement getAccountLink() {
		return accountLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getDesktopsDropDownLink() {
		return desktopsDropDownLink;
	}

	public WebElement getNoteBooksDropDownLink() {
		return noteBooksDropDownLink;
	}

	public WebElement getAccessoriesLink() {
		return accessoriesLink;
	}

	public WebElement getCameraAndPhotoDropDownLink() {
		return cameraAndPhotoDropDownLink;
	}

	public WebElement getCellPhonesDropDownLink() {
		return cellPhonesDropDownLink;
	}

	@FindBy(linkText = "apparel")
	private WebElement popularTagsApparelLink;
	
	@FindBy(linkText = "awesome")
	private WebElement popularTagsAwesomeLink;
	
	@FindBy(linkText = "computer")
	private WebElement popularTagsComputerLink;
	
	@FindBy(linkText = "book")
	private WebElement popularTagsBookLink;
	
	@FindBy(linkText = "camera")
	private WebElement popularTagsCameraLink;
	
	@FindBy(linkText = "cell")
	private WebElement popularTagsCellLink;
	
	@FindBy(linkText = "compact")
	private WebElement popularTagsCompactLink;
	
	@FindBy(linkText = "cool")
	private WebElement popularTagsCoolLink;
	
	@FindBy(linkText = "digital")
	private WebElement popularTagsDigitalLink;
	
	@FindBy(linkText = "gift")
	private WebElement popularTagsGiftLink;
	
	@FindBy(linkText = "jewelry")
	private WebElement popularTagsJewelryLink;

	@FindBy(linkText = "nice")
	private WebElement popularTagsNiceLink;
	
	@FindBy(linkText = "shirt")
	private WebElement popularTagsShirtLink;
	
	@FindBy(linkText = "shoes")
	private WebElement popularTagsShoesLink;
	
	@FindBy(linkText = "TCP")
	private WebElement popularTagsTcpLink;
	
	
	public WebElement getDemoWebShopLogo() {
		return demoWebShopLogo;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

	public WebElement getBookLink() {
		return bookLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getNewsLetterEmailTextField() {
		return newsLetterEmailTextField;
	}

	public WebElement getNewsLetterSubscribeButton() {
		return newsLetterSubscribeButton;
	}

	public WebElement getManufacturesTricentisLink() {
		return manufacturesTricentisLink;
	}

	public WebElement getPopularTagsApparelLink() {
		return popularTagsApparelLink;
	}

	public WebElement getPopularTagsAwesomeLink() {
		return popularTagsAwesomeLink;
	}

	public WebElement getPopularTagsComputerLink() {
		return popularTagsComputerLink;
	}

	public WebElement getPopularTagsBookLink() {
		return popularTagsBookLink;
	}

	public WebElement getPopularTagsCameraLink() {
		return popularTagsCameraLink;
	}

	public WebElement getPopularTagsCellLink() {
		return popularTagsCellLink;
	}

	public WebElement getPopularTagsCompactLink() {
		return popularTagsCompactLink;
	}

	public WebElement getPopularTagsCoolLink() {
		return popularTagsCoolLink;
	}

	public WebElement getPopularTagsDigitalLink() {
		return popularTagsDigitalLink;
	}

	public WebElement getPopularTagsGiftLink() {
		return popularTagsGiftLink;
	}

	public WebElement getPopularTagsJewelryLink() {
		return popularTagsJewelryLink;
	}

	public WebElement getPopularTagsNiceLink() {
		return popularTagsNiceLink;
	}

	public WebElement getPopularTagsShirtLink() {
		return popularTagsShirtLink;
	}

	public WebElement getPopularTagsShoesLink() {
		return popularTagsShoesLink;
	}

	public WebElement getPopularTagsTcpLink() {
		return popularTagsTcpLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	

}
