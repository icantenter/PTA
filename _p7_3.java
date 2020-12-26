import java.util.Scanner;

public class _p7_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a < 0) {
            System.out.println("输入数据有误");
            return;
        }

        Thread b = new Thread(new Print(a));
        b.start();
    }

    
}

class Print implements Runnable {
    private int a ;
    Print(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = a; i >= 0; i--) {
            System.out.println(i);    
        }
        
    }

    

}
