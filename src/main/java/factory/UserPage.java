package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserPage {
    public static final String PAGE_URL = "http://training.skillo-bg.com:4300/users/";
    private final WebDriver driver;

    @FindBy (tagName = "h2")
    WebElement username;
    @FindBy (css = ".fa-user-edit")
    WebElement userEditButton;
    @FindBy (tagName = "h4")
    WebElement modifyText;
    @FindBy (css = "[formcontrolname='username']")
    WebElement userNameEditField;
    @FindBy (css = "[formcontrolname='email']")
    WebElement emailEditField;
    @FindBy (css = "[formcontrolname='password']")
    WebElement passwordEditField;
    @FindBy (css = "[formcontrolname='confirmPassword']")
    WebElement confirmPasswordEditField;
    @FindBy (css = "[formcontrolname='publicInfo']")
    WebElement publicInfoEditField;
    @FindBy (css = "[type='submit']")
    WebElement saveEditProfile;

    public UserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public boolean isUrlLoaded(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        return wait.until(ExpectedConditions.urlContains(UserPage.PAGE_URL));
    }
    public String getUsername (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(username));
        return username.getText();
    }
    public void clickEditUser(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(userEditButton));
        userEditButton.click();
    }
    public String getModifiedText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(modifyText));
        return modifyText.getText();
    }
    public void editUsername(String modifiedUsername){
        userNameEditField.clear();
        userNameEditField.sendKeys(modifiedUsername);
    }
    public void editEmail(String modifiedEmail){
        emailEditField.clear();
        emailEditField.sendKeys(modifiedEmail);
    }
    public void editPasswordAndConfirmPassword(String modifiedPassword){
        passwordEditField.sendKeys(modifiedPassword);
        confirmPasswordEditField.sendKeys(modifiedPassword);
    }
    public void editProfileInfo(){
        publicInfoEditField.clear();
        publicInfoEditField.sendKeys("This is my modified public info");
    }
    public void submitEditProfile(){
        saveEditProfile.click();
    }
}