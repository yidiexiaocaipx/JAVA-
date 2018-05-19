package Solution;

public class TagTransfer {
   public static String replaceSpace(StringBuffer str)
   {
	   int orignalLength=str.length();
	   int numOfBlank=0;
	 //  String s="%20";
	   for(int i=0;i<orignalLength;i++)
	   {
		   if(str.charAt(i)==' ')
			numOfBlank+=1;
	   }
	   if(numOfBlank ==0)
	   {
		   return str.toString();
	   }
	   int newLength=orignalLength+numOfBlank*2;
	   str.setLength(newLength);
	   int orignalIndex=orignalLength-1;
	   int newIndex=newLength-1;
	   while(orignalIndex>=0 && newIndex>orignalIndex)
	   {
		   if(str.charAt(orignalIndex)==' ')
		   {
			   str.setCharAt(newIndex--,'0');
			   str.setCharAt(newIndex--,'2');
			   str.setCharAt(newIndex--,'%');
			   orignalIndex--;
		   }
		   else
			   str.setCharAt(newIndex--,str.charAt(orignalIndex--));
	   }
	   return str.toString();
   }
   public static void  main(String[] args){
       StringBuffer  s1 = new StringBuffer("We are happy.");
       String s2=replaceSpace(s1);
       System.out.println(s2);


   }
}
