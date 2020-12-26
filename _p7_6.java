public class _p7_6{
    public static void main(String[] args) {
        Thread t = new Thread(new a());
        t.start();
    }

}

class a implements Runnable{ 
    public void run() {   
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}