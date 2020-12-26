public class _p7_9 {

    public static void main(String[] args) {

        Printer c = new Printer();
        NumberPrinter a = new NumberPrinter(c);
        LetterPrinter b = new LetterPrinter(c);
        a.start();
        b.start();
    }

}

class Printer {
    private int index = 1;

    public synchronized void print(int i) throws InterruptedException {
        while (index % 3 == 0) {
            wait();
        }
        index++;
        System.out.print(i + "    ");
        notifyAll();
    }

    public synchronized void print(char c) throws InterruptedException {
        while (index % 3 != 0) {
            wait();
        }
        index++;
        System.out.println(c);

        notifyAll();
    }
}

class NumberPrinter extends Thread {
    private Printer p;

    NumberPrinter(Printer p) {
        this.p = p;

    }

    public void run() {
        for (int i = 1; i <= 52; i++) {
            try {
                p.print(i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

class LetterPrinter extends Thread {
    private Printer p;

    LetterPrinter(Printer p) {
        this.p = p;

    }

    public void run() {
        for (int i = 'A'; i <= 'Z'; i++) {
            try {
                p.print((char) i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}