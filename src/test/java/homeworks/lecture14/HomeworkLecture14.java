package homeworks.lecture14;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class HomeworkLecture14 {
    private WebDriver driver;

    @BeforeSuite
    protected final void setupTestSuite() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
    }

    @BeforeMethod
    protected final void setUpTest() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    protected final void tearDownTest() {
        if (this.driver != null) {
            this.driver.close();
        }
    }

    @DataProvider(name = "getUsers")
    public Object [][] getUsers() {
        return new Object[][]{{"ivanp2@abv.bg", "IvanPenchev123", "IvanPenchev2", "IvanPenchevModified", "ivanpenchevmodified@abv.bg", "passwordIsModified"}

        };
    }
    @Test (dataProvider = "getUsers")
    public void testProfileEdit (String email, String password, String username, String modifiedUsername, String modifiedEmail, String modifiedPassword){
        driver.get("http://training.skillo-bg.com:4300/posts/all");
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));

        WebElement signInElement = driver.findElement(By.xpath("//*[text()='Sign in']"));
        wait.until(ExpectedConditions.visibilityOf(signInElement));

        WebElement userNameOrEmailField = driver.findElement(By.id("defaultLoginFormUsername"));
        userNameOrEmailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.id("defaultLoginFormPassword"));
        passwordField.sendKeys(password);

        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in-button")));
        signInButton.click();

        WebElement profileLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-profile")));
        profileLink.click();

        wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/users/"));

        Boolean isTextDisplayed = wait.until(ExpectedConditions.textToBe(By.tagName("h2"), username));
        Assert.assertTrue(isTextDisplayed, "The username is not displayed!");
        WebElement userEditButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fa-user-edit")));
        userEditButton.click();


        Boolean isModifyTextDisplayed = wait.until(ExpectedConditions.textToBe(By.tagName("h4"), "Modify Your Profile"));
        Assert.assertTrue(isModifyTextDisplayed, "The modify profile modal is not displayed!");


        WebElement userNameEditField = driver.findElement(By.cssSelector("[formcontrolname='username']"));
        userNameEditField.clear();
        userNameEditField.sendKeys(modifiedUsername);


        WebElement emailEditField = driver.findElement(By.cssSelector("[formcontrolname='email']"));
        emailEditField.clear();
        emailEditField.sendKeys(modifiedEmail);


        WebElement passwordEditField = driver.findElement(By.cssSelector("[formcontrolname='password']"));
        passwordEditField.sendKeys(modifiedPassword);

        WebElement confirmPasswordEditField = driver.findElement(By.cssSelector("[formcontrolname='confirmPassword']"));
        confirmPasswordEditField.sendKeys(modifiedPassword);

        WebElement publicInfoEditField = driver.findElement(By.cssSelector("[formcontrolname='publicInfo']"));
        publicInfoEditField.clear();
        publicInfoEditField.sendKeys("This is my modified public info");

        WebElement saveEditProfile = driver.findElement(By.cssSelector("[type='submit']"));
        saveEditProfile.click();

        Boolean isNewProfileUsernameDisplayed = wait.until(ExpectedConditions.textToBe(By.tagName("h2"), modifiedUsername));
        Assert.assertTrue(isNewProfileUsernameDisplayed, "The username was not modified!");

        //Logout
        WebElement logoutButton = driver.findElement(By.className("fas fa-sign-out-alt fa-lg"));
        logoutButton.click();

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));
        wait.until(ExpectedConditions.visibilityOf(signInElement));

        userNameOrEmailField.sendKeys(modifiedEmail);

        passwordField.sendKeys(modifiedPassword);

        signInButton.click();

        profileLink.click();

        wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/users/"));

        Boolean isModifiedTextDisplayed = wait.until(ExpectedConditions.textToBe(By.tagName("h2"), modifiedUsername));
        Assert.assertTrue(isModifiedTextDisplayed, "The modified username is not displayed!");

        userEditButton.click();

        Assert.assertTrue(isModifyTextDisplayed, "The modify profile modal is not displayed!");

        userNameEditField.clear();
        userNameEditField.sendKeys(username);

        emailEditField.clear();
        emailEditField.sendKeys(email);

        passwordEditField.sendKeys(password);

        confirmPasswordEditField.sendKeys(password);

        publicInfoEditField.clear();
        publicInfoEditField.sendKeys("This is my previous public info");

        saveEditProfile.click();

    }
}
