package com.alevel.test;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.Assert.assertEquals;

public class TestApplicationTest {


    private static TestApplication testApplicationInstance;

    @BeforeAll
    public static void before() {

        System.out.println("Before running ...");
        testApplicationInstance = new TestApplication();
    }

    @Test
    public void lengthStringWithoutRepeating() {
        String str = "abcdabcfg";
        int answer = 6;

        int result = testApplicationInstance.lengthOfLongestSubstring(str);
        assertEquals(answer, result);

    }
}