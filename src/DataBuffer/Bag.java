package DataBuffer;

import java.util.Iterator;

//import Linkedlist.Linkedlist.Data;

public class Bag<Item> implements Iterable<Item>
{
	BagNode first=null;
	int size;
    public void add(Item item)
    {
//        Data data = new Data(obj);  
//        data.next = first;  
//        first = data;  
        BagNode node=new BagNode(item);
        node.next=first;
        first=node;
//    	BagNode oldfirst=first;
//    	first.item=item;
//    	first.next=oldfirst;
    	size=size+1;
    	System.out.println(node.item);
    }
    public boolean isEmpty()
	{
		return first.next==null;
	}
    public int size()
	{
		return size;
	}
	@Override
	public Iterator<Item> iterator() {
		return new BagIterator();
	}
	public class BagIterator implements Iterator<Item>{
		BagNode node=first;

		@Override
		public boolean hasNext() {
			return node.next!=null;
		}

		@Override
		public Item next() {
			Item item=(Item) node.item;
			node=node.next;
			return item;
		}
		
	}

}

