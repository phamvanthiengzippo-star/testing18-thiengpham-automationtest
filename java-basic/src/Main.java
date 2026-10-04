import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ctrl + /
        // 1. câu lệnh nhập/xuất dữ liệu
        // Xuất
        System.out.println("Hello world!");

        // biến (variable)
        // kdl - data type for java (int, double)
        // <kiểu dữ liệu><tên biến>;
        // <kiểu dữ liệu><tên biến> = <giá trị mặc định>;
        // Quy tắc đặt tên biến: camel case
        //vd: soNguyen, hocSinh,...
        int num1 = 10;
        float num2 = 10.5f;
        boolean isActive = true;
        char ch = 'a';
        String str = "Hello world";
        System.out.println(str);

        // 2. các toán tử
        // 2.1. phép toán: +, -, *, /(chia lấy nguyên), % (chia lấy dư)
        //vd: cộng số nguyên, cộng số thực, nối chuỗi
        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println("Tổng 2 số nguyên là: " + result);

        // ++ => tăng giá trị biến đó lên 1 đơn vị
        // number1 = number1 + 1 => number1++
        // gán giá trị number1 vào number3, sau đó tăng gía trị của number1 lên 1 đơn vị
        int number3 = number1++;
        System.out.println("number3= " + number3);
        System.out.println("number1= " + number1);

        // tang giá trị number2 lên 1 đơn vị, sau đó gan gia tri number2 vào number4
        // number2 = number4 = 21
        int number4 = ++number2;

        // phép trừ tương tự như phép +: number--, --number

        number1 += 10; // number1 = number1 + 10
        number1 -= 10; // number1 = number1 - 10
        number1 = number2 + 10; //ghi đầy đủ
        // phep nhan/chia sẽ ko có number1**, **number1, number1/, /number1
        number1 /= 10;
        number1 %= 10;

        // hằng số (constant) -> biến lưu giá trị không đổi
        final int TIMEOUT = 10000;
        // dùng final, nếu gán TIMEPUT = 10 => sai
        // => lưu địa chỉ trang web, lưu về TIMEOUT, lưu locator (element)
        // 2.2. so sánh: >, >=, <, <=, ==, !=, ! (phủ định)
        // kết quả trả về -> boolean
        boolean isGreater = 10 > 5;
        boolean isEqual = 10 == 10;
        // => luôn đi kèm với condition statement, loop statement
        // 2.3. nối nhiều điều kiện: &&, ||
        // kết quả trả về -> boolean
        boolean isCheck = (10 > 5) && (10 < 20);
        // true khi 2 hoặc nhiều điều kiện cùng true
        // true && true => true
        // true && false => false
        // false && true => false
        // false && false => false
        boolean isCheck2 = (10 > 5) || (10 < 20);
        // chỉ false khi 2 hoặc nhiều điều kiện cùng false => false
        // 1 trong những điều kiện true => true
        // true || false => true
        // false || true => true , true || true => true, false || false => false

        // 3. Nhập dữ liệu -> nhập dl từ bàn phím
        // scanner : đối tượng có sẵn của java, giảm thời gian - gọi OOP để xài
        Scanner sc = new Scanner(System.in); // cú pháp tạo đối tượng scanner
        // nhập số nguyên
        // next... => hàm bất đồng bộ -> bắt user nhập giá trị từ bàn phím và gõ enter rồi mới xử lí

        // gọi API -> bất đồng bộ
//        System.out.println("mời bạn nhâp số nguyên:");
//        int number5 = sc.nextInt();
//        System.out.println ("Số nguyên bạn nhập là: " + number5);
//
//        System.out.println("Mới bạn nhap so thuc:");
//        float number6 = sc.nextFloat();
//        System.out.println("so thuc ban nhap là: " + number6);
//
//        sc.nextLine(); // bypass buffer - chữa cháy, tí xử lí thêm
//        System.out.println("Moi bạn nhap chuỗi: ");
//        String str1 = sc.nextLine();
//        System.out.println("chuoi ban nhap la: " + str1);

        // vừa nhập số nguyên, vừa nhập chữ
        // nhập chữ -> convert số kdl tương ứng - cách duy nhat và thuong dung nhieu
        System.out.println("moi ban nhap so nguyen: ");
        int number5 = Integer.parseInt(sc.nextLine());
        System.out.println("so ban nhap la: " + number5);

        System.out.println("moi ban nhap so thuc: ");
        float number6 = Float.parseFloat(sc.nextLine());
        System.out.println("so thuc ban nhap là: " + number6);

        System.out.println("moi ban nhap so chuoi: ");
        String str1 = sc.nextLine();
        System.out.println("so thuc ban nhap là: " + str1);

        // khai bao mảng
        // mảng số nguyên: <kdl>[] <tên biến> = new <kdl>[<so luong phan tử>];
        // cách 2: <kdl>[] <tên biến> = {element1, element2, ...};
        // int[] arr = new int[5];
        // int[] arr = {1,2,3,4,5,6};
        String[] danhSachTen = {"Nguyen", "Hieu", "Tran"}; // khai báo 1 mảng dl và truy xuất từng phần tử; for học sau
        System.out.println(danhSachTen[0]);
        System.out.println(danhSachTen[2]);
        int lengthDSTen = danhSachTen.length;
        System.out.println(danhSachTen[lengthDSTen - 1]);

// condition statement
        // condition thiếu
        // if (<biểu thức điều kiện>) {
        // logic code nằm trong này
        // }

        //condition đầy đủ -> sẽ có if-else
        // if (<bieu thuc dieu kien>) {
        // logic code trong này
        //  } else {
        //   logic code trong này
        //  }

        // bài 1: tìm số lớn nhất trong 3 số
        // vd: 4,8,2 => 8

        // bài 2: ktra điểm thi đh. nếu dưới điểm chuẩn => fail
        // mô hình 3 khối:
        // input
        // diem thi đh
        // diem chuan
        // output => pass/fail
        // process
        // TH1: diem thi >= diem chuan => pass
        // TH2: diem thi < diem chuann => fail
        // TH3: ktra kdl, ktra range dl

        // goi hàm ktra diem thi
        kiemTraDiemThi();

    }
    // tạo 1 hàm để xu li lien quan den ktra diem thi
    // <pham vi truy cap cua ham> static <kieu du lieu> <ten ham>(<các tham so>){
    //      code trong day
    // }
    public static void kiemTraDiemThi () {
        Scanner sc = new Scanner(System.in);

        System.out.println(" moi ban nhap diem thi: ");
        int diemthi = Integer.parseInt(sc.nextLine());

        // TH3: tam thoi skip
        // ktra cac dieu kien fail truoc
        // 0 <= diemthi <=10 -> (0 <= diemthi) && (diemthi <=10)
        if (diemthi < 0 || diemthi > 10) {
            System.out.println("diem thi khong hop le");
        }

        System.out.println("moi nhap diem chuan");
        int diemchuan = Integer.parseInt(sc.nextLine());
        if (diemchuan < 0 || diemchuan > 10) {
            System.out.println("diem chuan khong hop le");
        }
        if (diemthi >= diemchuan) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

    }
}