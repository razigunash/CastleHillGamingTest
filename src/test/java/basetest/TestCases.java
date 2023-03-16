package basetest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class TestCases extends BaseTest {
    @Test
    public void successfulLogin() {
        String usernameTest = "standard_user";
        String passwordTest = "secret_sauce";
        loginPage.inputLogin(usernameTest);
        loginPage.inputPassword(passwordTest);
        MainPage mainPage = loginPage.clickLoginButton();
        Assert.assertTrue(mainPage.isLogoPresent());
    }

    @Test
    public void failedLogin() {
        String usernameTest = "locked_out_user";
        String passwordTest = "secret_sauce";
        String errorMessage = "Epic sadface: Sorry, this user has been locked out.";
        loginPage.inputLogin(usernameTest);
        loginPage.inputPassword(passwordTest);
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getErrorBoxMessage(), errorMessage);

    }

}
