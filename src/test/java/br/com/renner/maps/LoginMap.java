package br.com.renner.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(name = "email")
    public WebElement inpEmail;
    @FindBy(name = "password")
    public WebElement inpPassword;
    @FindBy(css = "button[data-qa='login-button']")
    public WebElement btnSignIn;
    @FindBy(css = "a[title='My Store']")
    public WebElement linkPaginaPrincipal;
    @FindBy(css = "a.account > span")
    public WebElement textLogado;
    @FindBy(css = "#email_create")
    public WebElement inpEmailCreate;
    @FindBy(css = "#SubmitCreate")
    public WebElement inpSubmitCreate;
    @FindBy(name = "name")
    public WebElement inpName;
    @FindBy(css = "input[data-qa='signup-email']")
    public WebElement inpEmailSignup;
    @FindBy(css = "button[data-qa='signup-button']")
    public WebElement btnSignUp;


}
