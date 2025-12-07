package steps;

import Pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import utils.DriverFactory;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Dado("que acesso o site SeuBarriga")
    public void acessoOSiteSeuBarriga() {
        loginPage.acessarSite();
    }

    @Quando("informo o usuario {string} e a senha {string}")
    public void informoUsuarioESenha(String usuario, String senha) {
        loginPage.digitarEmail(usuario);
        loginPage.digitarSenha(senha);
        loginPage.clicarEntrar();
    }

    @Entao("devo visualizar a mensagem de sucesso {string}")
    public void devoVisualizarAMensagemDeSucesso(String msgEsperada) {
        String msgAtual = loginPage.obterMensagemSucesso();
        Assert.assertEquals(msgEsperada, msgAtual);
    }
}
