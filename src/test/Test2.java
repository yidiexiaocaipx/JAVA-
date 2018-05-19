package Thread;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.length()==1)
			System.out.println(str);
		else {
		StringBuffer sb=new StringBuffer();
		sb.append(str.charAt(0));
		int i=1;
		boolean temp=true;
		while(str.charAt(i)!=sb.charAt(0)) {
		   sb.append(str.charAt(i));
		   i++;
		}
		String substring=sb.toString();
		int length=i;
		if((str.length() % length) !=0) {
			temp=false;	
			System.out.println(temp);
		}
		else
		{
			int j=0;
			while(j<str.length()) {
				String str1=str.substring(j, j+length);
				if(str1.equals(str1))
					j+=length;
				else {
					temp=false;
					System.out.println(temp);
					break;
				}					
			}
			if(j==str.length())
			{
				System.out.println(substring);
			}
		}
		}
		
		//System.out.println(substring);
		
		//System.out.println(str);

	}

}
