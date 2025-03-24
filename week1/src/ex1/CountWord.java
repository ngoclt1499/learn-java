package ex1;

import java.util.HashMap;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String input = sc.nextLine().toLowerCase();

        // Tách từ theo dấu cách hoặc dấu câu
        String[] words = input.split("[\\s,.!?]+");

        // HashMap để đếm số lần xuất hiện
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Hiển thị kết quả
        System.out.println("Tần suất xuất hiện của các từ:");
        for (var entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }

}
