import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //bai 1: xoa cac ky tu nguyen am trong chuoi
    public static String removeVowels(String str){
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < str.length(); i++){
            char c = str.charAt(i);
            char lowerCase = Character.toLowerCase(c); // tạo biến riêng lấy ra kiểm tra, đừng lấy chữ c ra
            if (lowerCase != 'a' && lowerCase != 'e' && lowerCase != 'i' && lowerCase != 'o' && c != 'u'){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static int countWords(String str){
        //b1: từ 1 string tách ra thành 1 mảng các từ trong string này
        //vd: xin chao cac ban => ["xin", "chao", "cac", "ban"]
        //b2: dùng length có sẵn của mảng de dem so luong tu (item) trong mang
        String[] words = str.split(" ");
        return  words.length;
    }

    public static String reverString(String str){
        // cach 1: dùng for duyệt từ ky tu cuoi cung di len dau chuoi
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--){
    //        System.out.println(str.charAt(i));
            char c = str.charAt(i);
            sb.append(c);
        }
        return sb.toString();
        // cach 2: dung ham revert co san trong String
        //   return new StringBuilder(str).reverse().toString();
    }


    // collection trong java
    public static void learningCollection (){
        // mảng trong collection
        Integer[] arr = {4,2,6,8,9};
        List<Integer> listInt = new ArrayList<>(Arrays.asList(arr));
        // float => Float
        // int => Integer
        // double => Double

        List<String> listStr = new ArrayList<>();

        // 1. săp xep mang so
        //tang dan
        Collections.sort(listInt);
        System.out.println(listInt);

        // giam dan
        Collections.sort(listInt, Collections.reverseOrder());
        System.out.println(listInt);

        // dao nguoc mang
        Collections.reverse(listInt);
        System.out.println(listInt);

        // tim min, max
        System.out.println("Max: " + Collections.max(listInt));
        System.out.println("Min: " + Collections.min(listInt));

        // dem so lân xuat hien cua item bat ki
        System.out.println("Count 7:" + Collections.frequency(listInt, 7));

        // them, xoa, sua item trong list
            // them item vao cuoi của listStr
            listStr.add("hello");
            listStr.add("world");
            // ["hello", "world"]
            // them item vao vi tri cuoi cùng
            listStr.add(1, "vtp");
                //[hello, vtp, world]
            System.out.println(listStr);

            // doc item
        System.out.println(listStr.get(0));
        // update
            listStr.set(0, "lucky");
            System.out.println(listStr);
        // xoa item
            // xoa theo index
        listStr.remove(0);
        System.out.println(listStr);
            // xoa theo item
        listStr.remove("world");
        System.out.println(listStr);

    }

    // bai1: tinh tong cac so trong mang
    public static void sum(){
        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,7,2,9));
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        System.out.println("Sum: " + sum);

        // tinh trung binh
        double avg = (double) sum/list.size();
        System.out.println("Avg: " + sum);
    }

    public static void  removeSoAm(){
        List<Integer> list = new ArrayList<>(Arrays.asList(3,7,-2,8,9,-4));
//        // cach 1: dung for
//            for (int i =0; i< list.size(); i++){
//                if (list.get(i)< 0){
//                    list.remove(i);
//                }
//            }
//            System.out.println(list);

        //cach 2; dung removeIf
        list.removeIf(num -> num < 0);
        System.out.println(list);
    }

    public static void main(String[] args) {
            String str = "Cybersoft";
            System.out.println(removeVowels(str));
            String str1 = "hEllOol";
            System.out.println(removeVowels(str1));

            String str2 = "xin chao cac ban";
            System.out.println(countWords(str2));
            String str3 = "Hello word";
            System.out.println(countWords(str3));

            String str4 = "hello";
            System.out.println(reverString(str4));
            String str5 = "world";
            System.out.println(reverString(str5));

            learningCollection();
            // lien quan den xu li mang
            // auto di kem 4 api get-post-put-delete

        removeSoAm();
    }
}