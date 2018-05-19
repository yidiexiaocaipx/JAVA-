package OfferSolution;

public class NumOfOne {

	public static int NumOf1(int n) {
		int m=0;
		while(n!=0) {
			n=n & (n-1);
			++m;
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m=10;
        System.out.println(NumOf1(m));
	}

}
