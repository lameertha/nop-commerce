package com.nopcommerce.testng.testsuite;

import com.nopcommerce.testng.loadproperty.LoadProperty;
import com.nopcommerce.testng.pages.HomePage;
import com.nopcommerce.testng.pages.LoginPage;
import com.nopcommerce.testng.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest1 extends TestBase {

    LoadProperty loadProperty = new LoadProperty();

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage1(){
        homePage.clickOnLoginElement();
        String expectedText = "Welcome, Please Sign In";
        String actualText = loginPage.getWelcomeMessage();
        Assert.assertEquals(expectedText, actualText);
    }
}
