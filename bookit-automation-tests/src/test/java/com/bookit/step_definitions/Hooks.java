package com.bookit.step_definitions;

import java.util.concurrent.TimeUnit;

import com.bookit.utilities.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		// we put a logic that should apply to every scenario
		//Driver.getDriver().manage().deleteAllCookies();
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() {
		Driver.closeDriver();

	}

}
