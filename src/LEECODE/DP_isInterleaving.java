package LEECODE;

public class DP_isInterleaving {

	public static boolean isInterleave(String s1,String s2,String s3) {
		int length1=s1.length();
		int length2=s2.length();
		int length3=s3.length();
		if((length1+length2)!=length3) {
			return false;
		}

		boolean[][] result=new boolean[length1+1][length2+1];
		result[0][0]=true;  
		//   result[i][j] s1前i个字符与s2前j个字符是否顺序匹配s3前i+j个字符
		for(int i=1;i<=length1;i++) {
			result[i][0]=result[i-1][0] && (s3.charAt(i-1)==s1.charAt(i-1));
		}
		for(int j=1;j<=length2;j++) {
			result[0][j]=result[0][j-1] && (s3.charAt(j-1)==s2.charAt(j-1));
		}
		for(int i=1;i<=length1;i++) {
			for(int j=1;j<=length2;j++) {
				result[i][j]=(result[i-1][j] && (s3.charAt(i+j-1)==s1.charAt(i-1))) || 
						(result[i][j-1] && (s3.charAt(i+j-1)==s2.charAt(j-1)));
			}
		}
		return result[length1][length2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="aabcc";
        String s2="dbbca";
        String s3="aadbbcbcac";
        String s4="aadbbbaccc";
        boolean result1=isInterleave(s1,s2,s4);
        System.out.println(result1);
	}

}
