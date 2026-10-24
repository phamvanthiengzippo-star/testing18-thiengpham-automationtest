package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException {
  // tao doi tuong LoginPage
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login("Admin","admin123");

    // so sanh expected voi actual
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertTrue(currentUrl.contains("dashboard"));
    }
}
