package com.nopcommerce.testng.pages;

import com.nopcommerce.testng.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPages extends Utility {
    By computerTextMessage = By.xpath("//h1[contains(text(),'Computers')]");
    By buildYourComputer = By.linkText("Build your own computer");
    By clickOnRadioButton = By.id("product_attribute_3_7");
    By addToCartButton = By.id("add-to-cart-button-1");
    By addToCartConfirmMessage = By.className("content");




    //below all methods for each elements and doing actions on that each elements
    public String getComputerTextMessage() {

        return getTextFromElement(computerTextMessage);
    }

    public void clickOnBuildComputer() {

        clickOnElement(buildYourComputer);
    }

    public void clickOnRadioButtonFeature() {
        clickOnElement(clickOnRadioButton);

    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getAddToCartMessage() {
        return getTextFromElement(addToCartConfirmMessage);
    }


}


