package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchHomePage;
import pages.SearchByTextPage;

public class SearchByTextTest extends TestBase{
	
	SearchHomePage homepageobj;
	SearchByTextPage searchtextpageobj;
	
	String Searchtext = "software test";
	
	
	@Test(priority = 0)
	public void UserOpenTopicLink() throws InterruptedException {
		homepageobj = new SearchHomePage(driver);
		homepageobj.UserSearchByText(Searchtext);
		Thread.sleep(3000);
		searchtextpageobj = new SearchByTextPage(driver);
		searchtextpageobj.OpenTopiclink();
		Thread.sleep(2000);
		driver.navigate().back();		
	}
	
	@Test(priority = 1)
	public void UserSearchByMisspelledKeyword() {
		searchtextpageobj.SearchByMisspelledText();
		String CorrectText = searchtextpageobj.correctKeyword.getText();
		System.out.println(CorrectText);
		Assert.assertEquals(CorrectText, "action movie");
		
	}
	
	

}
