package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.ConfigReader;

import java.time.Duration;

// BaseTest là class de thiet lap moi truong chay test
public class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    // ham setup moi truong test
    // them key BeforeMethod de chay ham nay truoc khi chay test
    @BeforeMethod (alwaysRun = true)
    public void setUp(){
        WebDriverManager.chromedriver().setup();
// cấu hình giao diện chrome
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        int timeout = Integer.parseInt(ConfigReader.get("timeout"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
    // ham tearDown moi truong sau khi chay test
    @AfterMethod (alwaysRun = true)
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }

    // vì cac page con deu can login trước nên cần define function login o trong class cha
    protected void loginAsAdmin() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }
}
