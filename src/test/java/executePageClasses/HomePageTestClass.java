package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.HomePageClass;
import pageClasses.LoginPageClass;

public class HomePageTestClass extends BaseClass{
	
	LoginPageClass lp;
	HomePageClass hp;
	
	
  @Test(groups = {"group1"})
  public void verifyAllTilesAreDisplayedOrNotInHomePage() 
    {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  
	  lp.Login("admin","admin");
	  boolean actual=hp.isAllTilesDisplayed();
	  Assert.assertTrue(actual);
	  
	  
	  
  }
}
