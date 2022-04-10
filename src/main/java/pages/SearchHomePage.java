package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHomePage extends BasePage{

	public SearchHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "input.gLFyf.gsfi")
	WebElement searchbox;
	
	@FindBy(css = "input.gNO89b")
	WebElement searchbtn;
	
	@FindBy(linkText = "صور")
	WebElement searchimageslink;
	
	
	public void UserSearchByText(String searchtext) throws InterruptedException {
		SendText(searchbox, searchtext);
		Thread.sleep(2000);
		ClickButton(searchbtn);
	 }
	
	
	public void OpenGooglephotos() {
		ClickButton(searchimageslink);
	}
	


}
