package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "#login_button_container h3")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        type(username, usernameField);
    }

    public void setPassword (String password) {
        type(password, passwordField);
    }

    public ProductsPage clickLoginButton () {
        click(loginButton);
        return new ProductsPage(driver);
    }

    public ProductsPage loginWith (String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage () {
        return errorMessage.getText();
    }
}