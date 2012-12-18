package com.rackspace.ccp.di;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Singleton
public class ChromeDriverFactory {
	private @Mock WebDriver driver;
	
	public ChromeDriverFactory() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Produces @SingletonDriver @Chrome
	public WebDriver getSingletonWebDriver() {
		return driver;
	}
	
	@Produces @Chrome
	public WebDriver getWebDriver() {
		return new ChromeDriver();
	}
}