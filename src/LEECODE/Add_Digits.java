package one_bitandtwo_bitCharacters;

public class Add_Digits {
		public static int addDigits(int num) {
//			int a=0;
//			int b=0;
//			int sum=0;
//			sum=num;
//			int temp=1;
//			while(temp !=0)
//			{
//               a=sum % 10;
//               b=sum / 10;
//               sum=a+b;
//               temp=sum-sum %10;
//			}
//			return sum;
			int result = num - num / 9 * 9;
			return result;
    }
		public static void main(String[] args)
		{
			int temp=38;
			System.out.println(addDigits(temp));
		}
}
