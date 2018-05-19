package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.Arrays;

public class Trans {
	public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str=new StringBuilder();
        StringBuilder strLast=new StringBuilder();
        try {
			String s=buf.readLine();
	//		 System.out.println(s);
			for(int i=0;i<s.length();i++)
			{
				
				if(s.charAt(i)!='+')
				{
					char c=s.charAt(i);				
					str.append(c);
				}
			}
		//	System.out.println(str.toString());
			char[] arr=new char[str.capacity()];
			for(int i=0;i<str.length();i++)
			{
				arr[i]=str.charAt(i);	
			}
			Arrays.sort(arr);
			int i=0;
			while(i<arr.length)
			{
				int num=0;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==arr[i]) {
						num++;
					}
					else {
						strLast.append(arr[i]).append('*').append(num).append('+');
					}
				}
				i+=num;
			}
			System.out.print(strLast.toString());
		}
        
		catch(IOException e) {}
	}

}
