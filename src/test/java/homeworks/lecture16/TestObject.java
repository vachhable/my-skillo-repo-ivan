package homeworks.lecture16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestObject {
    private WebDriver getDriver;

    @BeforeSuite
    protected final void setupTestSuite() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
    }
    @BeforeMethod
    protected final void setUpTest() {
        this.getDriver = new ChromeDriver();
        this.getDriver.manage().window().maximize();
        getDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        getDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterMethod
    protected final void tearDownTest() {
        if (this.getDriver != null) {
            this.getDriver.close();
        }
    }
    protected WebDriver getDriver() {
        return getDriver;
    }
}
