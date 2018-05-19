package StringBuilderTest;

public class StringBuliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
        String s=ArraytoString(a);
//        int b=s.indexOf('[');
//        System.out.println(s.substring(2));   
//        System.out.println(s);
//        String s1="abc";
//        String s2=new String("abc");
//        System.out.println(s==s1);
//        System.out.println(s.equals(s1));
//        System.out.println(s);
        s="ab.c.def";
//        String[] arr=s.split("");
//        char[] arr=s.toCharArray();
        byte[] arr=s.getBytes();
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
         String s1=new String("abc");
         String s2=s1.intern();
         System.out.println(s1==s2);
         
	}

public static String ArraytoString(int[] a)
{
	StringBuilder s=new StringBuilder("[");
	for (int i=0;i<a.length;i++)
	{
		if (i!=a.length-1)
		s.append(a[i]+",");
		else
		s.append(a[i]+"]");
		
	}	
	String t=s.toString();
	return t;
}
}
