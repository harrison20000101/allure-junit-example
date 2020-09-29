package com.test;

import io.qameta.allure.junit4.AllureSuite;
import my.company.tests.SimpleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(AllureSuite.class)
@Suite.SuiteClasses({PackageTest.class, SimpleTest.class})
public class TestSuite {
}
