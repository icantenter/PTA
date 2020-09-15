import java.util.*;
public class p7_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("输入的3 * 3 矩阵是:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[j + i * 3] + " ");
                if (i == j)
                    sum += numbers[j + i * 3];
            }
            System.out.print("\n");
        }
        
        System.out.println("对角线之和是：" + sum);
        scan.close();
    }

}