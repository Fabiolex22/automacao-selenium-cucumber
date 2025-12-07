package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    private By campoEmail = By.id("email");
    private By campoSenha = By.id("senha");
    private By botaoEntrar = By.tagName("button");
    private By mensagemSucesso = By.xpath("//div[@class='alert alert-success']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite() {
        driver.get("https://seubarriga.wcaquino.me/login");
    }

    public void digitarEmail(String email) {
        driver.findElement(campoEmail).sendKeys(email);
    }

    public void digitarSenha(String senha) {
        driver.findElement(campoSenha).sendKeys(senha);
    }

    public void clicarEntrar() {
        driver.findElement(botaoEntrar).click();
    }

    public String obterMensagemSucesso() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement msg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[contains(@class,'alert')]")
                )
        );
        return msg.getText();
    }

}
