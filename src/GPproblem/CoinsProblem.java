package GPproblem;
//零钱没有数目限制
public class CoinsProblem {

	public static int[] CoinsSolution(int money,int values[]) {
		int[] num=new int[values.length];		
           for(int i=0;i<values.length;i++) {
        	   num[i]=money / values[i];
        	   money=money % values[i];
           }
           return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
