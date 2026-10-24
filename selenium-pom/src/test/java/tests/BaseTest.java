package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

// BaseTest là class de thiet lap moi truong chay test
public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    // ham setup moi truong test
    // them key BeforeMethod de chay ham nay truoc khi chay test
    @BeforeMethod (alwaysRun = true)
    public void setUp(){
        WebDriverManager.chromedriver().setup();
// cấu hình giao diện chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
    // ham tearDown moi truong sau khi chay test
    @AfterMethod (alwaysRun = true)
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
