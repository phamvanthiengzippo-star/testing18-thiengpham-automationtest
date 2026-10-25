package tests;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;

import java.io.InputStream;
import java.io.InputStreamReader;

public class LoginTest extends BaseTest{

    record LoginData(String username, String password, boolean success){
        // @DataProvider: Testng lấy thong tin data roi chay test cho data do
        // B1: viet function doc data .json
        // Object[][] la data type ma testng hieu duoc
        @DataProvider (name = "loginData")
        public Object[][] loginDataProvider() {
            InputStreamReader reader = new InputStreamReader(
                    LoginTest.class.getResourceAsStream("/login-date.json")
            );
            // Gson: bien json => object LoginData
            LoginData[] list = new Gson().fromJson(reader, LoginData[].class);
            // data mẫu
            // Admin admin123 true
            // Admin fail_pass fail
            // fail_user admin123 fail
            Object[][] dataLogin = new Object[list.length][1];
            for (int i = 0; i < list.length; i++)
                dataLogin[i][0] = list[i];
                return dataLogin;
            }

        // B2: load data vao test case
        @Test(dataProvider = "loginData")
        public  void testLoginData(LoginData data) throws InterruptedException {
            LoginPage loginPage = new LoginPage(driver, wait);
            loginPage.open();
            loginPage.login(data.username(), data.password());

            Thread.sleep(2000);
            Assert.assertEquals((driver.getCurrentUrl().contains("dashboard")), data.success());
        }
    }

    @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException {
  // tao doi tuong LoginPage
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"),ConfigReader.get("password"));

    // so sanh expected voi actual
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertTrue(currentUrl.contains("dashboard"));
    }
}
