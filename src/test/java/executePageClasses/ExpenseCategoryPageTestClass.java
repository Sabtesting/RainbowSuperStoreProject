package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.ExpenseCategoryPageClass;
import pageClasses.HomePageClass;
import pageClasses.LoginPageClass;

public class ExpenseCategoryPageTestClass extends BaseClass{
	
	LoginPageClass lp;
	HomePageClass hp;
	ExpenseCategoryPageClass ep;
	
	
  @Test (priority = 0)
  public void verifyExpensecategoryPageIsDisplayedOrNot()
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ep=new ExpenseCategoryPageClass(driver);
	  
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseCategory();
	  String actual=ep.getTextofExpenseCategoryHeading();
	  String expected="Expense Category";
	  Assert.assertEquals(actual, expected);
  }
  
  @Test (priority = 1)
  public void verifyToCreateNewExpenseinExpensecategoryPage()
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ep=new ExpenseCategoryPageClass(driver);
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseCategory();
	  ep.clickOnNewTab();
	  ep.sendKeystoTitleField("SampleTestData");
	  ep.clickOnSave();
	  boolean actual=ep.isAlertMessageDisplayed();
	  Assert.assertTrue(actual);
	  	  
  }
  
  @Test (priority = 2)
  public void verifyToSearchCreatedExpenseinExpensecategoryPage()
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ep=new ExpenseCategoryPageClass(driver);
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseCategory();
	  ep.clickOnSearch();
	  ep.sendKeystoTitleOfSearchElement("SampleTestData");
	  ep.clickOnSearchButton();
	  boolean actualResult=ep.isSearchResultDisplayed();
	  Assert.assertTrue(actualResult);
  }
  
  @Test (priority = 3)
  public void verifyToDeleteCreatedExpenseinExpensecategoryPage()
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ep=new ExpenseCategoryPageClass(driver);
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseCategory();
	  ep.clickOnSearch();
	  ep.sendKeystoTitleOfSearchElement("SampleTestData");
	  ep.clickOnSearchButton();
	  ep.clickOnDelete();
	  ep.acceptAlertMessageDisplayed();
	  boolean actualRes=ep.isDeleteAlertMessageConfirmationDisplayed();
	  Assert.assertTrue(actualRes);
  }
  
  
}
