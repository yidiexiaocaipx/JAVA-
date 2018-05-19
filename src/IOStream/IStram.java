package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IStram {

	public static void main(String[] args) throws IOException {
		char c;
	    // 使用 System.in 创建 BufferedReader 
	//    BufferedReader br = new BufferedReader(new 
	//                       InputStreamReader(System.in));
//	    System.out.println("输入字符, 按下 'q' 键退出。");
	    // 读取字符
//	    do {
//	       c = (char) br.read();
//	       System.out.println(c);
//	    } while(c != 'q');
	    // 读取字符串
		String str;
		BufferedReader br = new BufferedReader(new 
				                     InputStreamReader(System.in));
	    do {
	    	str=br.readLine();
	    	 System.out.println(str);
	    }while(! str.equals("end"));
	}

}
