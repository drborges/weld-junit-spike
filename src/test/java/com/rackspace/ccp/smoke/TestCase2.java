package com.rackspace.ccp.smoke;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.rackspace.ccp.di.Chrome;
import com.rackspace.ccp.di.SingletonDriver;
import com.rackspace.ccp.di.WeldJUnit4Runner;

@RunWith(WeldJUnit4Runner.class)
public class TestCase2 {

	@Inject @SingletonDriver @Chrome
	private WebDriver webDriver;
	
	@Test
	public void dummyTestCase() throws Exception {
		assertNotNull(webDriver);
	}
}