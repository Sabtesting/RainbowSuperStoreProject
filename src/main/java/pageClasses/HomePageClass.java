package pageClasses;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtilities;

public class HomePageClass {
	
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();
	
	public HomePageClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='fas fa-arrow-circle-right']")
	List<WebElement>allTile;
	
	@FindBy(xpath = "(//*[contains(text(),'Manage Orders')])[2]")
	WebElement manageOrders;
	
	@FindBy(xpath = "(//a[@class='nav-link'])[5]")
	WebElement manageExpense;
	
	@FindBy(xpath = "//p[contains(text(),'Expense Category')]")
	WebElement expenseCategory;
	
	@FindBy(xpath = "(//*[contains(text(),'Manage Expense')])[2]")
	WebElement expenseManage;
	
	@FindBy(xpath = "//*[text()='Manage Product']")
	WebElement manageProduct;
	
	@FindBy(xpath = "//p[contains(text(),'Verify Users')]")
	WebElement verifyUsers;
	
	@FindBy(xpath = "//a[@class='active nav-link']")
	WebElement pushNotifications;
	
	@FindBy(xpath = "//*[@class='nav-icon fas fa-edit']")
	WebElement manageContent;
	
	@FindBy(xpath = "//*[text()='Manage Pages']")
	WebElement managePages;
	
	@FindBy(xpath = "//*[text()='Manage Footer Text']")
	WebElement manageFooterText;
	
	@FindBy(xpath = "//*[text()='Manage Contact']")
	WebElement manageContact;
	
	@FindBy(xpath = "(//*[text()='Manage News'])[1]")
	WebElement manageNews;
	
	@FindBy(xpath = "//*[@class='nav-icon fas fa-map-marker']")
	WebElement manageLocation;
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-window-restore']")
	WebElement manageSlider;
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-window-minimize']")
	WebElement mobileSlider;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Category ')]")
	WebElement manageCategory;
	
	@FindBy(xpath = "//p[text()='Category']")
	WebElement category;
	
	@FindBy(xpath = "//p[text()='Sub Category']")
	WebElement subCategory;
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-user-plus']")
	WebElement manageDeliveryBoy;
	
	@FindBy(xpath = "(//*[text()='Manage Payment Methods'])[1]")
	WebElement managePaymentMethods;
	
	@FindBy(xpath = "(//*[text()='Admin Users'])[1]")
	WebElement adminUsers;
	
	@FindBy(xpath = "//p[contains(text(),'Settings')]")
	WebElement settings;
	
	@FindBy(xpath = "//p[text()='Change Password']")
	WebElement changePassword;
	
	@FindBy(xpath = "//*[text()='Manage Menu']")
	WebElement manageMenu;
	
	@FindBy(xpath = "//p[text()='Logout']")
	WebElement logout;
	
	public boolean isAllTilesDisplayed()
	{
		
	for (WebElement element1: allTile)
		{
	        gl.isDisplayedMethod(element1);
	         
	     }
	return true;
	}

	public void clickOnManageExpense()
	{
		gl.clickElement(manageExpense);
	}
	
	public void clickonExpenseCategory()
	{
		gl.clickElement(expenseCategory);
	}
	
	public void clickonExpenseManage()
	{
		gl.clickElement(expenseManage);
	}
	
	public void clickonManageProduct()
	{
		gl.clickElement(manageProduct);
	}
	
	public void clickonVerifyUsers()
	{
		gl.clickElement(verifyUsers);
	}
	
	public void clickonPushNotifications()
	{
		gl.clickElement(pushNotifications);
	}
	
	public void clickonManageContent()
	{
		gl.clickElement(manageContact);
	}
	
	public void clickonManagePages()
	{
		gl.clickElement(managePages);
	}

	public void clickonManageFooterText()
	{
		gl.clickElement(manageFooterText);
	}
	
	public void clickonManageContact()
	{
		gl.clickElement(manageContact);;
	}
	
	public void clickonManageNews()
	{
		gl.clickElement(manageNews);
	}
	
	public void clickonManageLocation()
	{
		gl.clickElement(manageLocation);
	}
	
	public void clickonManageSlider()
	{
		gl.clickElement(manageSlider);
	}
	
	public void clickonMobileSlider()
	{
		gl.clickElement(mobileSlider);
	}
	
	public void clickonManageCategory()
	{
		gl.clickElement(manageCategory);
	}
	
	public void clickonCategory()
	{
		gl.clickElement(category);
	}
	
	public void clickonSubCategory()
	{
		gl.clickElement(subCategory);
	}
	
	public void clickonManageDeliveryBoy()
	{
		gl.clickElement(manageDeliveryBoy);
	}
	
	public void clickonManageDPaymentMethods()
	{
		gl.clickElement(managePaymentMethods);
	}
	
	public void clickonAdminUsers()
	{
		gl.clickElement(adminUsers);
	}
	
	public void clickonSettings()
	{
		gl.clickElement(settings);
	}
	
	public void clickonChangePassword()
	{
		gl.clickElement(changePassword);
	}
	
	public void clickonManageMenu()
	{
		gl.clickElement(manageMenu);
	}
	
	public void clickonLogout()
	{
		gl.clickElement(logout);
	}
	
}
