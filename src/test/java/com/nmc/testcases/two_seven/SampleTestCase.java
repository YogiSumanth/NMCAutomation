package com.nmc.testcases.two_seven;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nmc.generics.BaseClass;

public class SampleTestCase extends BaseClass {

	@BeforeMethod
	public void before_method() {

	}

	// This test case is to login
	@Test
	public void test_1() {
		boolean result = new TestCaseMethods().login();
		assertEquals(result, true, "The login is failed.");
	}

	@Test
	public void test_2() {

	}

	@AfterMethod
	public void after_method() {

	}

}
