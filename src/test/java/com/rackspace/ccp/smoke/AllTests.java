package com.rackspace.ccp.smoke;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestCase1.class,
	TestCase2.class
})
public class AllTests {
	
	@BeforeClass
	public static void setup() {
		System.out.println("Suite setup");
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("Suite tear down");
	}
}