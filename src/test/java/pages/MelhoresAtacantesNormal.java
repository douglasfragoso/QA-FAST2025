package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MelhoresAtacantesNormal {

    WebDriver driver;

    public MelhoresAtacantesNormal(WebDriver driver) {
        this.driver = driver;
    }

    private By titlePage = By.cssSelector("header[style='background: var(--type-normal);']");

    public String getTextTitle() {
        return driver.findElement(titlePage).getText();

    }
}