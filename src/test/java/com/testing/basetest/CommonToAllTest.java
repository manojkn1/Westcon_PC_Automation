package com.testing.basetest;

import driver.DriverManager;
import driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {

    @BeforeMethod
    public void setUp(){
        DriverManagerTL.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManagerTL.down();
    }

}
