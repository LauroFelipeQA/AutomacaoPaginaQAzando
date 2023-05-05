package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import pages.HomePage;
import runner.RunCucumberTest;

public class Desconto extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() throws InterruptedException {
        driver.manage().window().maximize();
        homePage.acessarAplicacao();
        homePage.scrollDown();
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() {
        homePage.preencherEmail("testealuno@qazando.com.br");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        homePage.enterGanhaDesconto();

    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        homePage.verificarDesconto();
    }

}
