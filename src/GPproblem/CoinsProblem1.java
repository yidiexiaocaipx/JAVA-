package GPproblem;
//��Ǯ��Ŀ����
public class CoinsProblem1 {

	public static int[] CoinsSolution(int[] values,int[] nums,int money) {
		int[] c=new int[values.length];
		for(int i=0;i<values.length;i++) {
			c[i]=Math.min(money/values[i], nums[i]);
			money=money-values[i]*c[i];
		}
		if(money>0) {
			System.out.println("�������Ǯ�ܶ�");
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	}

}
