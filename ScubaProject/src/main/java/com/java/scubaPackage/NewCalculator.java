package com.java.scubaPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewCalculator extends Execution {
	
	public String getTime() {
        Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
	    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String formattedDate=sdf.format(date);
        return formattedDate;
	}
	
	@Test(dataProvider = "input6", groups = {"arithmetic","exponential"})
	@Parameters({ "num1", "num2", "num3" })
	public void exp(int num1, int num2, int num3) {
		Assert.assertEquals(true, true);
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		double exp = Math.pow(num1, num2);
		System.out.println("Exponential of " + num1 + " & " + num2 + " =" + exp);
		Assert.assertEquals(exp, num3);
		Reporter.log("TestNG_ReportsAndLogs -> Exponential", true);
		System.out.println("I am inside Thread 2 : test case one with Thread id :" + Thread.currentThread().getId()
				+ " at time : " + getTime());
	}
	
	@Test(dataProvider = "input7", groups = {"arithmetic","modulus"})
	@Parameters({ "num1", "num2" })
	public void mod(int num1, int num2, int num3) {
		Assert.assertEquals(true, true);
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		int mod = num1 % num2;
		System.out.println("Remainder of " + num1 + " & " + num2 + " =" + mod);
		Assert.assertEquals(mod, num3);
		Reporter.log("TestNG_ReportsAndLogs -> Remainder", true);
		System.out.println("I am inside Thread 2 : test case one with Thread id :" + Thread.currentThread().getId()
				+ " at time : " + getTime());
	}
	
	@Test(dataProvider = "input8", groups = {"arithmetic","inverse"})
	@Parameters({ "num1", "num2" })
	public void inverse(double num1, double num2) {
		if (num1 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		double inv = 1 / num1;
		System.out.println("Inverse of " + num1 + " & " + num2 + " =" + inv);
		Assert.assertEquals(inv, num2);
		Reporter.log("TestNG_ReportsAndLogs -> Inverse", true);
		System.out.println("I am inside Thread 2 : test case one with Thread id :" + Thread.currentThread().getId()
				+ " at time : " + getTime());
	}
	
	@Test(groups = {"arithmetic","negation"})
	@Parameters({ "num1", "num2" })
	public void negate(int num1, int num2) {
		if (num1 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
		}
		int neg = (-1) * num1;
		System.out.println("Negate of " + num1 + " & " + num2 + " =" + neg);
		Assert.assertEquals(neg, num2);
		Reporter.log("TestNG_ReportsAndLogs -> Negate", true);
		System.out.println("I am inside Thread 2 : test case one with Thread id :" + Thread.currentThread().getId()
				+ " at time : " + getTime());
	}

}
