package com.rackspace.ccp.di;

public class TestFinished {

	private final Class testClass;

	public TestFinished(Class testClass) {
		this.testClass = testClass;
	}

	public Class getTestClass() {
		return testClass;
	}
}