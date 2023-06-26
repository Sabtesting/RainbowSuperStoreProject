package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtilities;

public class ManageProductPageClass {
	
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();
	
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
		gl.clickElement(searchTab);
	}
	
	public void sendKeysToProductCode(String value)
	{
		gl.sendKeysClickElement(productCode, value);
	}
	
	public void submitOnSearchButton()
	{
		gl.SubmitElement(submitSearchButton);
	}
	
	public boolean isSearchResultDisplayed()
	{
		return gl.isDisplayedMethod(searchResultDisplayed);
	}
	
	
}
