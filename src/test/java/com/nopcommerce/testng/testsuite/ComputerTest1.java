package com.nopcommerce.testng.testsuite;

import com.nopcommerce.testng.loadproperty.LoadProperty;
import com.nopcommerce.testng.pages.ComputerPages;
import com.nopcommerce.testng.pages.DesktopPage;
import com.nopcommerce.testng.pages.HomePage;
import com.nopcommerce.testng.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest1 extends TestBase {
    LoadProperty loadProperty = new LoadProperty();
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ComputerPages computerPages = new ComputerPages();


    @Test(groups ={"sanity","regression","smoke"} )
    public void verifyUserShouldNavigateToComputersPage() {
        homePage.clickOnComputersElement();
        String expectedResult = "Computers";
        String actualResult = computerPages.getComputerTextMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(groups ={"sanity","regression","smoke"} )
    public void verifyUserShouldAddProductToCartSuccessfully() {

        homePage.clickOnComputersElement();
        desktopPage.ClickOnDesktopButton();
        desktopPage.setSortByPosition();
        desktopPage.atozSort();
        computerPages.clickOnBuildComputer();
        computerPages.clickOnRadioButtonFeature();
        computerPages.clickOnAddToCartButton();

        String expectedResult = "The product has been added to your shopping cart";
        String actualResult = computerPages.getAddToCartMessage();
        Assert.assertEquals(expectedResult, actualResult);


    }

}