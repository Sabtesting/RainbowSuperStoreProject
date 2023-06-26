package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.HomePageClass;
import pageClasses.LoginPageClass;
import pageClasses.ManageProductPageClass;

public class ManageProductPageTestClass extends BaseClass {
	
	LoginPageClass lp;
	HomePageClass hp;
	ManageProductPageClass mpp;
	
	
	
  @Test
  public void verifyToSearchAProductInManageProductPage() 
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  mpp=new ManageProductPageClass(driver);
	  	  
	  lp.Login("admin", "admin");
	  hp.clickonManageProduct();
	  mpp.clickonSearchTab();
	  mpp.sendKeysToProductCode("1185");
	  mpp.submitOnSearchButton();
	  boolean actRes=mpp.isSearchResultDisplayed();
	  Assert.assertTrue(actRes);
	  
  }
  
   
  
}
