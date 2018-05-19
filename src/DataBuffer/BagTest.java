package DataBuffer;

import DataBuffer.Bag.BagIterator;

public class BagTest {

	public static void main(String[] args) {
       Bag<Double> numbers=new Bag<Double>();
       numbers.add(100.0);
       numbers.add(90.0);
       numbers.add(110.0);
       numbers.add(80.0);
       int N=numbers.size();
       Double sum=0.0;
//       for(int i=0;i<N;i++)
//       {
//    	   System.out.println(x);
//       }
       for(double x:numbers) {
    	   System.out.print(x+">");
    	   sum=sum+x;
       }
//       BagIterator bag=(BagIterator) numbers.iterator();
//       while(bag.hasNext())
//       {
//    	   Double d1=(Double) bag.next();
//    	   System.out.println(d1);
//       }
//       double mean=sum/N;
       System.out.println(N);
	}

}
