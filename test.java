import java.util.*;


public class test {
    public static void main(final String[] args) {
        final boolean[] array = new boolean[101];
        final Scanner scan = new Scanner(System.in);
        int number, out = 0, cur = 0, counter = 0;

        Arrays.fill(array, true);
        System.out.println("输入最开始的人数");
        number = scan.nextInt();
        while (true){
            if (cur == number)
                cur = 0;// 数组模拟环状，最后一个与第一个相连
            if (array[cur])
                counter++;// 第t个位置上有人则报数
            if (counter == 6)// 当前报的数是m
            {
                counter = 0;// 计数器清零
                array[cur] = false;// 此处人已死，设置为空
                System.out.println(cur + 1 + " ");
                out++;// 死亡人数+1
                if (out == number) { 
                    break;
                }
            }
            cur++;// 逐个枚举圈中的所有位置
        } // 直到所有人都被杀死为止
        scan.close();
    }
}

import java.io.*;
import java.net.*;
class test  
{
	public static void main (String[] args) throws Exception
	{
	    String strLocal, strSocket;
	    int a, b, c;
		Socket socketClient = new Socket("localhost", 8848);
		
		BufferReader brInFromUser = new 
		    BufferReader(new InputStreamReader(System.in));
		BufferReader brInFromServer = new 
		    BufferReader(new InputStreamReader(socketClient.getInputStream()));
	    
	    DataOutputStream dosOutToServer = new
	        DataOutputStream(socketClient.getOutputStream());
	   do{
	       a = brInFromUser.readInt();
	       b = brInFromUser.readInt();
	       c = brInFromUser.readInt();
	       
	       dosOutToServer.writeBytes(a);
	       dosOutToServer.writeBytes(b);
	       dosOutToServer.writeBytes(c);
	   }while 
	}
}
//优先级 9

/*
1.考试主要考虑模拟  
*/

/*
2.java 数组填充Array.fill(arrayname, value) 
https://www.runoob.com/java/arrays-fill.html
*/

/*
3.约瑟夫问题 
https://baike.baidu.com/item/约瑟夫问题/3857719?fromtitle=%E7%BA%A6%E7%91%9F%E5%A4%AB%E7%8E%AF&fromid=348830&fr=aladdin
*/
