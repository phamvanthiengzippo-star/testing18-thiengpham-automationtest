import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // on lại mô hình 3 khoi (input -> process -> output)
    // bai 1: tính chu vi va dien tich hinh chu nhat
        // input: số luong tham so: chieu dai, chieu rong
    public static void chuViDienTich(float dai, float rong) {
        // fail first
        // TH1: dai, rong > 0
        if (dai < 0 || rong < 0){
            System.out.println("Chu dai, chieu rong không dduoc am");
            return;
        }
        float chuVi = 2 * (dai + rong);
        float dienTich = dai * rong;


    // output: in ra chu vi, dien tich
        System.out.println("Chu vi:" + chuVi);
        System.out.println("Dien tich:" + dienTich);
    }

    public static void soLonNhat (int num1, int num2, int num3) {
        int maximum = num1;
        if (num2 > maximum){
        maximum = num2;
        }
        if (num3 > maximum){
            maximum = num3;
        }
        System.out.println("so lon nhat là:" + maximum);
    }

    public static void kiemTraHocLuc (float diemTB){
        if (diemTB < 0 || diemTB > 10){
            System.out.println("Diem tb ko hop le");
            return;
        }
        // happy case
        if (9 <= diemTB && diemTB <= 10){
            System.out.println("xuat sac");
        }  else if (8 <= diemTB && diemTB < 9){
            System.out.println("Kha");
        }  else if (6.5 <= diemTB && diemTB <8){
            System.out.println("TB");
        } else {
            System.out.println("yeu");
        }
    }



    public static void tinhTienDien(float soKWh){
        if (soKWh < 0){
            System.out.println("so kwh khong hop le");
            return;
        }
        int tienDien = 0;
        double roundKWh =   Math.ceil(soKWh);
        if (roundKWh <= 50){
            tienDien = (int) (1800 * soKWh);
        } else if (51 <= roundKWh && roundKWh <= 100){
            tienDien = (1800 * 50) + (int)(2000 * (soKWh - 50));
        } else if (101 <= roundKWh && roundKWh <=200) {
            tienDien = (1000 * 50) + (2000 *50) + (int)(2500 * (roundKWh - 100)) ;
        } else {
             tienDien = (1000 * 50) + (2000 * 50) + (2500 * 100) +  (int)(3000 * (roundKWh - 200));
        }
        System.out.println("tien dien:" + tienDien);
    }

    // Loop
    // bai1: in cac so tu 1 -> 100
    public static void inSoTu1Den100 (){
        for (int i = 1; i <=100; i++) {
            System.out.println(i);
        }
    }
    // bai2: in cac so chan tu 0 -> 100
    public static void inSoChanTu0Den100 (){
        for (int i = 0; i <=100; i+=2) {
            System.out.println(i);
        }
    }
    //Bai3: tinh tong cac so tu 1 -> 300
    public static void sum1To300(){
        int sum = 0;
        for (int i = 1; i <= 300; i++){
              sum +=1;
        }
        System.out.println("tong so tu 1 den 300" + sum);
    }

   // bai4: in bang cuu chuong 5
    public static void cuuChuong5 (){
        // bdau vong lap: i = 1
        // dk dung: i < =10
        // buoc nhay i ++
        for (int i = 1; i <= 10; i++){
            System.out.println("5 x" + i + "=" + (5 *i));
        }
    }

    //Bai5: tinh giai thừa của n
    // vd: 3! = 6 -> n! = n * (n-1) * (n-2) *... * 2 * 1
    public static void giaiThua (int n) {
         // dk bdau vòng lap: i = 1
        // dk dừng:i <= n
        // buoc nhay: i = 1
        if (n <=1){
            System.out.println("N khong hơp le");
            return;
        }
        int result = 1;
        for (int i = 2; i <=n; i++){
            result *=i;

        }
        System.out.println("giai thua cua N la:"+ result);
    }

    //bai6: in ra n so fibonaci
    // n = 5 -> 1 1 2 3 5
        // dk bdau i = 1
        // dk i <= n
        // buoc nhay i++
    public static void Fibonaci (int n){

        int prev1 = 0;
        int prev2 = 1;
        for (int i = 1; i <=n; i++){
            System.out.println(prev1 + " ");
            int temp = prev1 + prev2;
            prev1 = prev2;
            prev2 = temp;
        }
        // i = 1
        // 0
        // prev = 1, prev2 = 1
        // i = 2
        // 0 1
    }

    public static void main(String[] args) {
        // bai 1: tinh chu vi, dien tich
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 1: Tinh chu vi, dien tich hcn");
        System.out.println("nhap chieu dai:");
        // phai parse tu string -> number vi sau nay se nhap ca so va chu
        float dai = Float.parseFloat(sc.nextLine());
        System.out.println("nhap chieu rong:");
        float rong = Float.parseFloat(sc.nextLine());

        // goi ham chuViDienTich
        chuViDienTich(dai,rong);

        // bai 2: tim so lon nhat trong 3 so
        // input: 3 tham so (so nguyen)
        // output: so lon nhat
            //define hàm
                // - int num1, int num2, int num3
                // - int maximum
        // process: thuat toan flag (cờ)
            // chon 1 so bat kì làm số lon nhat (chon đại, chọn bất kì) - Thường chọn số đầu tiên là số "lớn nhất"
                // duyệt từ số thứ 2 trở đi
                // + neu số dang xet > so "lon nhat" -> gan so "lon nhat" = so dang xet
                // + nguoc lai -> next
        int num1 = 4;
        int num2 = 2;
        int num3 = 7;
        soLonNhat(num1, num2, num3);

       // Bai 3: kiem tra hoc luc cua hoc sinh dua vao diem trung binh
       // input: nhap diem học sinh, diem trung binh: xep hang tb, kha , gioi
       // output: hoc luc cua hoc sinh là
       // process:
            // neu diem hs > diem trung binh

        System.out.println("Bai 3 kiem tra hoc luc hs");
        float diemTBa = 6.5f;    // de ten bien gì cũng duoc so voi ham, nhưng phai cùng kdl
        kiemTraHocLuc(diemTBa);


        // Bai 4: Tinh tien dien
            // bac1: 1-50kWh -> 1800
            // bac2: -50kWh -> 2000
            // bac3: 1-50kWh -> 5000
            // bac4: 1-50kWh -> 1000
        // bt tuogn duong: tinh thue, tien taxi
        float tienDien = 50.f ;
        tinhTienDien(tienDien);

        System.out.println("nhap n");
        int n = sc.nextInt();
        giaiThua(n);
    }
}