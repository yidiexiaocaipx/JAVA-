package DataBuffer;

public class QueueAr {
	public QueueAr()
	{
		this(DEFAULT_CAPACITY);
	}
	public QueueAr(int capacity)
	{
		theArray=new Object[capacity];
		makeEmpty();
	}
	public void makeEmpty()
	{
		currentsize=0;
		front=0;
		back=-1;
	}
	Object[] theArray;
	int currentsize;
	int front;
	int back;
	static final int DEFAULT_CAPACITY=10;
	public boolean isEmpty()
	{
		return currentsize==0;
	}
	public boolean isFull()
	{
		return currentsize==theArray.length;
	}
	public void enqueue(Object obj) throws Exception
	{
		if(isFull())
		{
			throw new Exception("queue is full");
		}
		back=increment(back);
		theArray[back]=obj;
		currentsize++;
	}
	public int increment(int s)
	{
		if(++s==theArray.length)
			s=0;
		return s;
	}
	public Object dequeue()  throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("queue is empty");
		}
		Object item=theArray[front];		
		theArray[front]=null;
		front=increment(front);
	    currentsize--;
		return item;
	
	}
	 public void printqueue(QueueAr s)
	 {
		 if(isEmpty())
		 {
			 System.out.println("empty queue");
		 }
		 else {
		 for(int i=0;i<theArray.length;i++)
		 {
			 System.out.print(theArray[i]+">");
		 }
		 System.out.println();
		 }
	 }
	 
	public static void main(String[] args) throws Exception{
		QueueAr q=new QueueAr(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.enqueue(11);
		q.printqueue(q);
		q.dequeue();
//		q.dequeue();
//		q.dequeue();
		q.printqueue(q);
		q.enqueue(11);
		q.printqueue(q);
		
		

	}

}
