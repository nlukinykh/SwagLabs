package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {

    @FindBy(className = "inventory_container")
    private WebElement inventoryContainer;
    @FindBy(id = "item_4_title_link")
    private WebElement backpack;

    @FindBy(className = "btn_inventory")
    private WebElement addToCartButton;

    public ProductsPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public Boolean isProductLabelDisplayed () {
        return isDisplayed(inventoryContainer);
    }

    public void addBackPack () {
        backpack.click();
        click(addToCartButton);
    }

    public String getButtonName () {
        return addToCartButton.getText();
    }
}