package executePageClasses;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.HomePageClass;
import pageClasses.LoginPageClass;
import pageClasses.ManageExpensePageClass;

public class ManageExpensePageTestClass extends BaseClass{
	
	LoginPageClass lp;
	HomePageClass hp;
	ManageExpensePageClass lep ;
	
	
  @Test
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
  
  @Test
  public void verifyToCreateNewManageExpense() throws AWTException 
  {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  lep=new ManageExpensePageClass(driver);
	  
	  lp.Login("admin", "admin");
	  hp.clickOnManageExpense();
	  hp.clickonExpenseManage();
	  lep.clickonNewTab();
	  lep.selectValueinUserField(3);
	  lep.selectValueinCategoryField("newitem");
	  lep.selectValueinOrderId(6);
	  lep.selectValueinPurchaseId("7");
	  lep.selectValueinExpenseType(2);
	  lep.sendKeysofAmount("500");
	  lep.sendKeysofRemarksTab("SampleTestData");;
	//lep.uploadingOfFile(System.getProperty("user.dir")+"\\src\\test\\resources\\RobotFileUpload.txt");
	 lep.sampleFileUpload();
	  lep.submitonSaveButton();
	  boolean expected=lep.isSuccessfulAlertMessageDisplayed();
	  Assert.assertTrue(expected);
  
  }
  
  @Test
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
	  lep.sendKeysofAmount("newitem ");
	  lep.submitonSearch();
	  boolean actualresult=lep.isSearchResultDisplayed();
	  Assert.assertTrue(actualresult);
  
  }
  
}
