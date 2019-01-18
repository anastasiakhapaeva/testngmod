package com.epam.mentoringportal.thirdtask;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LastNameComparatorTest {

    private static final String ACTUAL = "Kurochkin";
    private static final String EXPECTED = "Kurochkin";

    @Test(groups = "printers")
    public void compareLastNames() {
        Assert.assertEquals(ACTUAL, EXPECTED, "lastnames don't match");
    }

    @Test(groups = {"printers", "ex"})
    public void compareOtherLastNames() {
        Assert.assertEquals(ACTUAL, EXPECTED, "lasnames don't match");
    }

}
