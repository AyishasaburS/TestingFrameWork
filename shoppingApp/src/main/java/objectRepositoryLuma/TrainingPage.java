package objectRepositoryLuma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingPage {
	public TrainingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getVideoDownloadText() {
		return videoDownloadText;
	}
	@FindBy(xpath = "//span[.='Video Download' and @class='base']")
	private WebElement videoDownloadText;
}
