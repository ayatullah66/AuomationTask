package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	protected static void ClickButton (WebElement button) {
		button.click(); 
	}
	
	protected static void SendText(WebElement text , String value) {
		text.sendKeys(value);
	}
	
	protected static void clearText(WebElement text) {
		text.clear();
	}
	
	protected static void SubmitText(WebElement text) {
		text.submit();
	}

}
