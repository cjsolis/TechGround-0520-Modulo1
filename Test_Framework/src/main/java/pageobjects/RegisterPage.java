package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    //region Elements
    private By firstNameLocator = By.id("input-firstname");
    private By lastNameLocator = By.id("input-lastname");
    private By emailLocator = By.id("input-email");
    private By telephoneLocator = By.id("input-telephone");
    private By passwordLocator = By.id("input-password");
    private By confirmPasswordLocator = By.id("input-confirm");
    private By agreePolicyLocator = By.xpath("//input[@name='agree']");
    private By continueButtonLocator = By.xpath("//input[@value='Continue']");
    //endregion

    //region Actions
    public void registerUser(String firstName, String lastName, String email, String telephone, String password){

        // Fill Personal Details
        driver.findElement(firstNameLocator).sendKeys(firstName);
        driver.findElement(lastNameLocator).sendKeys(lastName);
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(telephoneLocator).sendKeys(telephone);

        // Fill Password
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(confirmPasswordLocator).sendKeys(password);

        driver.findElement(agreePolicyLocator).click();
        driver.findElement(continueButtonLocator).submit();
    }
    //endregion

    public RegisterPage(WebDriver _driver){ super(_driver); }
}
