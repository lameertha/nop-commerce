package com.nopcommerce.testng.pages;

import com.nopcommerce.testng.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By registerNop = By.xpath("//a[@class='ico-register']");
    By loginNop= By.xpath("//a[@class='ico-login']");
    By computersNop = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");



    public void clickOnRegisterElement() {
        clickOnElement(registerNop);
    }

    public void clickOnLoginElement() {
        clickOnElement(loginNop);
    }

    public void clickOnComputersElement() {
        mouseHoverToElementAndClick(computersNop);
    }


}