package Solution;

import java.util.Stack;

public class StackPushPopStack {
    public static boolean IsPopOrder(int[] pushA,int[] popA) {
    	Stack<Integer> sta=new Stack<>();
    	if(pushA==null || popA==null || pushA.length !=popA.length)
    		return false;
    	int pushIndex=0;
    	int popIndex=0;
    	while(true) {
    		if(popIndex==popA.length)
    			return true;
    		else if(! sta.isEmpty() && sta.peek()==popA[popIndex]) {
    			sta.pop();
    		    popIndex++;
    		}
    		else if(pushIndex<pushA.length) {
    			sta.push(pushA[pushIndex]);
    			pushIndex++;   				
    		} 
    		else
    			return false;
    	}
    }
	public static void main(String[] args) {

		int[] pushA= {1,2,3,4,5};
		int[] popA= {4,3,5,1,2};
		System.out.println(IsPopOrder(pushA,popA) );
	}

}
