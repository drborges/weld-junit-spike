package com.rackspace.ccp.di;

import javax.enterprise.event.Observes;

public class TestRunnerListener {

	public void onTestRunning(@Observes TestStarted event) {
		System.out.println("Test just started: " + event.getTestClass().getName());
	}
	
	public void onTestFinished(@Observes TestFinished event) {
		System.out.println("Test finished running: " + event.getTestClass().getName());
	}
}