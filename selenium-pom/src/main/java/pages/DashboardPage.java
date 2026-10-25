package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {
 //   <a data-v-6475d26d="" class="oxd-main-menu-item active" href="/web/index.php/admin/viewAdminModule">
    private static final By MENU_ADMIN = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
//  //span[Text()='Admin']
//  //a[.//span[text()='Admin']]
//  //a => tim tat ca cac the a co trong page
//  . => chinh the <a> dang xet
//  .//span => tim tat ca cac the span trong a

    private static final By ADMIN_HERDER = By.xpath("//h6[text()='Admin']");
    public DashboardPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public boolean isElementPresent() throws InterruptedException {
        boolean checkLocators = true;
        WebElement menuAdmin = driver.findElement(MENU_ADMIN);
        if (!menuAdmin.isDisplayed()){
            checkLocators = false;
            System.out.println("khong tim thay locator menuAdmin");
            return  checkLocators;
        }

        menuAdmin .click();
//   //    boolean checkLocators = true;
//        if (!menuAdmin.isDisplayed()) {
//            checkLocators = false;
//        }
       WebElement adminHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(ADMIN_HERDER));
       // driver.findElement(ADMIN_HERDER);
        if (!adminHeader.isDisplayed()){
            checkLocators = false;
            System.out.println("khong tim thay locator menuAdmin");
        }
 //       return checkLocators;
      // return menuAdmin.isDisplayed();
        Thread.sleep(2000);
        return checkLocators;
    }
}
