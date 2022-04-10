package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SearchByImagePage extends BasePage{

	public SearchByImagePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(css = "div.ZaFQO")
	WebElement Camerabtn;
	
	@FindBy(css = "a.iOGqzf.H4qWMc.aXIg1b")
	WebElement UploadImagebtn;
	
	@FindBy(id = "awyMjb")
	WebElement ChoosePhotobtn;
	
	@FindBy(css = "a.fKDtNb")
	public WebElement ResultLinktxt;
	
	
	
	public void UploadImage(String imagePath) throws InterruptedException {
		ClickButton(Camerabtn);
		ClickButton(UploadImagebtn);
		Thread.sleep(3000);
		SendText(ChoosePhotobtn, imagePath);
		
	}
	
	public void OpensearchResult() {
		ClickButton(ResultLinktxt);	
	}
	
	
	


}
