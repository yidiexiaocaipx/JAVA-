package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputData{
	static  private String s;
	public static void inputData() {
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入整数");
		try {
			s=buf.readLine();
		}
		catch(IOException e) {}
	}
	public static int StringToInt() {
		inputData();
		return Integer.parseInt(s);
	}
}
class Calculation{
	static void print(int d) {
		System.out.println(d+"的平方是："+d*d);
		System.out.println(d+"的立方是："+d*d*d);
	}
}
public class InputDataCalculation {

	public static void main(String[] args) {
      //  InputData input=new InputData();
        int a=InputData.StringToInt();
        Calculation.print(a);
        
        
	}

}
