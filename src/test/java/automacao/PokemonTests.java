package automacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.MelhoresAtacantesNormal;
import pages.TelaPrincipalPage;
import utils.DriverFactory;

public class PokemonTests {
    private WebDriver driver;

    @Before
    public void setup() {
        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.getChromeWebDriver();
        driver.get("https://db.pokemongohub.net/pt");
    }

    @Test
    public void melhoresAtacantesTipoNormal() {
        // Teste Automatizado
        TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage(driver);
        telaPrincipalPage.clickMelhoresAtacantesTipoNormal();
        // Assert
        MelhoresAtacantesNormal melhoresAtacantesNormal = new MelhoresAtacantesNormal(driver);
        String tituloPagina = melhoresAtacantesNormal.getTextTitle();
        assertEquals("Melhores Atacantes do tipo Normal em Pokémon GO", tituloPagina);
    }

    @Test
    public void teste02() {
        // Teste Automatizado
    }

    @After
    public void close() {
        // Fechar Tudo
        driver.quit();
    }
}
