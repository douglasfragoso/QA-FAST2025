package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelaPrincipalPage {

    private WebDriver driver;

    public TelaPrincipalPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Melhores Atacantes do tipo Normal")
    private WebElement buttonMelhoresAtacantesTipoNormal;

    @FindBy(css = "input[placeholder='Search...']")
    private WebElement inputSearchPokemon;

    public void clickMelhoresAtacantesTipoNormal() {
        buttonMelhoresAtacantesTipoNormal.click();
    }

    public void pesquisarPokemon(String nomePokemon) {
        inputSearchPokemon.sendKeys(nomePokemon);
        driver.findElement(By.partialLinkText(nomePokemon)).click();
    }

}
