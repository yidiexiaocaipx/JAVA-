package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IStram {

	public static void main(String[] args) throws IOException {
		char c;
	    // ʹ�� System.in ���� BufferedReader 
	//    BufferedReader br = new BufferedReader(new 
	//                       InputStreamReader(System.in));
//	    System.out.println("�����ַ�, ���� 'q' ���˳���");
	    // ��ȡ�ַ�
//	    do {
//	       c = (char) br.read();
//	       System.out.println(c);
//	    } while(c != 'q');
	    // ��ȡ�ַ���
		String str;
		BufferedReader br = new BufferedReader(new 
				                     InputStreamReader(System.in));
	    do {
	    	str=br.readLine();
	    	 System.out.println(str);
	    }while(! str.equals("end"));
	}

}
