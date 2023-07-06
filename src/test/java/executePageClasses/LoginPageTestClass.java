package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.LoginPageClass;
import retryAnalyzer.RetryAnalyzer;

public class LoginPageTestClass extends BaseClass {
	
	LoginPageClass lp;
	
	
  @Test (priority = 1, dataProviderClass = DataProviderLogin.class,dataProvider = "SuccessfulLoginDp",retryAnalyzer = RetryAnalyzer.class)
  public void verifySuccessfulLogin(String username,String pswd) 
  {
	lp=new LoginPageClass(driver);
	lp.Login(username,pswd);
	String actual=lp.getTextofMessageDisplayed();
	String expected="Admin";
	Assert.assertEquals(actual, expected);
		
  }
  
  @Test (priority = 0, dataProviderClass = DataProviderLogin.class,dataProvider = "UnsuccessfulLoginDp",retryAnalyzer = RetryAnalyzer.class)
  public void verifyUnSuccessfulLogin(String uname,String password) 
  {
	  lp=new LoginPageClass(driver);
	  lp.Login(uname,password);
	  boolean actual=lp.isErrorMessageDisplayed();
	  Assert.assertTrue(actual);
  }
  
  @Test (priority = 2,retryAnalyzer = RetryAnalyzer.class)
  public void verifyRememberMeCheckBoxIsSelectedByDefaultOrNot() 
  {
	  lp=new LoginPageClass(driver);
	  boolean actualResult=lp.isRememberMeCheckBoxSelected();
	  Assert.assertFalse(actualResult);
  }
  
  
  
  
}
