package homeworks.lecture13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExerciseTests {
    @Test
    public void testLogin() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set timeout wait for page to be loaded completely. Works only with get() and navigate().to()
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        /*Set timeout to wait for any element to appear in the DOM tree
        Example:
        If you execute findElement() the driver will be checking for the element to appear in the DOM tree for the selected time interval
         */

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://training.skillo-bg.com:4200/posts/all");
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();

//        String expectedLoginPageUrl = "http://training.skillo-bg.com:4200/users/login";
//
//        String actualLoginPageUrl = driver.getCurrentUrl();
//
//        Assert.assertEquals(actualLoginPageUrl, expectedLoginPageUrl, "Login page URL is incorrect!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4200/users/login"));

//        WebElement signInLabel = driver.findElement(By.xpath("//p[contains(text(),'Sign in')]"));
//        String actualSignInText = signInLabel.getText();
//        String expectedSignInText = "Sign in";
//
//        Assert.assertEquals(actualSignInText, expectedSignInText);
        By signInXpath = By.xpath("//p[contains(text(),'Sign in')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInXpath));

        WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));

        username.sendKeys("ivanpenchev@abv.bg");

        WebElement password = driver.findElement(By.id("defaultLoginFormPassword"));

        password.sendKeys("IvanPenchevSkillo");

//        WebElement signInButton = driver.findElement(By.id("sign-in-button"));
//        Assert.assertTrue(signInButton.isEnabled(), "The Sign In button is disabled!");
//        signInButton.click();
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-in-button")));
        signInButton.click();

//        String expectedHomepageUrl = "http://training.skillo-bg.com:4200/posts/all";
//        String actualHomepageUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualHomepageUrl, expectedHomepageUrl, "Home page URL is incorrect!");

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4200/posts/all"));

        WebElement profileLink = driver.findElement(By.id("nav-link-profile"));
        Assert.assertTrue(profileLink.isDisplayed());
        profileLink.click();

//        String expectedProfilePageUrl = "http://training.skillo-bg.com:4200/users/4616";
//        String actualProfilePageUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualProfilePageUrl, expectedProfilePageUrl, "Profile page URL is incorrect!");

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4200/users/4616"));

//        WebElement userNameElement = driver.findElement(By.tagName("h2"));
//        String actualUserName = userNameElement.getText();
//        String expectedUserName = "IvanPenchev";
//        Assert.assertEquals(actualUserName, expectedUserName, "User name is not correct!");

        Boolean isTextDisplayed = wait.until(ExpectedConditions.textToBe(By.tagName("h2"), "IvanPenchev"));
        Assert.assertTrue(isTextDisplayed, "The username is not displayed!");


        driver.close();
    }
}
