package com.nopcommerce.testng.pages;

import com.nopcommerce.testng.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By clickOnLogin = By.xpath("//input[@class='button-1 login-button']");
    By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By welcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void enterEmailId() {
        sendTextToElement(emailField, "lameethev25@gmail.com");
    }

    public void enterPassword() {
        sendTextToElement(passwordField, "lameertha1988");
    }

    public void setClickOnLoginButton() {
        clickOnElement(clickOnLogin);

    }

    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);

    }

    public String welcomeToStore() {
        return getTextFromElement(welcomeToOurStore);
    }


    public void waitForVisibilityToseeElement() {
    }
}
