// ×Ö·û´®ÅÅÐòºóÊä³ö
package StringBuilderTest;
import java.util.Arrays;
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bufferMethodDemo();
		
	}
	public static void bufferMethodDemo()
	{
//		StringBuffer s=new StringBuffer("abcd");
	//	s.reverse();
//		Integer a=new Integer(4);
//		Integer b=new Integer("4");
//		System.out.println(a.equals(b));
//		System.out.println(a==b);
//		Integer x=128;
//		Integer y=128;
//		System.out.println(x.equals(y));
//		System.out.println(x==y);
		String s="20 78 9 -7 88 36 29";
		System.out.println(s);
		String s1=sortString(s);
		System.out.println(s1);
		
	}
	public static String sortString(String s) {
		String[] str_arr=stringToArray(s);
		int[] num_arr=ToIntArray(str_arr);
//		for (int i=0;i<num_arr.length;i++)
//		{
//		 System.out.println(num_arr[i]);
//		}
		mySortArray(num_arr);
		String str=ArrayToString(num_arr);
		return str;
	}
	public static String ArrayToString(int[] num_arr) {
		StringBuilder s=new StringBuilder();
		for(int i=0;i<num_arr.length;i++)
		{
			if(i!=num_arr.length-1)
			{
				s.append(num_arr[i]+" ");
			}
			else
				s.append(num_arr[i]);
		}
		return s.toString();
	}
	public static void mySortArray(int[] num_arr) {
		Arrays.sort(num_arr);
	}
	public static int[] ToIntArray(String[] str_arr) {
		int[] num=new int[str_arr.length];
		for(int i=0;i<str_arr.length;i++)
		{
			num[i]=Integer.parseInt(str_arr[i]);
		}
		return num;
	}
	public static String[] stringToArray(String s) {
		String[] str=s.split(" ");
		return str;
	}

}
