import java.util.*;

public class p7_19 {

    static class animal {
        String name;

        animal(String name) {
            this.name = name;
        }

        void call() {
        };
    }

    static class bird extends animal {
        bird(String name) {
            super(name);
        }

        void call() {
            System.out.println("一只动物正在叫");
            System.out.println(this.name + "正在鸟叫");
        }
    }

    static class dog extends animal {
        dog(String name) {
            super(name);
        }

        void call() {
            System.out.println("一只动物正在叫");
            System.out.println(this.name + "正在狗叫");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        String name2 = scan.next();

        bird an = new bird(name);
        an.call();
        dog ans = new dog(name2);
        ans.call();

        scan.close();
    }
}
//优先级8
/*
1. 注意读题，此题读入的名字
作为打印的内容的主体
*/