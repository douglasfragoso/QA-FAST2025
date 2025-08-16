package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MelhoresAtacantesNormalPage {

    WebDriver driver;

    public MelhoresAtacantesNormalPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "header[style='background: var(--type-normal);']")
    private WebElement titlePage;

    public String getTextTitle() {
        return titlePage.getText();

    }
}