package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
//    <input
//    data-v-1f99f73c=""
//    class="oxd-input oxd-input--active"
//    name="username" placeholder="Username" autofocus="">
// xpath: rule de tim locator tren website
//    //input => tim tat ca cac the input trong page
//    //input[@name='username'] => tìm tất cả cac the input co thuoc tinh nam voi value là username
//  //input[@name='username']
    private static final By INPUT_USERNAME = By.xpath("//input[@name='username']");
    private static final By INPUT_PASSWORD = By.xpath("//input[@name='password']");
    private static final By LOGIN_BTN = By.xpath("//button[@type='submit']");


    // truong hop muon tim 1 class trong nhieu class name => contain
  //  private static final By LOGIN_BTN = By.xpath("//button[contains(@class, )]");
    // css selector => By.cssSelector("button.oxd-button")")

    public LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    // step1: truy cap vao page login
    public void open(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //fix them cho case web hien thi lau
        // doi co dieu kien => doi xuat hien the input
        wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME));
    }

    // step2: Login
    // enterUsername, enterPassword, clickLoginBtn
    // có 2 cach viet
        // cach1: tach tung step thanh tung cai function
        // uu diem: de dang them log kiem tra, de sua
        // cach2: gom cac step chung thanh 1 function

    public void login(String username, String password) throws InterruptedException {
        WebElement usernameInput = driver.findElement(INPUT_USERNAME);
        usernameInput.sendKeys(username);

        Thread.sleep(2000);

        WebElement passwordInput = driver.findElement(INPUT_PASSWORD);
        passwordInput.sendKeys(password);

        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(LOGIN_BTN);
        loginBtn.click();
      //  Thread.sleep(10_000);
    }
}
