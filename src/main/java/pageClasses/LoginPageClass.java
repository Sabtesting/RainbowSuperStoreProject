package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class LoginPageClass {
	
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();

	public LoginPageClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signIn;
	
	@FindBy(xpath = "//a[text()=' Admin']")
	WebElement adminText;
	
	@FindBy(xpath = "//*[@class='alert alert-danger alert-dismissible']")
	WebElement errorMessage;
	
	@FindBy(xpath = "//input[@name='remember_me']")
	WebElement rememeberMeCheckBox;
	
	public void Login(String usrname,String pswd)
	{
	gl.typeElement(userName, usrname);
	gl.typeElement(password, pswd);
	gl.clickElement(signIn);
	}
	
	public String getTextofMessageDisplayed()
	{
		return gl.getTextofElement(adminText);
		
	}
	
	public boolean isErrorMessageDisplayed()
	{
		return gl.isDisplayedMethod(errorMessage);
	}
		
	public boolean isRememberMeCheckBoxSelected()
	{
		return gl.isSelectedMethod(rememeberMeCheckBox);
	}
	
}
