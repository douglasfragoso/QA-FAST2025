package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PokemonStatus {

    private WebDriver driver;

    public PokemonStatus(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "li a[href='/pt/move/205']")
    private WebElement textPrimeiroMovimento;

    @FindBy(css = "li a[href='/pt/move/251']")
    private WebElement textSegundoMovimento;

    @FindBy(id = "max-cp-chart")
    private WebElement tableCp;

    public String obterPrimeiroMovimento() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(textPrimeiroMovimento).perform();
        Thread.sleep(1000); 
        actions.scrollToElement(tableCp).perform();

        return textPrimeiroMovimento.getText();
    }

    public String obterSegundoMovimento() {
        return textSegundoMovimento.getText();
    }

}
