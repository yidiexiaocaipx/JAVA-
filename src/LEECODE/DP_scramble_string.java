package LEECODE;

import java.util.Arrays;

public class DP_scramble_string {

	public static boolean isScramble(String s1,String s2) {
//		if(s1.length()!=s2.length()) {
//			return false;
//		}
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
	    Arrays.sort(c1);
	    Arrays.sort(c2);
//	    for(int i=0;i<c1.length;i++) {
//	    	System.out.print(c1[i]);
//	    }
//	    System.out.println();
//	    for(int i=0;i<c2.length;i++) {
//	    	System.out.print(c2[i]);
//	    }
//	    System.out.println();
	    int len1=s1.length();
	    int len2=s2.length();
    	char[] chars1 = new char[len1];
    	s1.getChars(0, len1, chars1, 0);
    	Arrays.sort(chars1);
    	char[] chars2 = new char[len1];
    	s2.getChars(0, len2, chars2, 0);
    	Arrays.sort(chars2);
    	if (!(new String(chars1).equals(new String(chars2))))
	    	return false;
//	    for(int i=0;i<c1.length;i++) {
//	    	if(c1[i] !=c2[i]) {
//	    		return false;
//	    	}
//	    }
	    for(int i=1;i<len1;i++) {
	    	String s1left=s1.substring(0, i);
	    	String s1right=s1.substring(i, len1);
	    	String s2left=s2.substring(0, i);
	    	String s2right=s2.substring(i, len1);
	    	
	    	if(isScramble(s1left,s2left) && isScramble(s1right,s2right)) {
	    		return true;
	    	}
	    	 s2right=s2.substring(len1-i,len1);
	    	 s2left=s2.substring(0,len1-i);
	    	
	    	 if(isScramble(s1left,s2right) && isScramble(s1right,s2left)) {
	    		 return true;
	    	 }    	
	    	 
	    }
	    return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="great";
      String s2="great";
      System.out.println(isScramble(s1,s2));
	}

}
