package com.java.scubaPackage;


import org.testng.annotations.DataProvider;

public class Execution{
	
	@DataProvider(name="input1")
	public  Object[][] getData1() {
		return new Object[][] {
			{3, 5, 8}
		};
	}
	
	@DataProvider(name="input2")
	public  Object[][] getData2() {
		return new Object[][] {
			{5, 3, 2}
		};
	}
	
	@DataProvider(name="input3")
	public  Object[][] getData3() {
		return new Object[][] {
			{3, 5, 15}
		};
	}
	
	@DataProvider(name="input4")
	public  Object[][] getData4() {
		return new Object[][] {
			{10, 5, 2}
		};
	}
	
	@DataProvider(name="input5")
	public  Object[][] getData5() {
		return new Object[][] {
			{3, 5, 0.6}
		};
	}
	
	@DataProvider(name="input6")
	public  Object[][] getData6() {
		return new Object[][] {
			{2, 5, 32}
		};
	}
	
	@DataProvider(name="input7")
	public  Object[][] getData7() {
		return new Object[][] {
			{11, 2, 1}
		};
	}
	
	@DataProvider(name="input8")
	public  Object[][] getData8() {
		return new Object[][] {
			{2, 0.5}
		};
	}
	
}
