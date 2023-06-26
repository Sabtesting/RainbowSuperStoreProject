package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.LoginPageClass;

public class LoginPageTestClass extends BaseClass {
	
	LoginPageClass lp;
	
	
  @Test (dataProviderClass = DataProviderLogin.class,dataProvider = "SuccessfulLoginDp")
  public void verifySuccessfulLogin(String username,String pswd) 
  {
	lp=new LoginPageClass(driver);
	lp.Login(username,pswd);
	String actual=lp.getTextofMessageDisplayed();
	String expected="Admin";
	Assert.assertEquals(actual, expected);
		
  }
  
  @Test (dataProviderClass = DataProviderLogin.class,dataProvider = "UnsuccessfulLoginDp")
  public void verifyUnSuccessfulLogin(String uname,String password) 
  {
	  lp=new LoginPageClass(driver);
	  lp.Login(uname,password);
	  boolean actual=lp.isErrorMessageDisplayed();
	  Assert.assertTrue(actual);
  }
  
  @Test
  public void verifyRememberMeCheckBoxIsSelectedByDefaultOrNot() 
  {
	  lp=new LoginPageClass(driver);
	  boolean actualResult=lp.isRememberMeCheckBoxSelected();
	  Assert.assertFalse(actualResult);
  }
  
  
  
  
}
