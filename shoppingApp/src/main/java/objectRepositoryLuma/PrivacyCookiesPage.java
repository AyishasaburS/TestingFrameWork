package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyCookiesPage {
	public PrivacyCookiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h2[@id='privacy-policy-title-12']")
	private WebElement emailText;

	public WebElement getEmailText() {
	return emailText;
}
}
