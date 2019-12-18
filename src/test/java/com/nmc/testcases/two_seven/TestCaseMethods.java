package com.nmc.testcases.two_seven;

import com.nmc.generics.BaseClass;
import com.nmc.pages.login.UserLogin;
import com.nmc.utilities.CommonActions;
import com.nmc.utilities.ReadConfigFile;

public class TestCaseMethods extends BaseClass {

	CommonActions action = new CommonActions();
	UserLogin loginPage = new UserLogin(driver);
	ReadConfigFile config = new ReadConfigFile();

	/*
	 * this method performs 'login' process returns 'true' if login is successful
	 * else returns false
	 */
	public boolean login() {

		action.enterData(loginPage.userName, config.getUserName());
		logger.info("Entered " + config.getUserName() + " in username field.");
		action.enterData(loginPage.password, config.getPassword());
		logger.info("Entered " + config.getPassword() + " in password field.");
		action.clickElement(loginPage.submitButton);
		logger.info("");
		if (action.getPageTitle().equals("Home - Insta HMS")) {
			logger.info("");
			return true;
		}

		else {
			logger.info("");
			return false;
		}

	}

}
