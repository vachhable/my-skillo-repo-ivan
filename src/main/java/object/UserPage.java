package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserPage {
    public static final String PAGE_URL = "http://training.skillo-bg.com:4300/users/";
    private final WebDriver driver;

    public UserPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean isUrlLoaded(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        return wait.until(ExpectedConditions.urlContains(UserPage.PAGE_URL));
    }
    public String getUsername(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userName = driver.findElement(By.tagName("h2"));
        return userName.getText();
    }

    public void clickEditUser(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userEditButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fa-user-edit")));
        userEditButton.click();
    }

    public String getModifiedText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modifyText = driver.findElement(By.tagName("h4"));
        return modifyText.getText();
    }

    public void editUsername(String modifiedUsername){
        WebElement userNameEditField = driver.findElement(By.cssSelector("[formcontrolname='username']"));
        userNameEditField.clear();
        userNameEditField.sendKeys(modifiedUsername);
    }
    public void editEmail(String modifiedEmail){
        WebElement emailEditField = driver.findElement(By.cssSelector("[formcontrolname='email']"));
        emailEditField.clear();
        emailEditField.sendKeys(modifiedEmail);
    }
    public void editPasswordAndConfirmPassword(String modifiedPassword){
        WebElement passwordEditField = driver.findElement(By.cssSelector("[formcontrolname='password']"));
        passwordEditField.sendKeys(modifiedPassword);

        WebElement confirmPasswordEditField = driver.findElement(By.cssSelector("[formcontrolname='confirmPassword']"));
        confirmPasswordEditField.sendKeys(modifiedPassword);
    }
    public void editProfileInfo(){
        WebElement publicInfoEditField = driver.findElement(By.cssSelector("[formcontrolname='publicInfo']"));
        publicInfoEditField.clear();
        publicInfoEditField.sendKeys("This is my modified public info");
    }
    public void submitEditProfile(){
        WebElement saveEditProfile = driver.findElement(By.cssSelector("[type='submit']"));
        saveEditProfile.click();
    }
}