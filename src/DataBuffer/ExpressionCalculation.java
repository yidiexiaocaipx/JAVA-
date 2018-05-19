package DataBuffer;

import java.util.Scanner;
import java.util.Stack;

public class ExpressionCalculation {

	public static void CalculateExpression(String str) {
		char[] cn=str.toCharArray();
		Stack<Integer> numStack=new Stack<>();
		Stack<Character> charStack=new Stack<>();
		int n=0;
		int value=0;
		for(int i=0;i<cn.length;i++) {
			char temp=cn[i];
			if(Character.isDigit(temp)) {
				n=n*10+Integer.parseInt(String.valueOf(temp));
			}
			else {
				if(n!=0) {
					numStack.push(n);
					n=0;
				}
				if(temp=='(') {
					charStack.push(temp);
				}
				else if(temp==')') {
					while(charStack.peek()!='(') {
						value=cal(numStack.pop(),numStack.pop(),charStack.pop());
						numStack.push(value);
					}
					charStack.pop();
				}
				else if(isType(temp)>0) {
					if(charStack.isEmpty()) {
						charStack.push(temp);
					}
					else { 
						if(isType(temp)<=isType(charStack.peek())) {
						value=cal(numStack.pop(),numStack.pop(),charStack.pop());
						numStack.push(value);
					   }
					   charStack.push(temp);	
					}
				}				
			}
		}
		if(n!=0) {
			numStack.push(n);			
		}
		while(! charStack.isEmpty()) {
			value=cal(numStack.pop(),numStack.pop(),charStack.pop());
			numStack.push(value);
		}
		System.out.println(numStack.pop());											
	}
public static int cal(int a,int b,char c) {
	if(c=='+')
		return b+a;
	else if(c=='-')
		return b-a;
	else if(c=='*')
		return b*a;
	else
		return b/a;
	}
public static int isType(char c) {
	if(c=='+'||c=='-') 
		return 1;
    else if(c=='*'||c=='/') 
    	return 2;
    else 
    	return 0;	    
}
public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   String str;
   //do {
	   str=s.nextLine();
	   CalculateExpression(str);
 //  }while(! str.equals("end"));
}

}
