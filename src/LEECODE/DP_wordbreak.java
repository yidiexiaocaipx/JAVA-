package LEECODE;

import java.util.HashSet;
import java.util.Set;

public class DP_wordbreak {
// D[i]  s[0,i-1]是否可以分割
    public static  boolean wordBreak(String s, Set<String> dict) {
        boolean[] D=new boolean[s.length()+1];
        D[0]=true;
        for(int i=1;i<=s.length();i++) {
        	for(int j=0;j<i;j++)
        	{
        		//s[0,j-1]可以分割 && s[j,i-1]在dict中
        		if(D[j] && dict.contains(s.substring(j, i))) {
        			D[i]=true;
        			break;
        		}
//        		if(D[i]) {
//        			break;
//        		}
        	//	System.out.println(D[i]);
        	}
        }
        return D[s.length()];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leetcode";
		Set<String> dict=new HashSet<String>();
		dict.add("leet");
		dict.add("code");
		System.out.println(wordBreak(s,dict));

	}

}
