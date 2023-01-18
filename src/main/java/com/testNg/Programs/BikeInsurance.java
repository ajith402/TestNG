package com.testNg.Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BikeInsurance {

	String bikeModel = "KTM";
	int tenure = 5;
	long premium = 25000;
	String insuranceType="BikeInsurance";
	
	
	@Test(groups = {"Sanity", "Regression"})
	public void insuranceType() {
		
		System.out.println("Insurance Type: " + insuranceType);
	}

	@Test(priority = 1, groups = {"Regression"}, dependsOnMethods={"insuranceType"})	
	public void bikeDetails() {

		System.out.println("Bike Model: " + bikeModel);
	}

	@Test(priority = 2, groups = {"Regression"}, timeOut = 40000)
	public void bikePremium() {

		System.out.println("Bike Premium: " + premium);
		//Assert.assertTrue(false);
	}

	@Test(priority = 3, groups = {"Regression"}, enabled=false)
	public void insuranceTenure() {

		System.out.println("Premium Tenure: " + tenure);
	}

}
