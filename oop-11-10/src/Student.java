import java.util.Scanner;

// public: thể hiện phạm vi truy cập của đối tượng
// private: thể hiện nội bộ bên trong đối tượng (những nơi khác sẽ không thể truy cập được)
// protected: quan hệ cha con với nhau lai giữa public và private
public class Student {
    // liet ke cac thuoc tinh (biến) của doi tương
    String id;
    String name;
    int age;
    String address;
    String phone;
    String email;
    String gender;

    // ham khoi tao doi tuong
    // luu y: neu ko ta 1 ham khoi tao => java tu dong tao ham khoi tam mac dinh => dung tu khoa
    // new de tao doi tuong

    public Student() {
        // trong ham ko co logic cod => gan gia tri mac dinh cho tung thuoc tinh
        id = "12345";
        name = "vtp";
        address = "HCM";
        phone = "0988";
        email = "vtp@gmail.com";
        gender = "Nam";
        age = 20;

    }

    // luu ý neu tao dung ham khoi tao co tham so => bat buoc tao ham khoi tao không tham so
    public  Student(String id,
                    String name,
                    String address, String phone, String email, String gender,
                    int age){
// phan biet ten cua thuoc tinh va ten cua tham so => this de phan biet
// neu khac ten => ko can dung this
        this.id = id;
        this.name = name;
    }




    // liet ke cac phuong thuc/Hàm (function)
    // ham nhap gia tri cua doi tuong
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ma hoc sinh");
        id = sc.nextLine();
        System.out.println("Moi ban nhap ten hoc sinh");
        name = sc.nextLine();
        System.out.println("Moi ban nhap tuoi hoc sinh");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap dia chi hoc sinh");
        address = sc.nextLine();
        System.out.println("Moi ban nhap so dien thoai hoc sinh");
        phone = sc.nextLine();
        System.out.println("Moi ban nhap email hoc sinh");
        email = sc.nextLine();
        System.out.println("Moi ban nhap gioi tinh hoc sinh");
        gender = sc.nextLine();

    }

    public void display(){
        System.out.println("ma hs: "+ id);
        System.out.println("ten hs: "+ name);
        System.out.println("email: "+ email);
        System.out.println("día chi: "+ address);
        System.out.println("gioi tinh: "+ gender);
        System.out.println("so dien thoai: "+ phone);
        System.out.println("tuoi: "+ age);

    }

}
