package com.indiewire.automation.testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test Suite for main pages.
 * @author Ajay Kumar
 *
 */
@RunWith(Suite.class)
@SuiteClasses({IWMainPageTest.class, BlogNetworksMainPageTest.class})
public class AllMainPageTestSuite {

  @BeforeClass
  public static void setUp() {
    System.out.println("Starting AllMainPageTests test suite::");
  }

  @AfterClass
  public static void tearDown() {
    System.out.println("Tearing down AllMainPageTests test suite::");
  }

}
