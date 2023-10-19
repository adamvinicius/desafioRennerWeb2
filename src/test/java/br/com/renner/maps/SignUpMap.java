package br.com.renner.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpMap {

    @FindBy(css = "#password")
    public WebElement inpPasswordForm;

    @FindBy(css = "#first_name")
    public WebElement inpFirstNameForm;

    @FindBy(css = "#last_name")
    public WebElement inpLastNameForm;

    @FindBy(css = "#address1")
    public WebElement inpAddress1Form;

    @FindBy(css = "#state")
    public WebElement inpStateForm;

    @FindBy(css = "#city")
    public WebElement inpCityForm;

    @FindBy(css = "#zipcode")
    public WebElement inpZipcodeForm;

    @FindBy(css = "#mobile_number")
    public WebElement inpMobileNumberForm;

    @FindBy(css = "button[data-qa='create-account']")
    public WebElement btnCreateAccount;

    @FindBy(css = "h2[data-qa='account-created']")
    public WebElement textAccountCreated;

    @FindBy(css = "a[data-qa='continue-button']")
    public WebElement btnContinue;

    @FindBy(css = "#dismiss-button")
    public WebElement btnClose;

    @FindBy(xpath = "//li[10]")
    public WebElement textLogged;

}
