package br.com.renner.steps;

import br.com.renner.pages.SignUpPage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SignUpSteps {

    SignUpPage signUpPage;


    @Quando("crio uma conta com os seguintes campos")
    public void crioUmaContaComOsSeguintesCampos(Map<String, String> map) {
        signUpPage = new SignUpPage();
        signUpPage.preencherCamposObrigatorios(map.get("password"), map.get("firstName"),
                map.get("lastName"), map.get("address"), map.get("state"),
                map.get("city"), map.get("zipCode"), map.get("mobileNumber"));
        signUpPage.enviarFormulario();

    }

    @Entao("valido que a mensagem {string} foi exibida")
    public void validoQueAMensagemFoiExibida(String msg) {
        assertEquals(msg,signUpPage.getMsgSucesso());
    }
}
