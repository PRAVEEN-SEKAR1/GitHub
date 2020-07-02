package com.java.scubaPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Calculator extends Execution{
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Suite Started");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Suite Ended");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Class Started");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Class Ended");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Method Started");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Method Ended");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test Started");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Test Ended");
	}
	
	public String getTime() {
        Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
	    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String formattedDate=sdf.format(date);
        return formattedDate;
	}
	
	@Test(dataProvider = "input1", groups ={"arithmetic","add"})
	@Parameters({ "num1", "num2", "num3" })
	public void add(int num1, int num2, int num3) throws InterruptedException {
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " & " + num2 + " =" + sum);
		Assert.assertEquals(sum, num3);
		Reporter.log("TestNG_ReportsAndLogs -> Sum", true);
		System.out.println("I am inside Thread 1 : test case one with Thread id :" + Thread.currentThread().getId()
				+ " at time : " + getTime());
	}
	
	@Test(dataProvider = "input2", groups = {"arithmetic","subtract"})
	@Parameters({ "num1", "num2", "num3" })
	public void sub(int num1, int num2, int num3) throws InterruptedException {
		int sub = num1 - num2;
		System.out.println("Difference of " + num1 + " & " + num2 + " =" + sub);
		Assert.assertEquals(sub, num3);
		Reporter.log("TestNG_ReportsAndLogs -> Difference", true);
		System.out.println("I am inside Thread 1 : test case one with Thread id :" + Thread.currentThread().getId()
				+ " at time : " + getTime());
	}

	@Test(dataProvider = "input3", groups = {"arithmetic","multiply"})
	@Parameters({ "num1", "num2", "num3" })
	public void mul(int num1, int num2, int num3) throws InterruptedException {
		int mul = num1 * num2;
		System.out.println("Product of " + num1 + " & " + num2 + " =" + mul);
		Assert.assertEquals(mul, num3);
		Reporter.log("TestNG_ReportsAndLogs -> Product", true);
		System.out.println("I am inside Thread 1 : test case one with Thread id :" + Thread.currentThread().getId()
				+ " at time : " + getTime());
	}

	@Test(dataProvider = "input4", groups = {"arithmetic","divide"})
	@Parameters({ "num1", "num2", "num3" })
	public void divInt(int num1, int num2, int num3) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		int div = num1 / num2;
		System.out.println("Quotient of " + num1 + " & " + num2 + " =" + div);
		Assert.assertEquals(div, num3);
		Reporter.log("TestNG_ReportsAndLogs -> Quotient", true);
		System.out.println("I am inside Thread 1 : test case one with Thread id :" + Thread.currentThread().getId()
				+ " at time : " + getTime());
	}

	
	@Test(dataProvider = "input5", groups = {"arithmetic","divide"})
	@Parameters({ "num1", "num2", "num3" })
	public void divReal(double num1, double num2, double num3) {
		Assert.assertEquals(true, true);
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		double div = num1 / num2;
		System.out.println("Quotient of " + num1 + " & " + num2 + " =" + div);
		Assert.assertEquals(div, num3);
		Reporter.log("TestNG_ReportsAndLogs -> Quotient", true);
		System.out.println("I am inside Thread 1 : test case one with Thread id :" + Thread.currentThread().getId()
				+ " at time : " + getTime());
	}
	
}

