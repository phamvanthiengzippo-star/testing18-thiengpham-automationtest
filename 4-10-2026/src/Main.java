//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // input: 1 só nguyen
    // output: so nguyen co phai la so nguyen to hay khong -> true/false
    // process:
    // dk bắt đầu vòng lặp:; i = 2
    // dk dừng: i <= n-1
    // bước nhảy: i++
    // TH1: n < 2 => không là số nguyên tố
    // TH2: n == 2 => la so nguyen to
    // TH3: normal
    // + nếu n % i == 0 => khong la so nguyen to => dừng chương trình
    // + ngược lại => duyệt tiếp
    public static boolean isPrime(int number){   //boolean not void
        if (number < 2){
            return false;
        }
        if (number ==2 ){
            return true;
        }
//        for (int i=2; i <= number - 1; i++){
//            if (number % i == 0){
//                return false;
//            }
//        }
        int i = 2;
        while (i <= number - 1){
            if (number % i == 0){
                return false;
            }
            i++;
        }
        // duyet toi number - 1 ma van ko chia het => chac chan la nguen to
        return true;
    }

    // input: int number
    // output: tong cac chu so cua 1 so -> int
    // process
        // 1234
        // tach so 4 tu 1234 => 1234 % 10 = 4
        // xoa 4 ra khoi 1234 => 1234 / 10 = 123
    // dk dừng: number > 0
    public static int sumDigit(int number){
        int sum = 0;
        // TH1: neu number < 0 => abs de convert sang so duong
        int numberAbs = Math.abs(number);
//        if (number < 0){
//            int numberAbs = Math.abs(number);
//        }
        while (numberAbs > 0){
            sum += numberAbs % 10;
            numberAbs /= 10;
        }
        return sum;
    }

    public static void  printArray(int[] listNumber){
        for (int i = 0; i< listNumber.length; i++){
            System.out.println(listNumber[i]);
        }
}

    public static void printChan(int[] listNumbers){
    // cach1: dủn for truyen thong, duyet tung so - duyet theo index (chi so)
//        for (int i = 0; i < listNumbers.length; i++){
//            if (listNumbers[i] % 2 ==0){
//                System.out.println(listNumbers[i]);
//            }
//        }

    // cach2: for cai tien - duyet theo item
    for (int number : listNumbers){
        if (number % 2 == 0){
            System.out.println(number);
        }
    }
}

    public static void printLe(int[] listNumber){
        for (int i = 0; i < listNumber.length; i ++){
            if (listNumber[i] %2 != 0){
                System.out.println(listNumber[i]);
            }
        }
}

    public static void printPrime(int[]listNumbers){
        for (int number : listNumbers){
            if (isPrime(number)){
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {

        // bai1: kiem tra so có phai la nguyen to khong
        // kết quả trả về của hàm nó phải là boolean (true/false)
            int number = 10;
            boolean check = isPrime(number);
            if (check){ // java tự chieur check == true
                System.out.println("so " + number + " la nguyen to") ;
            }else {
                System.out.println("so " + number + " khong la nguyen to");
            }

        // bai2: tinh tong các chu so cua 1 so
        // vd: 1234 => 10
        // cach1: van xai for => convert tu number => string => dung hàm (function) có sẵn của String de
        // dem so luong chu so của 1 số
        // cach2; dung while de xu ly truc tiep toi number
        int number2 = -12345;
        int sum = sumDigit(number2);
        System.out.println("tong chu so cua "+ number2 + " la:" + sum);

        int[] listNumbers = {5,3,7,1,9,10};
        // Bai1: in cac so trong mang
        // bai2: in cac so chan, so le trong mang
        // bai3: in cac so nguyen to trong mang
        // function
            // dung void
            // tham so: int[]

        System.out.println("cac so trong mang la:");
        printArray(listNumbers);
        System.out.println("cac so chan trong mang la:");
        printChan(listNumbers);
        System.out.println("cac so le trong mang la:");
        printLe(listNumbers);
        System.out.println("cac so nguyen to trong mang la:");
        printPrime(listNumbers);

    // vong lap long nhau
    // Collection trong java (pho bien, dung chính)

    }

}