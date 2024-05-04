package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='product-item' and @data-productid='13']")
	private WebElement computingAndInternetBookLink;
	
	@FindBy(xpath = "//div[@class='product-item' and @data-productid='79']")
	private WebElement copyOfComputingAndInternetExBookLink;

	@FindBy(xpath = "//div[@class='product-item' and @data-productid='45']")
	private WebElement fictionBookLink;
	
	@FindBy(xpath = "//div[@class='product-item' and @data-productid='78']")
	private WebElement fictionExBookLink;
	
	@FindBy(xpath = "//div[@class='product-item' and @data-productid='22']")
	private WebElement healthBookLink;
	
	@FindBy(xpath = "//div[@class='product-item' and @data-productid='27']")
	private WebElement scienceBookLink;

	@FindBy(xpath = "//div[@data-productid='13']//input[@class='button-2 product-box-add-to-cart-button']")
	private WebElement computingAndInternetBookAddToCartButton;
	
	@FindBy(xpath = "//div[@data-productid='45']//input[@class='button-2 product-box-add-to-cart-button']")
	private WebElement fictionBookAddToCartButton;

	@FindBy(xpath = "//div[@data-productid='22']//input[@class='button-2 product-box-add-to-cart-button']")
	private WebElement HealthBookAddToCartButton;
	
	@FindBy(id = "products-orderby")
	private WebElement sortbyDropDown;

	public WebElement getComputingAndInternetBookLink() {
		return computingAndInternetBookLink;
	}

	public WebElement getCopyOfComputingAndInternetExBookLink() {
		return copyOfComputingAndInternetExBookLink;
	}

	public WebElement getFictionBookLink() {
		return fictionBookLink;
	}

	public WebElement getSortbyDropDown() {
		return sortbyDropDown;
	}

	public WebElement getFictionExBookLink() {
		return fictionExBookLink;
	}

	public WebElement getHealthBookLink() {
		return healthBookLink;
	}

	public WebElement getScienceBookLink() {
		return scienceBookLink;
	}

	public WebElement getComputingAndInternetBookAddToCartButton() {
		return computingAndInternetBookAddToCartButton;
	}

	public WebElement getFictionBookAddToCartButton() {
		return fictionBookAddToCartButton;
	}

	public WebElement getHealthBookAddToCartButton() {
		return HealthBookAddToCartButton;
	}
}
