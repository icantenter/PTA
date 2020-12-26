public class _p7_5 {
    public static void main(String[] args) {
        __1 a = new __1();
        a.start();
    }
}

class __1 extends Thread{
    private int n;

  

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println("------" + i);
            }
            System.out.println(i + "线程睡眠1毫秒！");

        }
    }

}
