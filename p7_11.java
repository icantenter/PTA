
//package ti;
import java.util.Arrays;
import java.util.Scanner;

public class p7_11 {

    static class Book {
        String name;

        Book(String nam) {
            this.name = nam;
        }
    }

    static class Course {
        String Class_Name;
        Book[] books = new Book[3];

        Course(String name) {
            this.Class_Name = name;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        name = scan.next();
        Course course = new Course(name);
        for (int i = 0; i < 3; i++) {
            name = scan.next();
            Book temp = new Book(name);
            course.books[i] = temp;
        }
        System.out.println(
                "课程 《" + course.Class_Name + "》的指定教材为：" + course.books[0].name + "," + course.books[1].name + "," + course.books[2].name);
        scan.close();
    }
}
//优先级4