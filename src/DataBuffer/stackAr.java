package DataBuffer;
public class stackAr{
	public stackAr()
	{
		this(DEFAULT_CAPACITY);
	}
	public stackAr(int capacity)
	{
		theArray=new Object[capacity];
		top=-1;
	}
	 private Object[] theArray;
	 private int top;
	 static final int DEFAULT_CAPACITY=10;
	 public boolean isEmpty()
	 {
		 return top==-1;
	 }
	 public boolean isFull()
	 {
		 return top==theArray.length-1;
	 }
	 public void makeEmpty()
	 {
		 top=-1;
	 }
	 public void push(Object obj) throws Exception
	 {
		 if(isFull())
		 {
			 throw new Exception("stack is full");
		 }
		 theArray[++top]=obj;
		 
	 }
	 public Object toppop()  throws Exception 
	 {
		 if(isEmpty())
		 {
			 throw new Exception("stack is empty");
		 }
		 Object item=theArray[top];
		 theArray[top--]=null;
		 System.out.println(item);
		 return item;
	 }
	 public void printstack(stackAr s)
	 {
		 if(isEmpty())
		 {
			 System.out.println("empty stack");
		 }
		 for(int i=0;i<=top;i++)
		 {
			 System.out.print(theArray[i]+">-");
		 }
		 System.out.println();
	 }
	 

	public static void main(String[] args) throws Exception{
		stackAr s=new stackAr();
		s.push(3);
		s.printstack(s);
		s.push(4);
		s.printstack(s);
		s.toppop();
		s.printstack(s);

	}
}
