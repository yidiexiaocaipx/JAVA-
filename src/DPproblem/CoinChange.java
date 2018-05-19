package DPproblem;

public class CoinChange {

	public static void CoinSolution(int[] coinType,int money) {
		int[] F=new int[money+1];      //��¼�ܽ��Ϊi�������С������  
		int[] index=new int[money+1];   //��¼min(F[i-coinType[j]]�е�Ӳ���±�j
		F[0]=0;
		index[0]=0;		
		for(int i=1;i<=money;i++) {
			int temp=Integer.MAX_VALUE;
			for(int j=0;j<coinType.length;j++) {
				if((i>=coinType[j]) && F[i-coinType[j]]<temp){
					temp=F[i-coinType[j]];
					index[i]=j;
				}			
			}
//			int j=0;
//			while((j<coinType.length) && (i>=coinType[j])) {
//				if(F[i-coinType[j]]<temp){
//					temp=F[i-coinType[j]];
//					index[i]=j;
//				}	
//				j++;
//			}
			F[i]=temp+1;
		}
		System.out.println("��������Ӳ����Ϊ:"+F[money]);
		System.out.println("Ӳ�����Ϊ:");
		int num=0;
		//����
		while(money>0) {
			num=index[money];
			System.out.print(coinType[num]+",");
			money=money-coinType[num];
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int money=65;
       int[] coinType= {25,21,10,5,1};
       CoinSolution(coinType,money);
	}

}
