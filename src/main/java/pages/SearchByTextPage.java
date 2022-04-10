package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchByTextPage extends BasePage{

	public SearchByTextPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "div.NJo7tc.Z26q7c.jGGQ5e")
	WebElement topicTitle;
	
	@FindBy(css = "input.gLFyf.gsfi")
	WebElement searchbox;
	
	@FindBy(id = "fprsl")
	public WebElement correctKeyword;
	
	public void OpenTopiclink() {
		ClickButton(topicTitle);
	}
	
	public void SearchByMisspelledText() {
		clearText(searchbox);
		SendText(searchbox, "action movei");
		SubmitText(searchbox);
	}
	
}
