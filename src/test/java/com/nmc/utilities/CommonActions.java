package com.nmc.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nmc.generics.BaseClass;

public class CommonActions extends BaseClass {

	// click on element.
	public void clickElement(WebElement element) {
		element.click();
	}

	// Enter data in the field.
	public void enterData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void selectDropdownByIndex(int index, WebElement element) {
		Select dd = new Select(element);
		dd.selectByIndex(index);
	}

	public static void selectDropdownByOption(String option, WebElement element) {
		Select dd = new Select(element);
		dd.selectByVisibleText(option);
	}

	public static String getText(WebElement element) {
		return element.getText();
	}

	public static void goToTheUrl(String url) {
		driver.navigate().to(url);
	}

	public static void clearField(WebElement element) {
		element.clear();
	}

	public static String getAttributeValue(String value, WebElement element) {
		// String value="";// this is used to get the value from text field
		return element.getAttribute(value);
	}

	// Returns page title
	public String getPageTitle() {
		return driver.getTitle();
	}

}
