package br.com.renner.pages;

import br.com.renner.core.Driver;
import br.com.renner.maps.SignUpMap;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    SignUpMap signUpMap;

    public SignUpPage(){
        signUpMap = new SignUpMap();
        PageFactory.initElements(Driver.getDriver(), signUpMap);
    }

    public void preencherCamposObrigatorios(String password, String firstName, String lastName, String address, String state,
                                            String city, String zipCode, String mobileNumber){
        signUpMap.inpPasswordForm.sendKeys(password);
        signUpMap.inpFirstNameForm.sendKeys(firstName);
        signUpMap.inpLastNameForm.sendKeys(lastName);
        signUpMap.inpAddress1Form.sendKeys(address);
        signUpMap.inpStateForm.sendKeys(state);
        signUpMap.inpCityForm.sendKeys(city);
        signUpMap.inpZipcodeForm.sendKeys(zipCode);
        signUpMap.inpMobileNumberForm.sendKeys(mobileNumber);
    }
    public void enviarFormulario(){
        signUpMap.btnCreateAccount.click();
    }

    public String getMsgSucesso(){
        return signUpMap.textAccountCreated.getText();
    }
}
