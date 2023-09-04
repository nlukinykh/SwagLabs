package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
  protected WebDriver driver;

  public BasePage(WebDriver driver) {
    this.driver = driver;
  }

  protected WebElement find(By locator) {
    return driver.findElement(locator);
  }

  protected void type(String text, WebElement element) {
    element.clear();
    element.sendKeys(text);
  }

  protected void click(WebElement element) {
    element.click();
  }

  protected Boolean isDisplayed(WebElement element) {
    try {
      return element.isDisplayed();
    } catch (NoSuchElementException exc) {
      return false;
    }
  }
}
