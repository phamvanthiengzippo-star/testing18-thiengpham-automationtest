package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends BaseTest {

    @BeforeMethod
    public void preCondition() throws InterruptedException {
        loginAsAdmin();
    }

    @Test(description = "Find locators")
    public void findLocator () throws InterruptedException {
//        pre-condition
//        LoginPage loginPage = new LoginPage(driver, wait);  //bo bot sau khi dung function login trong basetest
//        loginPage.open();
//        loginPage.login("Admin", "admin123");

        // vì tu page login di qua page Dashboard sẽ co khoang thoi gian doi cac element xuat hien
        // tren trang dashboard => tim dieu kien de doi (waiting)
 //       Thread.sleep(10_000);
      //  wait.until(ExpectedConditions.urlContains("dashboard")); //bo bot sau khi dung basetest function login
        // doi xuat hien 1 trong cac element thì bypass (di tiep)
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"
                )));
        DashboardPage dashboardPage = new DashboardPage(driver, wait);
        Assert.assertTrue(dashboardPage.isElementPresent());
    }
}
