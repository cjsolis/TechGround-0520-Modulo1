package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuSuperior {

    private By shoppingCartLocator = By.xpath("//span[text()='Shopping Cart']");
    private By currencyLocator = By.xpath("//button[contains(., 'Currency')]");
    private By dollarsLocator = By.xpath("//button[contains(text(), 'Dollar')]");
    private By eurosLocator = By.xpath("//button[contains(text(), 'Euro')]");
    private By poundsLocator = By.xpath("//button[contains(text(), 'Pound')]");

    WebDriver driver;

    public MenuSuperior(WebDriver _driver){
        this.driver = _driver;
    }

    public void clickShoppingCart(){
        driver.findElement(shoppingCartLocator).click();
    }

    public void selectCurrency(String currency){

        driver.findElement(currencyLocator).click();

        switch (currency){

            case "Dollar":
                driver.findElement(dollarsLocator).click();
                break;

            case "Euro":
                driver.findElement(eurosLocator).click();
                break;

            case "Pound":
                driver.findElement(poundsLocator).click();
                break;

            default:
                driver.findElement(dollarsLocator).click();
                break;
        }
    }
}
