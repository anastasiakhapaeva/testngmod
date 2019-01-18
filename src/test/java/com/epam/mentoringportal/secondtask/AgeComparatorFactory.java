package com.epam.mentoringportal.secondtask;

import org.testng.annotations.Factory;

public class AgeComparatorFactory {

    @Factory
    public Object[] create() {
        Object[] objectArray = new Object[10];
        for (int i = 0; i < objectArray.length; i++) {
            objectArray[i] = new AgeComparatorTest(i * i);
        }
        return objectArray;
    }

}
