import java.util.*;
public class p7_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] source = new int[300];
        int temp = scan.nextInt();
        int size = 0;
        while (temp != -1)
        {
            source[size++] = temp;
            temp = scan.nextInt();
        }
        System.out.println("你输入的数组为：");
        for (int i = 0; i < size; i++) {
            System.out.print(source[i]);
            if (i == size - 1)
                System.out.println();
            else
                System.out.print("   ");
        }
        
        System.out.println("数组逆序输出为：");
        for (int i = size - 1; i >= 0; i--) {//注释1
            System.out.print(source[i]);
            if (i == 0)
                break;
            else
                System.out.print("   ");
        }
        scan.close();
    }
}
//优先度9

/*
1.这里的逆序是数字摆放位置。string直接反向数字会颠倒
*/