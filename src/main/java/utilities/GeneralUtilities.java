package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {

	public void clickElement(WebElement element) {
		element.click();
	}

	public void clearElement(WebElement element) {
		element.clear();
	}

	public void typeElement(WebElement element, String text) {
		element.sendKeys(text);
	}

	public void sendKeysClickElement(WebElement element, String click) {
		element.sendKeys(click);
	}

	public String getTextofElement(WebElement element) {
		return element.getText();

	}

	public String getTitleofElement(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrenturl(WebDriver driver) {
		return driver.getCurrentUrl();

	}

	public boolean isDisplayedMethod(WebElement element) {
		return element.isDisplayed();

	}

	public boolean isSelectedMethod(WebElement element) {
		return element.isSelected();
	}

	public boolean isEnabledMethod(WebElement element) {
		return isEnabledMethod(element);

	}

	public void clickElementJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void scrollToAnElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void selectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public void selectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void addThreadSleep() throws InterruptedException {
		Thread.sleep(2000);
	}

	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void alertGetText(WebDriver driver) {
		driver.switchTo().alert().getText();
	}

	public void alertSendKeys(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	public void fileUploading(WebElement element,String value) {
		element.sendKeys(value);;
	}

	public void SubmitElement(WebElement element) {
		element.submit();
	}

	
}
