package pages;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseTest {

    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    MainPage mainPage;

    private By usernameLogin = By.cssSelector("#user-name");
    private By passwordLogin = By.cssSelector("#password");
    private By loginButton = By.cssSelector("#login-button");
    private By errorBox = By.cssSelector(".error-message-container");

    public void inputLogin(String login) {
        driver.findElement(usernameLogin).sendKeys(login);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordLogin).sendKeys(password);
    }

    public MainPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return mainPage = new MainPage(driver);
    }

    public String getErrorBoxMessage () {
        return driver.findElement(errorBox).getText();
    }




}

/*        WebElement menu = driver.findElement(By.cssSelector("#react-burger-menu-btn"));
        menu.click();
        WebElement logout = driver.findElement(By.cssSelector("#logout_sidebar_link"));
        logout.isSelected();
        logout.click();*/





