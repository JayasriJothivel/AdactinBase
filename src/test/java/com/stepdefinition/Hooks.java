package com.stepdefinition;

import com.lipglobal.LibGlobal;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends LibGlobal {

	@Before
	public void beforeExecution() {
		launchBrowser();
		launchUrl("http://adactinhotelapp.com/");
		winMaximize();
		waitsImplicit();
	}
	@After
	public void afterExecution() {
		quitBrowser();
	}
}
