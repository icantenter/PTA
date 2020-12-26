import java.util.Scanner;

public class _p7_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a % 5 != 0) {
            System.out.println("输入数据错误");
            return;
        }

        counter b = new counter(a);
        b.start();
    }
}

class counter extends Thread {
    private int a;

    counter(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < a; i++) {
            if (i % 5 == 0)
                System.out.println("===" + i);


            System.out.println(i + "    线程睡眠1秒!");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
