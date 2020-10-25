import java.util.*;


public class p7_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scan.nextInt();
        }
        Arrays.sort(numbers);//注释1
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i]);
            if (i != 9)
                System.out.print(' ');
        }

        scan.close();
    }
}
//优先级9

/*
1. java自带排序 
https://blog.csdn.net/whp1473/article/details/79678974
*/