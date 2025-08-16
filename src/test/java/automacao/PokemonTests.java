package automacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.MelhoresAtacantesNormalPage;
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

        TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage(driver);
        telaPrincipalPage.clickMelhoresAtacantesTipoNormal();
    
        MelhoresAtacantesNormalPage melhoresAtacantesNormal = new MelhoresAtacantesNormalPage(driver);
        String tituloPagina = melhoresAtacantesNormal.getTextTitle();
        assertEquals("Melhores Atacantes do tipo Normal em Pokémon GO", tituloPagina);
    }

    @Test
    public void pesquisarPokemon() {
        TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage(driver);
        telaPrincipalPage.pesquisarPokemon("Pikachu");

        assertEquals("Trovoada de Choques", telaPrincipalPage.obterPrimeiroMovimento());
        assertEquals("Ataque Selvagem", telaPrincipalPage.obterSegundoMovimento());
    }

    // @After
    // public void close() {
    //     driver.quit();
    // }
}
