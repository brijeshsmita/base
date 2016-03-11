package com.cg.countdownlatch;

import java.util.concurrent.CountDownLatch;

/*
 * In this example, I have simulated an application startup class
 *  which starts N threads that will check for external systems 
 *  and report back to latch, on which startup class is waiting. 
 *  As soon as all services are verified and checked, startup proceeds.
BaseHealthChecker.java : This class is a Runnable and 
parent for all specific external service health checkers. 
This remove the code duplicacy and central control over latch.
 */
public abstract class BaseHealthChecker implements Runnable {
    
    private CountDownLatch _latch;
    private String _serviceName;
    private boolean _serviceUp;
     
    //Get latch object in constructor so that after completing the task, thread can countDown() the latch
    public BaseHealthChecker(String serviceName, CountDownLatch latch)
    {
        super();
        this._latch = latch;
        this._serviceName = serviceName;
        this._serviceUp = false;
    }
 
    @Override
    public void run() {
        try {
            verifyService();
            _serviceUp = true;
        } catch (Throwable t) {
            t.printStackTrace(System.err);
            _serviceUp = false;
        } finally {
            if(_latch != null) {
                _latch.countDown();
            }
        }
    }
 
    public String getServiceName() {
        return _serviceName;
    }
 
    public boolean isServiceUp() {
        return _serviceUp;
    }
    //This methos needs to be implemented by all specific service checker
    public abstract void verifyService();
}