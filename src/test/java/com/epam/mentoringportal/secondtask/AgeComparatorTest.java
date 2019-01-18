package com.epam.mentoringportal.secondtask;

import org.testng.Assert;
import org.testng.annotations.Test;

class AgeComparatorTest {

    private int age;

    public AgeComparatorTest(int ageFromFactory) {
        age = ageFromFactory;
    }

    @Test
    public void compareAges() {
        Assert.assertEquals(age, age, "ages don't match");
    }

}

