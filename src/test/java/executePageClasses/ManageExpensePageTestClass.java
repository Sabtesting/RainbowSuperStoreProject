package executePageClasses;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.HomePageClass;
import pageClasses.LoginPageClass;
import pageClasses.ManageExpensePageClass;

public class ManageExpensePageTestClass extends BaseClass{
	
	LoginPageClass lp;
	HomePageClass hp;
	ManageExpensePageClass lep ;
	
	
  @Test(groups = {"group1"})
  public void verifyManageExpensePageIsDisplayedOrNot() 
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  lep=new ManageExpensePageClass(driver);
	  	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseManage();
	  String actual=lep.getTextofManageExpenseTitle();
	  String expect="List Expense";
	  Assert.assertEquals(actual, expect);
  }
  
  @Test(groups = {"create"})
  public void verifyToCreateNewManageExpense() throws AWTException, IOException 
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  lep=new ManageExpensePageClass(driver);
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseManage();
	  lep.clickonNewTab();
	  lep.selectValueinUserField(4);
	  lep.selectValueinCategoryField(lep.readvalue(4, 2));
	  lep.selectValueinOrderId(6);
	  lep.selectValueinPurchaseId("7");
	  lep.selectValueinExpenseType(2);
	  lep.sendKeysofAmount(lep.readIntvalue(6, 2));
	  lep.sendKeysofRemarksTab(lep.readvalue(1, 1));;
	//lep.uploadingOfFile(System.getProperty("user.dir")+"\\src\\test\\resources\\RobotFileUpload.txt");
	 lep.sampleFileUpload();
	  lep.submitonSaveButton();
	  boolean expected=lep.isSuccessfulAlertMessageDisplayed();
	  Assert.assertTrue(expected);
  
  }
  
  @Test(groups = {"search"})
  public void verifyToSearchCreatedManageExpense() 
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  lep=new ManageExpensePageClass(driver);
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseManage();
	  lep.clickonSearchTab();
	  lep.searchInUsersTab(3);
	  lep.sendKeysofAmount("newitem");
	  lep.submitonSearch();
	  boolean actualresult=lep.isSearchResultDisplayed();
	  Assert.assertTrue(actualresult);
  
  }
  
}
