package lecture12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examples {

    public static void main (String[] args){
        testMyFirstWebDriver();
    }

    private static void testMyFirstWebDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://training.skillo-bg.com:4200/posts/all");
        driver.manage().window().maximize();
        driver.close();
    }
}
