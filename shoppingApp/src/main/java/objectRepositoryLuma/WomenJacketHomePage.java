package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenJacketHomePage {
	public WomenJacketHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText = "Olivia 1/4 Zip Light Jacket")
private WebElement firstJacketLink;

@FindBy(xpath = "//span[@data-ui-id='page-title-wrapper']")
private WebElement title;

public WebElement getTitle() {
	return title;
}

public WebElement getFirstJacketLink() {
	return firstJacketLink;
}



}
