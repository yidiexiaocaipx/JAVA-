package Thread;

public class Test6 {

	public static void main(String[] args) {

		StringBuffer a=new StringBuffer("A");
		StringBuffer b=new StringBuffer("B");
		modify(a,b);
		System.out.print(a+","+b);
	}
	public static void modify(StringBuffer x,StringBuffer y) {
		y.append(x);
		y=x;
	}

}
