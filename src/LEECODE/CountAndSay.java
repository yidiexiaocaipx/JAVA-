package one_bitandtwo_bitCharacters;

public class CountAndSay {
	public static String countAndSay(int n) {
		StringBuilder str=new StringBuilder();
		if(n==1)
		{
			str.append(1);
		}
		else if(n>1)
		{
			String s=countAndSay(n-1);
			int i=0;
			while(i<s.length())
			{
				int temp=s.charAt(i);
				int sum=1;
				for(int j=i+1;j<s.length() && s.charAt(j)==temp;j++)
				{
					 sum+=1;
				}
				str.append(sum).append(s.charAt(i));	
				i=i+sum;								
			}
			
		}
		return str.toString();
        
    }
	public static void main(String[] args) {

		int n=3;
		System.out.println(countAndSay(n));
	}

}
