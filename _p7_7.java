import java.util.Scanner;

public class _p7_7 {
    static Object obj = new Object();
    static int count = 1;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        _a _1 = new _a();
        _b _2 = new _b();
        _c _3 = new _c();
        _1.start();
        _2.start();
        _3.start();
    }

    static class _a extends Thread {
        String tmp;

        public void run() {
            synchronized (obj) {
                this.tmp = scan.next();
                count = count % 3 + 1;
                obj.notifyAll();
                for (int i = 0; i < 3; i++) {
                    while (count != 1) {
                        try {
                            obj.wait();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                    System.out.print(tmp + " ");
                    count = count % 3 + 1;
                    obj.notifyAll();
                }
            }

        }

    }

    static class _b extends Thread {
        String tmp;

        public void run() {
            synchronized (obj) {
                while (count != 2) {
                    try {
                        obj.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
                this.tmp = scan.next();
                count = count % 3 + 1;
                obj.notifyAll();
                for (int i = 0; i < 3; i++) {
                    while (count != 2) {
                        try {
                            obj.wait();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                    System.out.print(tmp + " ");
                    count = count % 3 + 1;
                    obj.notifyAll();
                }
            }

        }

    }

    static class _c extends Thread {
        String tmp;

        public void run() {
            synchronized (obj) {
                while (count != 3) {
                    try {
                        obj.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
                this.tmp = scan.next();
                count = count % 3 + 1;
                obj.notifyAll();
                for (int i = 0; i < 3; i++) {
                    while (count != 3) {
                        try {
                            obj.wait();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                    System.out.print(tmp + " ");
                    count = count % 3 + 1;
                    obj.notifyAll();
                }

            }
        }

    }

}
