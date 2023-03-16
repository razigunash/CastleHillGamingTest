package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

   private By logo = By.xpath("//img[@src=\"/static/media/logo.jpg\"]");

    public boolean isLogoPresent(){
        try {
            driver.findElement(logo);
        } catch (NoSuchElementException exception) {
            return false;
        }
        return true;
    }

}
