import java.util.*;
public class p7_10 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double width, height;
       width = scan.nextDouble();
       height = scan.nextDouble();
       Rect rect = new Rect(width, height);
       System.out.println("长方形的面积为：" + String.format("%.1f", rect.area())); 
       System.out.println("长方形的周长为：" + String.format("%.1f", rect.perimeter()));
       scan.close();
    }
    
}

class Rect{
    double width, height;
    public Rect(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }
    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
}
//优先级 4
/*
1.static只能修饰内部类 
https://zhidao.baidu.com/question/1964339938962462860.html
*/

/*
2.一个文件可以有多个类，但只能有一个public类
*/