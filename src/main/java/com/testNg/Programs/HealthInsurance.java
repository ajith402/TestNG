package com.testNg.Programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HealthInsurance {

	String insuranceType = "Health";
	int tenure = 25;
	long premium = 17000;
	

	@Test(priority = 1, groups = {"Sanity", "Regression"})
	public void healthInsuranceDetails() {

		System.out.println("Insurance Type: " + insuranceType);
	}
	
	

	@Test(priority = 2, groups = {"Regression"})
	public void healthInsurancePremium() {

		System.out.println("Insurance Premium: " + premium);
	}

	@Test(priority = 3, groups = {"Regression"})
	public void insuranceTenure() {

		System.out.println("Premium Tenure: " + tenure);
	}

	@Test(dataProvider = "testData")
	public void displayCustomerDetails(String name, int age) {
		
		System.out.println("Name: "+name+" Age: "+age);
	}
	


	@DataProvider(name="testData")
	public Object[][] getData() {
		
		return new Object[][] {
			
			{"Ajith",27},
			{"Aishu", 26},
			{"Aarthi", 23}
			
		};
	}

}
