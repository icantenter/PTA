import java.util.*;

public class p7_12 {

    public interface Instrument {
        void play();
    }

    static class InstrumentImpl implements Instrument {
        String name;

        InstrumentImpl(String name) {
            this.name = name;
        }

        public void play() {
            System.out.println("演奏乐器: " + this.name);
        }
    }

    public static class InstrumentTest {
        public void playInstrument(Instrument ins) {//注释1
            ins.play();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ins = scan.next();
        InstrumentTest it = new InstrumentTest();
        it.playInstrument(new InstrumentImpl(ins));
        scan.close();
    }

}

//1. 接口作为参数 http://www.jufanshare.com/content/70.html