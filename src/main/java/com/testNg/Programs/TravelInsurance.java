package com.testNg.Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TravelInsurance {

	@Parameters({ "insuranceType" })
	@Test(priority = 1, groups = { "Sanity", "Regression" })
	public void insuranceType(String strInsuraneType) {

		System.out.println("Insurance Type: " + strInsuraneType);
	}

	@Parameters({ "premium" })
	@Test(priority = 2, groups = { "Regression" })
	public void propertyPremium(long premium) {

		System.out.println("Property Insurance Premium: " + premium);
	}

	@Parameters({ "tenure" })
	@Test(priority = 3, groups = { "Regression" })
	public void insuranceTenure(int intTenure) {

		System.out.println("Insurance Tenure: " + intTenure);
	}
	
	
	
}
