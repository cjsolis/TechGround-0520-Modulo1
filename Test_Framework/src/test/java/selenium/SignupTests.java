package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataUtils;

public class SignupTests extends BaseClass {

    @Test
    public void Test_New_Client_Register(){

        String firstName = "Carlos";
        String lastName = "Pereira";
        String email = DataUtils.getRandomEmail();
        String telephone = "12345678";
        String password = "hola123";

        // Go to the register page
        headerPage().clickOnMyAccount();
        headerPage().clickOnRegister();

        registerPage().registerUser(firstName, lastName, email, telephone, password);

        Assert.assertTrue(headerPage().isLogoutLinkEnabled());
    }
}
