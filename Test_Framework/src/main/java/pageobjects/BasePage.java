package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected By successAlertLocator = By.cssSelector(".alert.alert-success");
    private By alertError = By.xpath("//div[contains(@class,'alert-danger')]");

    WebDriver driver;

    public BasePage(WebDriver _driver){
        this.driver = _driver;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public Boolean isSuccessMessageVisibleWithText(String expectedMessage){
        return driver.findElement(successAlertLocator)
                .getText()
                .contains(expectedMessage);
    }

    public boolean isErrorMessageVisibleWithText(String expectedMessage){
        boolean result = driver.findElement(alertError)
                .getText()
                .contains(expectedMessage);

        return result;
    }

}
