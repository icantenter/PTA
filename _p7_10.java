import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class _p7_10 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext())
        {
            String a = scan.next();
            String b = scan.next();
            map.put(a, b);
        }
        // Iterator it = (Iterator) map.keySet().iterator();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "---" + entry.getValue()); 
        }
        
        System.out.println(map.toString());
        scan.close();
    }
}
