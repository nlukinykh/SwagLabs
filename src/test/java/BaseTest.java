
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class BaseTest {
    private WebDriver driver;
    private final String AUT_URL = "https://www.saucedemo.com";
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp () {
        // WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        // WebDriverManager.edgedriver().setup();
        // WebDriverManager.operadriver().setup();
        // WebDriverManager.chromiumdriver().setup()
        // WebDriverManager.iedriver().setup();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AUT_URL);

        loginPage= new LoginPage(driver);
    }

    @AfterClass
    public void tearDown () {
        driver.quit();
    }
}