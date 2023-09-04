
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class TestStandardUserLogin extends BaseTest {
    @Test
    public void testStandardUserCanLogin () {
        ProductsPage productsPage = loginPage.loginWith(
                "standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductLabelDisplayed());
    }
}