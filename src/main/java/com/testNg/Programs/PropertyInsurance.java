package com.testNg.Programs;

import org.testng.annotations.Test;

public class PropertyInsurance {

	String propertyType = "Villa";
	int tenure = 15;
	long premium = 180000;

	String insuranceType="PropertyInsurance";
	
	
	@Test(groups = {"Sanity", "Regression"})
	public void insuranceType() {
		
		System.out.println("Insurance Type: " + insuranceType);
	}

	
	@Test(priority = 1, groups = {"Regression"})
	public void properyDetails() {

		System.out.println("Property Type: " + propertyType);
	}

	@Test(priority = 2, groups = {"Regression"})
	public void propertyPremium() {

		System.out.println("Property Insurance Premium: " + premium);
	}

	@Test(priority = 3, groups = {"Regression"})
	public void insuranceTenure() {

		System.out.println("Insurance Tenure: " + tenure);
	}

}
