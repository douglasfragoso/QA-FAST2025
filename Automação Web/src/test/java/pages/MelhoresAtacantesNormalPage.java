package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverWaits;

public class MelhoresAtacantesNormalPage {

    DriverWaits wait;
    
    public MelhoresAtacantesNormalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new DriverWaits(driver);
    }

    @FindBy(css = "header[style='background: var(--type-normal);']")
    private WebElement titlePage;

    @FindBy(css = "tbody")
    private List<WebElement> table;

    public void getTextTitle(String text) {
        wait.waitTextTitle(titlePage, text);
    }

    public void printAllTableRows() {
        wait.waitElementFound(table);
        table.forEach(element -> System.out.println(element.getText()));
    }
}