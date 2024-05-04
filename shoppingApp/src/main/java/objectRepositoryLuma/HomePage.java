package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText = "Create an Account")
private WebElement accountCreationLink;

@FindBy(linkText = "Sign In")
private WebElement signInLink;

@FindBy(id = "logged-in")
private WebElement loggedInText;

@FindBy(xpath = "//strong[.='My Orders']")
private WebElement myOrderLink;

@FindBy(linkText = "Subscribe")
private WebElement subscripeButton;

@FindBy(id = "search")
private WebElement searchTextField;

@FindBy(xpath = "//span[.='Training']")
private WebElement trainingDropdown;

@FindBy(linkText = "Privacy and Cookie Policy")
private WebElement privacyAndCookieLink;

@FindBy(linkText = "Tops")
private WebElement topsLink;

@FindBy(linkText = "Jackets")
private WebElement jacketsLink;

@FindBy(xpath = "//span[.='Women']")
private WebElement womenDropdown;

@FindBy(className = "logo")
private WebElement logo;

@FindBy(id = "ui-id-28")
private WebElement videoDownloadLink;

@FindBy(xpath = "//h2[.='Hot Sellers']")
private WebElement hotSalebutton;

public WebElement getHotSalebutton() {
	return hotSalebutton;
}

public WebElement getVideoDownloadLink() {
	return videoDownloadLink;
}
@FindBy(xpath = "(//div[@class='widget block block-static-block']//a[@target='_blank'])[1]")
private WebElement notesLink;

@FindBy(linkText = "Bottoms")
private WebElement bottomsLink;

@FindBy(linkText = "Pants")
private WebElement pantsLink;

public WebElement getBottomsLink() {
	return bottomsLink;
}

public WebElement getPantsLink() {
	return pantsLink;
}

public WebElement getNotesLink() {
	return notesLink;
}
@FindBy(xpath = "//span[@aria-expanded='false']//button[@class='action switch']")
private WebElement accountDropDown;

@FindBy(linkText = "My Account")
private WebElement myAccountLink;

@FindBy(linkText = "Sign Out")
private WebElement signOutLink;

public WebElement getSignOutLink() {
	return signOutLink;
}

public WebElement getAccountDropDown() {
	return accountDropDown;
}

public WebElement getMyAccountLink() {
	return myAccountLink;
}

public WebElement getLogo() {
	return logo;
}

public WebElement getTopsLink() {
	return topsLink;
}

public WebElement getJacketsLink() {
	return jacketsLink;
}

public WebElement getWomenDropdown() {
	return womenDropdown;
}

public WebElement getSignInLink() {
	return signInLink;
}

public WebElement getTrainingDropdown() {
	return trainingDropdown;
}

public WebElement getAccountCreationLink() {
	return accountCreationLink;
}


public WebElement getPrivacyAndCookieLink() {
	return privacyAndCookieLink;
}

public WebElement getLoggedInText() {
	return loggedInText;
}

public WebElement getSearchTextField() {
	return searchTextField;
}

public WebElement getSubscripeButton() {
	return subscripeButton;
}

public WebElement getMyOrderLink() {
	return myOrderLink;
}


}
