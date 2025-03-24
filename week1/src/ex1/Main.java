package ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.6));
        students.add(new Student("Bob", 3.9));
        students.add(new Student("Charlie", 3.2));

//         Sắp xếp theo GPA giảm dần
        students.sort(Comparator.comparing(Student::getGpa).reversed());

        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (Student sv : students) {
            System.out.println(sv);
        }

        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Hiển thị danh sách sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Xử lý xuống dòng

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sản phẩm: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = sc.nextDouble();
                    products.add(new Product(id, name, price));
                    break;

                case 2:
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    String removeId = sc.nextLine();
                    products.removeIf(p -> p.id.equals(removeId));
                    break;

                case 3:
                    System.out.println("Danh sách sản phẩm:");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}


