package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    // thuoc tinh giúp tuong tac tren website như:
        // truy cap page, fill value, click, checkbox, ...
    protected WebDriver driver;

    // thuoc tinh giúp tim kie locator de dang hơn, tránh trường hợp flaky test
    protected WebDriverWait wait;

    // thuộc tính để chèn code Js giúp tương tac tren website
        // highlight, scroll, click, doube click, .... nhiều event trên trang web
    protected JavascriptExecutor js;

    public BasePage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
    }
}
