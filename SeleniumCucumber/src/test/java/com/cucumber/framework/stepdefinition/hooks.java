package com.cucumber.framework.stepdefinition;


import java.io.File;

import org.openqa.selenium.OutputType;

import com.cucumber.framework.settings.ObjectRepo;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.utilclass;

public class hooks {
	utilclass util;
	 public hooks() {
		 
		  util = new utilclass(ObjectRepo.driver);
		 }
	 @Before
	 public void BeforeSteps(Scenario scenario) {
	 
		 util.scenario =  scenario; 
		 
		 
		
	 }
	 
}
