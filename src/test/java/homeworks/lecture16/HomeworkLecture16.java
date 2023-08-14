package homeworks.lecture16;

import factory.Header;
import factory.HomePage;
import factory.LoginPage;
import factory.UserPage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class HomeworkLecture16 extends TestObject {


    @DataProvider(name = "getUsers")
    public Object[][] getUsers() {
        return new Object[][]{{"IvanPenchev123", "IvanPenchev2", "IvanPenchevModified", "ivanpenchevmodified@abv.bg", "passwordIsModified"}
        };
    }

    @Test(dataProvider = "getUsers")
    public void testProfileEdit(String password, String username, String modifiedUsername, String modifiedEmail, String modifiedPassword) {
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateTo();
        Assert.assertTrue(homePage.isUrlLoaded(), "The Homepage URL is not correct!");
        Header header = new Header(getDriver());
        header.clickLogin();
        LoginPage loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isUrlLoaded(),"The Login URL is not correct!");
        String signInText = loginPage.getSignInElementText();
        Assert.assertEquals(signInText, "Sign in");
        loginPage.populateUsername(username);
        loginPage.populatePassword(password);
        loginPage.clickSignIn();

        Assert.assertTrue(homePage.isUrlLoaded(), "You were not properly redirected to the homepage after login");
        header.clickProfile();
        UserPage userPage = new UserPage(getDriver());
        Assert.assertTrue(userPage.isUrlLoaded(), "The Userpage URL is not correct!");
        String actualUsername = userPage.getUsername();
        Assert.assertEquals(actualUsername, username, "The username is not correct!");
        userPage.clickEditUser();
        Assert.assertEquals(userPage.getModifiedText(), "Modify Your Profile", "The Modify text is missing! You might not have opened the modal window");
        userPage.editUsername(modifiedUsername);
        userPage.editEmail(modifiedEmail);
        userPage.editPasswordAndConfirmPassword(modifiedPassword);
        userPage.editProfileInfo();
        userPage.submitEditProfile();
        Assert.assertEquals(actualUsername, modifiedUsername, "The username was not properly modified!");
    }
}

