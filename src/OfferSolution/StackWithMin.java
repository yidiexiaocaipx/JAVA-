package Solution;

import java.util.LinkedList;

public class StackWithMin<T extends Comparable<T>> {
    LinkedList<T> list=new LinkedList<>();
    LinkedList<T> minList=new LinkedList<>();
    public void push(T node) {
        list.push(node);
        if(minList.isEmpty() || node.compareTo(top())<0) 
        	minList.push(node);
        else
        	minList.push(top());       	
    }
    
    public void pop() {
        list.pop();
        minList.pop();
    }
    
    public T top() {
        return list.peekFirst();
    }
    
    public T min() {
        return minList.peekFirst() ;
    }
}
