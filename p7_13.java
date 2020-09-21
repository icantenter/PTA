import java.util.*;

public class p7_13 {

    static class Person {
        String name = "小明";

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            if (this.name.equals(name))
                System.out.println("改名失败");
            else {
                System.out.println(this.name + "改名为：" + name);
                this.name = name;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        Person person = new Person();
        person.setName(name);
        scan.close();
    }
}
//优先度4