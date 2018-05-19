package DataBuffer;
//class Listcode{
//	Listcode(Object obj)
//	{
//		this(obj,null);
//	}
//	Listcode(Object obj, Listcode next)
//	{
//		element=obj;
//		this.next=next;
//	}
//	Object element;
//	Listcode next;
//}
public class stackLi {
	public stackLi()
	{
		top=null;
	}
	public boolean isFull()
	{
		return false;
	}
	public boolean isEmpty()
	{
		return top==null;
	}
	public void makeEmpty()
	{
		top=null;
	}
	public void push(Object obj)
	{
		top=new Listcode(obj, top);
	}
	public void pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("stack is empty!");  
		}
		top=top.next;
	}
	public Object topPush(Object obj)
	{
//		if(isEmpty())
//			return null;
		top=new Listcode(obj, top);
		return top.element;
	}
	public Object topPop()
	{
		if(isEmpty())
			return null;
		Object topitem=top.element;
		top=top.next;
		return topitem;
	}
	public void printStack(stackLi stack)
	{
		if(stack.isEmpty())
		{
			System.out.println("Empty stack");
		}
		else
		{
			codeaddress itr=new codeaddress(top);
			for(;!itr.isEnd();itr.advance())
			{
				System.out.print(itr.retrieve()+"->");
			}
			System.out.println();
		}
	
	}
    private Listcode top;
	public static void main(String[] args) throws Exception{
		stackLi s=new stackLi();
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.printStack(s);
		System.out.println(s.topPop());
//		s.pop();
		s.printStack(s);
		System.out.println(s.topPush(7));
		s.printStack(s);
		

	}

}
