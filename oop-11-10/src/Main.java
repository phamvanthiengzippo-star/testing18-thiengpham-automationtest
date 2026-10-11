import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Selenium
// POM - page object model pattern
//VD LoginPage
    // - Locator (thẻ HTML trên page đó)
    // loginBtn, usernameInput, passwordInput, logo, lable,...
    // - thuoc tinh
        // + clickLoginBtn()
        // + fillUsername()
        // ...

    // viet test case => tao class de chua cac test case của page dó
    // - LoginTest
    // tung test case tuong ung voi tung function cua class LoginTest

    // class de tuong tac voi page tren website
    // Driver, ChromeDriver,...
public class Main {
    public static void main(String[] args) {
        // tạo doi tuong Student
        Student hs1 = new Student(); // dùng new cấp phát 1 đối tượng
//        hs1.id = "123456";
//        hs1.age = 20;
//        hs1.email = "a@gmail.com";
//        hs1.name  = "VTP";
//        System.out.println(hs1.id);
//        System.out.println(hs1.age);
//        System.out.println(hs1.email);
//        System.out.println(hs1.name);
//        hs1.input();
// //       hs1.display();
//        System.out.println("================");
//        Student hs2 = new Student();
//        hs2.input();
// //       hs2.display();
//
//        Student hs3 = new Student("3","D","QN","0909090","a@gmail","Nam",20);
//
//        // tao danh sach hoc sinh
//        List<Student> listStudent = new ArrayList<>();
//        listStudent.add(hs1);
//        listStudent.add(hs2);
//        listStudent.add(hs3);
//        for (Student student : listStudent){
//            student.display();
//            System.out.println("=============");
//        }

        System.out.println("Example for automation test");
        LoginPage loginPage = new LoginPage();
        loginPage.login("admin", "123456");
        // todo: function để kiểm tra result thc tế với result mong đợi
        if (loginPage.isLogin()){
            System.out.println("Login success");
        }else {
            System.out.println("Login failed");
        }

        //luu ý
            //1. khong duoc dung class cha vì class cha chỉ để kế thừa thôi
        Car mec = new Car("1", "maybach","s650","black",4,"ron95");
        mec.display();

    }
}