package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaPrincipalPage {
    
    WebDriver driver;

    public TelaPrincipalPage(WebDriver driver) {
        this.driver = driver;
    }

    private By buttonMelhoresAtacantesTipoNormal = By.linkText("Melhores Atacantes do tipo Normal");
    private By inputSearchPokemon = By.cssSelector("input[placeholder='Search...']");
    private By textPrimeiroMovimento = By.cssSelector("li a[href='/pt/move/205']");
    private By textSegundoMovimento = By.cssSelector("li a[href='/pt/move/251']");

    public void clickMelhoresAtacantesTipoNormal() {
        driver.findElement(buttonMelhoresAtacantesTipoNormal).click();
    }

    public void pesquisarPokemon(String nomePokemon) {
        driver.findElement(inputSearchPokemon).sendKeys(nomePokemon);
        driver.findElement(By.partialLinkText(nomePokemon)).click();
    }

    public String obterPrimeiroMovimento() {
        return driver.findElement(textPrimeiroMovimento).getText();
    }

    public String obterSegundoMovimento() {
        return driver.findElement(textSegundoMovimento).getText();
    }

}
