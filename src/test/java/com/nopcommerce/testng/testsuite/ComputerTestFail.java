package com.nopcommerce.testng.testsuite;

import com.nopcommerce.testng.loadproperty.LoadProperty;
import com.nopcommerce.testng.pages.ComputerPages;
import com.nopcommerce.testng.pages.DesktopPage;
import com.nopcommerce.testng.pages.HomePage;
import com.nopcommerce.testng.utility.Utility;
import org.testng.Assert;

public class ComputerTestFail extends Utility {

    LoadProperty loadProperty = new LoadProperty();
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ComputerPages computerPages = new ComputerPages();

    public void verifyUserShouldNotAddProductToCartSuccessfully() {
        homePage.clickOnComputersElement();
        desktopPage.ClickOnDesktopButton();
        desktopPage.setSortByPosition();
        desktopPage.atozSort();
        computerPages.clickOnBuildComputer();
        computerPages.clickOnRadioButtonFeature();
        computerPages.clickOnAddToCartButton();

        String expectedResult = "The product has been added to your shopping ";
        String actualResult = computerPages.getAddToCartMessage();
        Assert.assertEquals(expectedResult, actualResult);

    }
}