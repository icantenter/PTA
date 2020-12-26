public class _P7_8 {
    public static void main(String[] args) {
        _counter[] a = new _counter[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new _counter(i + 1, (i  + 1)* 10);
            
        }
        for (int i = 0; i < 10; i++) {
            a[i].start();
        }
    }
}

class _counter extends Thread {
    int n, count;

    int ans = 0;
    static int list = 1;

    _counter(int n, int count) {
        this.n = n;
        this.count = count;
    }

    public synchronized void run() {
        while (n != list) {
            try {
                wait(10);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        for (int i = 1; i <= count; i++) {
            ans += i;
        }
        System.out.println("第" + n + "个线程----->" + ans);
        list++;
        notifyAll();
    }

}
