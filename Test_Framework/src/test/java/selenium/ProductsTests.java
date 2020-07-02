package selenium;

import dataproviders.ProductsAndPricesProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.ProductsAndPricesData;

public class ProductsTests extends BaseClass{

    @Test(dataProvider = "getProductsAndPricesDataFromJson", dataProviderClass = ProductsAndPricesProvider.class)
    public void Test_Product_Price_Different_Currencies(ProductsAndPricesData testProductsAndPricesData){

        String productURL = String.format("https://demo.opencart.com/index.php?route=product/product&product_id=%s", testProductsAndPricesData.getId());
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.get(productURL);

        menuSuperior().selectCurrency("Euro");
        wait.until(ExpectedConditions.textToBePresentInElement(productPage().getProductPrice(), "€"));
        Assert.assertTrue(productPage().isPriceTheSame(testProductsAndPricesData.getEur()));

        menuSuperior().selectCurrency("Pound");
        wait.until(ExpectedConditions.textToBePresentInElement(productPage().getProductPrice(), "£"));
        Assert.assertTrue(productPage().isPriceTheSame(testProductsAndPricesData.getPnd()));

        menuSuperior().selectCurrency("Dollar");
        wait.until(ExpectedConditions.textToBePresentInElement(productPage().getProductPrice(), "$"));
        Assert.assertTrue(productPage().isPriceTheSame(testProductsAndPricesData.getUsd()));
    }
}
