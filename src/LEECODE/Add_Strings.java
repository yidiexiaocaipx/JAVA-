package one_bitandtwo_bitCharacters;

public class Add_Strings {
  public static String addStrings(String num1, String num2)
  {
	  StringBuilder temp=new StringBuilder();
	  int i=num1.length()-1;
	  int j=num2.length()-1;
	  int carry=0;
	  while(i>=0 || j>=0)
	  {
		  int sum=carry;
		  if(i>=0)
			  sum+=num1.charAt(i--)-'0';
		  if(j>=0)
			  sum+=num2.charAt(j--)-'0';
		  temp.append(sum % 10);
		  carry=sum /10;
	  }
		 if (carry!=0)
			 temp.append(carry);
	return temp.reverse().toString();
			  
  }
  public static void main(String[] args)
	{
		String num1="256";
		String num2="64";
		System.out.println(addStrings(num1,num2));
	}
}
