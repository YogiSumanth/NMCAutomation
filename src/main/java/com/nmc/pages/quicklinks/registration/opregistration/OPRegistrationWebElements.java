package com.nmc.pages.quicklinks.registration.opregistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nmc.pages.homepage.QuickLinks;
import com.nmc.utilities.CommonActions;

import lombok.Getter;//This is used when we just want get methods . for both get and set method we have "lombok.Data"

/**
 * Dd = DropDown Lt = LinkText Tf = TextFields RBtn=radio button
 * @author manish
 *
 */
@Getter
public class OPRegistrationWebElements {
	QuickLinks homePagequickLinks;
	CommonActions commonActions;

	public OPRegistrationWebElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
		homePagequickLinks = new QuickLinks(driver);
		commonActions = new CommonActions();
	}

	public void navigateToOpRegScr() {
		CommonActions.clickElement(homePagequickLinks.registrationdd);
		CommonActions.clickElement(opRegHyperLink);
	}

	// OP Registration link
	@FindBy(linkText = "OP Registration")
	private WebElement opRegHyperLink;

	// Patient Details
	@FindBy(id = "regTyperegd")
	private WebElement mrNoRBtn;

	@FindBy(id = "mrno")
	private WebElement mrNoTextfield;

	// Basic Information
	@FindBy(id = "salutation")
	private WebElement salutationDd;

	@FindBy(id = "patient_name")
	private WebElement firstName;

	@FindBy(id = "middle_name")
	private WebElement middleName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "reg_patient_phone")
	private WebElement mobNo;

	@FindBy(id = "age")
	private WebElement age;

	// Additional patient information
	@FindBy(id = "custom_list1_value")
	private WebElement nationalityDd;

	@FindBy(id = "custom_list7_value")
	private WebElement consentCollectedDd;

	@FindBy(id = "identifier_id")
	private WebElement idTypeDd;

	// Visit Information
	@FindBy(id = "dept_name")
	private WebElement departmentDd;

	@FindBy(id = "doctor_name")
	private WebElement consultingDoctor;

	@FindBy(id = "doctorCharge")
	private WebElement cosultationTypeDd;

	@FindBy(id = "registerBtn")
	private WebElement registerBtn;

	@FindBy(id = "relation")
	private WebElement nxtKinName;

	public WebElement getMrNoRBtn() {
		return mrNoRBtn;
	}

	public WebElement getMrNoTextfield() {
		
		return mrNoTextfield;
	}

	public WebElement getSalutationDd() {
		
		return salutationDd;
	}

	public WebElement getFirstName() {
		
		return firstName;
	}

	public WebElement getMobNo() {
		
		return mobNo;
	}

	public WebElement getAge() {
		
		return age;
	}

	public WebElement getNxtKinName() {
		
		return nxtKinName;
	}

}
