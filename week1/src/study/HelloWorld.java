package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class HelloWorld {
    public static void main(String[] args) {
        // dataType
        int age = 25;       // Biến số nguyên
        double price = 9.99; // Biến số thực
        boolean isJavaFun = true; // Biến boolean
        char grade = 'A';   // Biến ký tự
        String name = "Java"; // Biến tham chiếu (String)

        // Kiểu dữ liệu tham chiếu (Reference)
        String str = "Hello";
        int[] arr = {1, 2, 3};
        Animal animal = new Animal(); //object
        //Runnable r = new MyRunnable(); interface
        System.out.println("Hello world!!");

        //Arithmetic
        int a = 10, b = 3;
        System.out.println(a + b);  // 13
        System.out.println(a % b);  // 1
        //Logical and Comparison
        if(a>3 && b<3){
            System.out.println("a>b");
        } else if (a>=10){
            System.out.println("a =" + a);
        }
        // toán tử ba ngôi
        int min = (a < b) ? a : b;

        // loop for
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // loop while
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
        // loop do while
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        //swich-case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            default:
                System.out.println("Ngày không hợp lệ");
        }

        Cat cat = new Cat("Meo meo", "HN");
        cat.introduce();

        Ngoc ngoc = new Ngoc();
        ngoc.run();
        System.out.println(ngoc.hometown("Thạch Thât - HN"));

        TruongCon truongCon = new TruongCon();
        truongCon.run();

        // array
        int[] numbers = new int[5]; // Mảng có kích thước cố định
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println("Array :" + numbers[1]); // Output: 20

        // arraylist
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        System.out.println("ArrayList :"+ numberList.get(1));

        // LinkedList
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        System.out.println("LinkedList : "+names.get(0)); // Output: Alice

        // HashSet
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Sẽ không bị thêm vào vì trùng lặp
        System.out.println("HashSet : " + fruits); // Output: [Apple, Banana]

        //HashMap
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        System.out.println(scores.get("Alice")); // Output: 95



    }
}
