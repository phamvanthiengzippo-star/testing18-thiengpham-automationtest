public class LoginPage {

    // thuoc tinh: ô input username, password, nut login
    String username;
    String password;
    String loginBtn;

    // vie tham khỏi tao
    public LoginPage(){}

    public LoginPage(String username, String password, String loginBtn){
        this.username = username;
        this.password = password;
        this.loginBtn = loginBtn;
    }

    public void enterUsername (String username){
        System.out.println("Enter your name");
        this.username = username;
    }

    public void enterPassword (String password){
        System.out.println("Enter pwd");
        this.password = password;
    }

    public void clickLoginBtn(){
        System.out.println("Click login button");
    }

    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginBtn();
    }

    public boolean isLogin(){
        if (username.equals("admin") && password.equals("Admin123")){
            return true;
        }
        return false;
    }
}
