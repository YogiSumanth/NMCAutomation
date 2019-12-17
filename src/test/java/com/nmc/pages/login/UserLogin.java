package com.nmc.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nmc.generic.BaseClass;

public class UserLogin extends BaseClass {

	public UserLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Web elements in the login page
	@FindBy(id = "userId")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(id = "button")
	public WebElement submitButton;

}
