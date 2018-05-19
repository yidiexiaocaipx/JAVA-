package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		System.out.print(str);
		if(str==null && str.length()==1) {
			System.out.println(-1);
		}	
		char[] ac=str.toCharArray();
		int acLength=ac.length;
		int maxLength=1;
		int index=1;
		while(index>0 && index<acLength-1) {
			int i=index-1;
			int j=index+1;
		    while(i>=0 && j<acLength && ac[i]==ac[j]) {
		    	i--;
		    	j++;
		    }
			int curLength=j-i-1;
			if(curLength>maxLength) {
				maxLength=curLength;
			}
			i=index;
			j=index+1;
		    while(i>=0 && j<acLength && ac[i]==ac[j]) {
		    	i--;
		    	j++;
		    }
		    curLength=j-i-1;
			if(curLength>maxLength) {
				maxLength=curLength;
			}
			index++;
		}
		System.out.println(maxLength);
	}

}
