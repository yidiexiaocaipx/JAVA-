package DataBuffer;

class Listcode{
	Listcode(Object obj)
	{
		this(obj,null);
	}
	Listcode(Object obj, Listcode next)
	{
		element=obj;
		this.next=next;
	}
	Object element;
	Listcode next;
}
class codeaddress{
	codeaddress(Listcode node)
	{
		current= node;
	}
	public boolean isEnd()
	{
		return current==null;
	}
	public Object retrieve()
	{
		return isEnd()? null:current.element;
	}
	public void advance()
	{
		if(! isEnd())
		{
			current=current.next;
		}
	}
	Listcode current;
}
public class LinkList1 {
	public LinkList1()
	{
		header=new Listcode(null);
	}
	public boolean isEmpty()
	{
		return header.next==null;
	}
	public void makeEmpty()
	{
		header.next=null;
	}
	public codeaddress zeroth()
	{
		return new codeaddress(header);
	}
	public codeaddress first()
	{
		return new codeaddress(header.next);
	}
	/*
	 * ²åÈëcºó
	 */
	public void insert(Object obj, codeaddress c)
	{
		if(c!=null && c.current!=null)
		{
			c.current.next=new Listcode(obj,c.current.next);
		}
	}
	public codeaddress find(Object obj)
	{
		Listcode itr=header.next;
		while(itr!=null && !itr.element.equals(obj))
		{
			itr=itr.next;
		}
		if(itr==null)
			System.out.println("no find");
		else
		    System.out.println("find"+new codeaddress(itr).retrieve());
		return new codeaddress(itr);
	}
	public void delete(Object obj)
	{
		codeaddress c=findprevious(obj);
		c.current.next=c.current.next.next;
	}
	public codeaddress findprevious(Object obj)
	{
		Listcode itr=header;
		while(itr.next!=null && !itr.next.element.equals(obj))
		{
			itr=itr.next;
		}
		return new codeaddress(itr);
	}
	public static void printList(LinkList1 list)
	{
		if(list.isEmpty())
		{
			System.out.println("Empty list");
		}
		else
		{
			codeaddress itr=list.first();
			for(;!itr.isEnd();itr.advance())
			{
				System.out.print(itr.retrieve()+"->");
			}
			System.out.println();
		}
	
	}
    private	Listcode header;

public static void main(String[] args) 
{
	LinkList1 l=new LinkList1();
	l.insert(3, l.zeroth());
	l.insert(2, l.zeroth());
	l.insert(4, l.zeroth());
	l.printList(l);
	l.find(5);
	l.delete(2);
	l.printList(l);
//	System.out.println(l.find(4).retrieve());
}
}

