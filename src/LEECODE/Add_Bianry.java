package one_bitandtwo_bitCharacters;

public class Add_Bianry {
	public static String addBinary(String a, String b) {
		//еп╤о
//        int a1=Integer.parseInt(a, 2);
//        int b1=Integer.parseInt(b, 2);
//        int sum=a1+b1;
//        String addsum;
//		if ((sum-a1)!=b1)
//        	addsum=Integer.toBinaryString(Integer.MAX_VALUE);
//        else
//        	addsum=Integer.toBinaryString(sum);
//        return addsum;
		
		
		StringBuilder temp=new StringBuilder();
		int i=a.length()-1;
		int j=b.length()-1;
		int carry=0;
		while(i>=0 || j>=0)
		{
			int sum=carry;
			if (i>=0)
			sum+=a.charAt(i--)-'0';
			if(j>=0)
			sum+=b.charAt(j--)-'0';
			
			temp.append(sum % 2);
			carry=sum / 2;
		}
		if (carry!=0)
			temp.append(carry);
		return temp.reverse().toString();
		
//        StringBuilder sb = new StringBuilder();
//        int i = a.length() - 1, j = b.length() -1, carry = 0;
//        while (i >= 0 || j >= 0) {
//            int sum = carry;
//            if (j >= 0) sum += b.charAt(j--) - '0';
//            if (i >= 0) sum += a.charAt(i--) - '0';
//            sb.append(sum % 2);
//            carry = sum / 2;
//        }
//        if (carry != 0) sb.append(carry);
//        return sb.reverse().toString();
        
    }

	public static void main(String[] args) {
            String a="11";
            String b="1";
            String sum=addBinary(a,b);
            System.out.println(sum);
//            int a=1;
//            int b=2;
//            System.out.println(a/b);
            
            
	}

}
