package com.epam.mentoring.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private final Logger LOGGER = LogManager.getLogger(TestListener.class);

    public void onTestStart(ITestResult iTestResult) {
        LOGGER.info(iTestResult.getTestClass().getName() + "." + iTestResult.getName() + " started");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        LOGGER.info(iTestResult.getTestClass().getName() + "." + iTestResult.getName() + " success");
    }

    public void onTestFailure(ITestResult iTestResult) {
        LOGGER.error(iTestResult.getTestClass().getName() + "." + iTestResult.getName() + " failed");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        LOGGER.info(iTestResult.getTestClass().getName() + "." + iTestResult.getName() + " skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but within success percentage");
    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("Test is starting");
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("Test is finishing");
    }
}
