package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ExplicitWait;
import utilities.FluentWaitClass;
import utilities.GeneralUtilities;

public class ManageProductPageClass {
	
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();
	ExplicitWait ew=new ExplicitWait();
	FluentWaitClass fw=new FluentWaitClass();
	
	public ManageProductPageClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchTab;
	
	@FindBy(xpath = "(//*[@class='form-control'])[3]")
	WebElement productCode;
	
	@FindBy(xpath = "//*[@class='fa fa-search']")
	WebElement submitSearchButton;
	
	@FindBy(xpath = "//tbody//tr[1]//td[1]")
	WebElement searchResultDisplayed;
	
	public void clickonSearchTab()
	{
		ew.elementToBeClickableWait(driver, searchTab);
		gl.clickElement(searchTab);
		
	}
	
	public void sendKeysToProductCode(String value)
	{
		ew.presenceofElementLocatedWait(driver,"(//*[@class='form-control'])[3]");
		gl.sendKeysClickElement(productCode, value);
	}
	
	public void submitOnSearchButton()
	{
		gl.SubmitElement(submitSearchButton);
	}
	
	public boolean isSearchResultDisplayed()
	{
		fw.visibilityOfWait(driver, searchResultDisplayed);
		return gl.isDisplayedMethod(searchResultDisplayed);
	}
	
	
}
