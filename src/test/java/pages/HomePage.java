package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get("https://qazando.com.br/");
        Assert.assertTrue("Não acessou a aplicação", driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void preencherEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void enterGanhaDesconto() {
        driver.findElement(By.id("email")).sendKeys(Keys.ENTER);
    }

    public void verificarDesconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("O cumpom esta errado", "QAZANDO15OFF", texto_cupom);
    }
}
