package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyElementsOnHomePage(){
        homePage.getPageTitle();
        homePage.getTheCurrentUrl();
        homePage.printThePageSource();
        homePage.enterUsername("Admin");
        homePage.enterPassword("admin123");
    }
}
