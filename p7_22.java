import java.util.Scanner;
import java.lang.*;
public class p7_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float temp = scan.nextFloat();  
        if (temp < 0)
            System.out.println("输入的数不能为负！");
        else
            System.out.println(Math.sqrt(temp));//注释1
        scan.close();
        
    }
}

//优先级8
/*
1.java Math类
引入:import java.lang.*;
调用:Math.method_name()
*/