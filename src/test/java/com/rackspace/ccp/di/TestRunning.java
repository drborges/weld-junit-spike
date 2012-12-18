package com.rackspace.ccp.di;

public class TestRunning {
	private final Class testClass;

	public TestRunning(Class testClass) {
		this.testClass = testClass;
	}

	public Class getTestClass() {
		return testClass;
	}
}