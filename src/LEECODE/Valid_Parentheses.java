package one_bitandtwo_bitCharacters;

import java.util.Stack;

public class Valid_Parentheses {

	public static boolean isvalid(String s)
	{
//		if (s.length()==1) return false;
//        int i=0;
//        while(i<s.length()-1)   
//        {
//            if (s.charAt(i)=='(')
//            {
//                i++;
//                if (s.charAt(i)!=')')
//                    break;
//            }
//            if (s.charAt(i)=='{')
//            {
//                i++;
//                if (s.charAt(i)!='}')
//                    break;
//            }
//            if (s.charAt(i)=='[')
//            {
//                i++;
//                if (s.charAt(i)!=']')
//                    break;
//            } 
//            i++;
//        }
//            if (i==s.length())
//                return true;
//            else
//                return false;
            
		Stack<Character> stack=new Stack<Character>();
		for(char c:s.toCharArray())
		{
			if (c=='(')
				stack.push(')');
			else if (c=='[')
				stack.push(']');
			else if (c=='{') 
				stack.push('}');	
			else if(stack.isEmpty() || stack.pop()!=c)
				return false;
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
         String s="[](){}";
         System.out.println(isvalid(s));
        		 
	}

}
