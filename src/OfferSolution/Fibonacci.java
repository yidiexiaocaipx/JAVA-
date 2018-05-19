package OfferSolution;

public class Fibonacci {
	 public int Fibonacci(int n) {
	        int  fibZero=0;
	        int fibOne=1;
	        int fibN=0;
	        if(n==0)
	            return 0;
	        else if(n==1)
	            return 1;
	        else{
	            for(int i=2;i<=n;i++){
	                fibN=fibZero+fibOne;
	                fibZero=fibOne;
	                fibOne=fibN;
	            }
	            return fibN;
	        }
	    }
}
