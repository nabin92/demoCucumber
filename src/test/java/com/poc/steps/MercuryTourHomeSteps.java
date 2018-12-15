package com.poc.steps;

import com.poc.pages.MercuryTourHome;
import com.poc.webdriver.WebConnector;

import cucumber.api.java.en.And;

public class MercuryTourHomeSteps {
WebConnector con;
	
	public MercuryTourHomeSteps(WebConnector con) {
		this.con=con;
	}
	
	@And("^I click link register$")
	public void clickRegister() throws InterruptedException {
		MercuryTourHome mt=new MercuryTourHome(con.driver);
		mt.clickRegister();
		
	}

}
