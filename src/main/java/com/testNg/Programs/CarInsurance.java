package com.testNg.Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarInsurance {

	String carModel = "VOLVO";
	int tenure = 8;
	long premium = 150000;
	String insuranceType = "CarInsurance";

	@Test(groups = { "Sanity", "Regression" })
	public void insuranceType() {

		System.out.println("Insurance Type: " + insuranceType);
	}

	@Test(priority = 1, groups = { "Regression" })
	public void carDetails() {

		System.out.println("Car Model: " + carModel);
	}

	@Test(priority = 2, groups = { "Regression" })
	public void carPremium() {

		System.out.println("Car Premium: " + premium);
	}

	@Test(priority = 3, groups = { "Regression" })
	public void insuranceTenure() {

		System.out.println("Premium Tenure: " + tenure);
	}

	
}
