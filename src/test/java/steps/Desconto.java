package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desconto {

    WebDriver driver = new ChromeDriver();

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando(){
        driver.manage().window().maximize();
        driver.get("https://qazando.com.br/");
        Assert.assertEquals("Não acessou a aplicação",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() {
        driver.findElement(By.id("email")).sendKeys("testealuno@qazando.com.br");

    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        driver.findElement(By.id("email")).sendKeys(Keys.ENTER);

    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("O cumpom esta errado","QAZANDO15OFF",texto_cupom);

        driver.quit();
    }

}
