public class _p7_2 {
    public static Object object = new Object();
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
         
        thread1.start();

         
        thread2.start();
    }
     
    static class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (object) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                }
                for (int i = 'A'; i <= 'Z'; i++) {
                    System.out.println((char) i);
                    object.notify();
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                    }

                }
            }
        }
    }
     
    static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (object) {
                for (int i = 1; i <= 26; i++)    
                {
                    object.notify();
                    System.out.print(i);
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}