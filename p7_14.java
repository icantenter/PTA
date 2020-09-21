import java.util.*;
import java.text.DecimalFormat; 
public class p7_14 {
    abstract static class Shape {// 抽象类

        // 抽象方法 求面积
        public abstract double getArea();

        // 抽象方法 求周长
        public abstract double getPerimeter();
    }

    static class Rectangle extends Shape{
        double width, height;

        public double getPerimeter()
        {
            return 2 * (this.height + this.width);
        }
        public double getArea()
        {
            return this.height * this.width;
        }
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = scan.nextDouble();
        double height = scan.nextDouble();

        Rectangle rect = new Rectangle(width, height);
        System.out.println(new DecimalFormat("#.##").format(rect.getArea()));//注释1
        System.out.println(new DecimalFormat("#.##").format(rect.getPerimeter()));
        scan.close();
    }
}
//优先度 8

/*
1. 数字格式化输出 
https://www.cnblogs.com/hq233/p/6539107.html
*/