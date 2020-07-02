package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DataUtils;

public class ProductPage extends BasePage{

    private By productQuantityLocator = By.id("input-quantity");
    private By addToCartButtonLocator = By.id("button-cart");
    private By productPriceLocator = By.cssSelector("div.col-sm-4 h2");

    public ProductPage(WebDriver _driver){
        super(_driver);
    }

   public void setAmountToAdd(int amount){
       driver.findElement(productQuantityLocator).clear();
       driver.findElement(productQuantityLocator).sendKeys(String.valueOf(amount));
   }

   public WebElement getProductPrice(){ return driver.findElement(productPriceLocator); }

   public void clickAddToCart(){
        driver.findElement(addToCartButtonLocator).click();
   }

   public boolean isPriceTheSame(String expectedPrice){

       String actualPrice = DataUtils.getAmountFromCurrency(driver.findElement(productPriceLocator).getText());

       return actualPrice.equals(expectedPrice);
   }
}
