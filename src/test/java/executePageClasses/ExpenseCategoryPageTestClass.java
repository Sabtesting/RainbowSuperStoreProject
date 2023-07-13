package executePageClasses;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.ExpenseCategoryPageClass;
import pageClasses.HomePageClass;
import pageClasses.LoginPageClass;

public class ExpenseCategoryPageTestClass extends BaseClass{
	
	LoginPageClass lp;
	HomePageClass hp;
	ExpenseCategoryPageClass ep;
	
	
  @Test (priority = 1,groups = {"group1"})
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
  
  @Test (priority = 0,groups = {"create"})
  public void verifyToCreateNewExpenseinExpensecategoryPage() throws IOException
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ep=new ExpenseCategoryPageClass(driver);
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseCategory();
	  ep.clickOnNewTab();
	  ep.sendKeystoTitleField(ep.readExpense(1, 1));
	  ep.clickOnSave();
	  boolean actual=ep.isAlertMessageDisplayed();
	  Assert.assertTrue(actual);
	  	  
  }
  
  @Test (priority = 2,groups = {"search"})
  public void verifyToSearchCreatedExpenseinExpensecategoryPage() throws IOException
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ep=new ExpenseCategoryPageClass(driver);
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseCategory();
	  ep.clickOnSearch();
	  ep.sendKeystoTitleOfSearchElement(ep.readExpense(1, 1));
	  ep.clickOnSearchButton();
	  boolean actualResult=ep.isSearchResultDisplayed();
	  Assert.assertTrue(actualResult);
  }
  
  @Test (priority = 3,groups = {"delete"})
  public void verifyToDeleteCreatedExpenseinExpensecategoryPage() throws IOException
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  ep=new ExpenseCategoryPageClass(driver);
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseCategory();
	  ep.clickOnSearch();
	  ep.sendKeystoTitleOfSearchElement(ep.readExpense(1, 1));
	  ep.clickOnSearchButton();
	  ep.clickOnDelete();
	  ep.acceptAlertMessageDisplayed();
	  boolean actualRes=ep.isDeleteAlertMessageConfirmationDisplayed();
	  Assert.assertTrue(actualRes);
  }
  
  
}
