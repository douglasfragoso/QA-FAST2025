package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaPrincipalPage {
    
    WebDriver driver;

    public TelaPrincipalPage(WebDriver driver) {
        this.driver = driver;
    }

    private By buttonMelhoresAtacantesTipoNormal = By.linkText("Melhores Atacantes do tipo Normal");
    private By cardTitle = By.cssSelector("header[style='background: var(--type-normal);']");

    public void clickMelhoresAtacantesTipoNormal() {
        driver.findElement(buttonMelhoresAtacantesTipoNormal).click();
    }

    public String obterTituloPagina() {
        return driver.findElement(cardTitle).getText();
    } 

}
