package com.epam.mentoring.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuiteListener implements ISuiteListener {

    private final Logger LOGGER = LogManager.getLogger();

    public void onStart(ISuite iSuite) {
        LOGGER.info("Suite started: " + iSuite.getName());
    }

    public void onFinish(ISuite iSuite) {
        LOGGER.info("Suite finished: " + iSuite.getName());
        List<ITestContext> iTestContextStream = iSuite.getResults()
                .values()
                .stream()
                .map(ISuiteResult::getTestContext).collect(Collectors.toList());
        iTestContextStream.stream().map(ITestContext::getPassedTests).forEach(this::logMethodDurationToConsole);
        iTestContextStream.stream().map(ITestContext::getSkippedTests).forEach(this::logMethodDurationToConsole);
        iTestContextStream.stream().map(ITestContext::getFailedTests).forEach(this::logMethodDurationToConsole);
    }

    private void logMethodDurationToConsole(IResultMap resultMap) {
        resultMap.getAllResults().stream().forEach(iTestResult -> {
            LOGGER.info("Test " + iTestResult.getTestClass().getName() + "." +  iTestResult.getName() + " was working " + (iTestResult.getEndMillis() - iTestResult.getStartMillis()) + " milliseconds");
        });
    }

}
