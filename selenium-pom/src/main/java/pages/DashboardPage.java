package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {
 //   <a data-v-6475d26d="" class="oxd-main-menu-item active" href="/web/index.php/admin/viewAdminModule">
    private static final By MENU_ADMIN = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
//  //span[Text()='Admin']
//  //a[.//span[text()='Admin']]
//  //a => tim tat ca cac the a co trong page
//  . => chinh the <a> dang xet
//  .//span => tim tat ca cac the span trong a
    public DashboardPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public boolean isElementPresent(){
        WebElement menuAdmin = driver.findElement(MENU_ADMIN);
        return menuAdmin.isDisplayed();
    }
}
