package com.nopcommerce.testng.testsuite;

import com.nopcommerce.testng.loadproperty.LoadProperty;
import com.nopcommerce.testng.pages.HomePage;
import com.nopcommerce.testng.pages.RegisterPage;
import com.nopcommerce.testng.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest1 extends TestBase {
    LoadProperty loadProperty=new LoadProperty();
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPage() {
        homePage.clickOnRegisterElement();
        String expectedResult = "Your Personal Details";
        String actualResult = registerPage.getRegisterMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void verifyUserShouldRegisterSuccessfullyWithValidCredentials() {

        homePage.clickOnRegisterElement();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.selectDayOfBirth();
        registerPage.selectDateOfBirthMonth();
        registerPage.selectDateOfBirthYear();
        registerPage.setEmailemail();
        registerPage.enterCompanyName();
        registerPage.selectCheckBoxOfNewsLetter();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.ClickOnRegisterButton();

        String expectedResult = "Your registration complete";
        String actualResult = registerPage.getTextFromElement(By.xpath("//div[@class='result']"));
        Assert.assertEquals(expectedResult, actualResult);


    }

}
