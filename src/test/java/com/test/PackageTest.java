package com.test;

import io.qameta.allure.AllureId;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.Test;


public class PackageTest {

    @Test
    @AllureId("5")
    public void check5() {
        System.out.println("FIND me " + System.getenv("ALLURE_TESTPLAN_PATH"));
        assertTrue(true);
    }

    @Test
    public void check6() {
        assertTrue(false);
    }

    @Test
    @AllureId("7")
    public void check7() {
        assertTrue(true);
    }


    @Test
    public void check8() {
        assertTrue(false);
    }

    @Ignore
    @AllureId("9")
    public void check9() {
        assertTrue(true);
    }

    @Test
    @AllureId("10")
    public void check10(){
        assertTrue(false);
    }
}
