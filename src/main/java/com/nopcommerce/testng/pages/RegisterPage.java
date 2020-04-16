package com.nopcommerce.testng.pages;

import com.nopcommerce.testng.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
       By RegisterText = By.xpath("//strong[contains(text(),'Your Personal Details')]");
    By clickOnRadio = By.xpath("//input[@id='gender-female']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By dayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By dateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    By email = By.xpath("//input[@id='Email']");
    By companyName = By.xpath("//input[@id='Company']");
    By newsLetterCheckBox = By.xpath("//input[@id='Newsletter']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//input[@id='register-button']");
    By confirmRegistrationMessage = By.className("result");


    public String getRegisterMessage() {

        return getTextFromElement(RegisterText);
    }

    public void clickOnRadioButton() {
        clickOnElement(clickOnRadio);
    }

    public void enterFirstName() {
        sendTextToElement(firstName, "lameertha");
    }

    public void enterLastName() {
        sendTextToElement(lastName, "thevarajah");
    }

    public void selectDayOfBirth() {
        selectByVisibleTextFromDropDown(dayOfBirth, "Date");
    }

    public void selectDateOfBirthMonth() {
        selectByVisibleTextFromDropDown(dateOfBirthMonth, "June");
    }

    public void selectDateOfBirthYear() {
        selectByVisibleTextFromDropDown(dateOfBirthYear, "1988");
    }

    public void setEmailemail() {
        sendTextToElement(email, "lameethev789@yahoo.co.uk");
    }

    public void enterCompanyName() {
        sendTextToElement(companyName, "GSR IMPEX LTD");
    }

    public void selectCheckBoxOfNewsLetter() {
        clickOnElement(newsLetterCheckBox);
    }

    public void enterPassword() {
        sendTextToElement(password, "lameertha1234");
    }

    public void enterConfirmPassword() {
        sendTextToElement(confirmPassword, "lameertha1234");
    }

    public void ClickOnRegisterButton() {
        clickOnElement(registerButton);
    }
    public void setConfirmRegistrationMessage(){
        clickOnElement(confirmRegistrationMessage );
    }
}
