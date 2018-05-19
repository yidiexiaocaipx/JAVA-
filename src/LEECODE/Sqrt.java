package one_bitandtwo_bitCharacters;

public class Sqrt {
	public static int mySqrt(int x) {
        int left=0;
        int right=Integer.MAX_VALUE;
        int mid=0;
        while(true)
        {
            mid=left+(right-left)/2;
//            if((mid*mid)<x)
            if(mid !=0)
            {
            if(mid>x/mid)
            	right=mid;
//                left=mid+1;
            else
            {
//                if((mid+1)*(mid+1)>x)
                if((mid+1)>x/(mid+1))
                    return mid;
//                right=mid-1;
                left=mid+1;
                    
            }
            }
        }
    }
	public static void main(String[] args) {
           int x=17;
           System.out.println(mySqrt(x));
	}

}
