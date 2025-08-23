package automacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.MelhoresAtacantesNormalPage;
import pages.PokemonStatus;
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
        String text = "Melhores Atacantes do tipo Normal em Pokémon GO";

        MelhoresAtacantesNormalPage melhoresAtacantesNormal = new MelhoresAtacantesNormalPage(driver);
        melhoresAtacantesNormal.getTextTitle(text);
        melhoresAtacantesNormal.printAllTableRows();
    }

    @Test
    public void pesquisarPokemon() throws InterruptedException {
        TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage(driver);
        telaPrincipalPage.pesquisarPokemon("Pikachu");
        PokemonStatus pokemonStatus = new PokemonStatus(driver);
        assertEquals("Trovoada de Choques", pokemonStatus.obterPrimeiroMovimento());
        assertEquals("Ataque Selvagem", pokemonStatus.obterSegundoMovimento());
    }

    // @After
    // public void close() {
    //     driver.quit();
    // }
}
