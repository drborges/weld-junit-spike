package com.rackspace.ccp.di;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class WeldJUnit4Runner extends BlockJUnit4ClassRunner {
	private static Weld weld;
	
	private final WeldContainer container;
    private final Class klass;
 
    public WeldJUnit4Runner(final Class klass) throws InitializationError {
        super(klass);
        this.klass = klass;
        this.weld = new Weld();
        this.container = weld.initialize();
    }
    
    @Override
    public void run(RunNotifier notifier) {
    	super.run(notifier);
    	container.event().select(TestFinished.class).fire(new TestFinished(klass));
    	//weld.shutdown();
    }
    
    @Override
    protected Object createTest() throws Exception {
        final Object test = container.instance().select(klass).get();
        container.event().select(TestStarted.class).fire(new TestStarted(klass));
        return test;
    }
}