package com.rackspace.ccp.di;

public class TestStarted {
	private final Class testClass;

	public TestStarted(Class testClass) {
		this.testClass = testClass;
	}

	public Class getTestClass() {
		return testClass;
	}
}