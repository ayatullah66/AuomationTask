package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchHomePage;
import pages.SearchByImagePage;

public class SearchByImageTest extends TestBase{
	
	SearchHomePage homepageobj;
	SearchByImagePage searchimageobj;
	
	String ImageName = "bmw.png";
	String Imagepath = System.getProperty("user.dir")+"/Uploads/"+ImageName;
	
    @Test
	public void UserUploadImage() throws InterruptedException {
		homepageobj = new SearchHomePage(driver);
		homepageobj.OpenGooglephotos();
		searchimageobj = new SearchByImagePage(driver);
		searchimageobj.UploadImage(Imagepath);	
		Assert.assertTrue(searchimageobj.ResultLinktxt.getText().contains("bmw"));
		searchimageobj.OpensearchResult();
	}
    
    

}




