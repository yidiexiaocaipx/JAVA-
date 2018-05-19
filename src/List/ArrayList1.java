package List;

import java.util.ArrayList;
import java.util.Iterator;

import set.Person;

public class ArrayList1{
public static void main(String[] args)
{
	ArrayList1 a1=new ArrayList1();
//	a1.add("abc1");
//	a1.add("abc2");
//	a1.add("abc3");
//	a1.add("abc4");
//	a1.add("abc1");
	a1.add(new Person("lili",24));
	a1.add(new Person("yaya",23));
	a1.add(new Person("mama",25));
	a1.add(new Person("lili",24));
	
	System.out.println(a1);
	a1=getSingleElement(a1);
	System.out.println(a1);
}

private static ArrayList1 getSingleElement(ArrayList1 a1) {
	ArrayList1 temp=new ArrayList1();
	Iterator it=a1.iterator();
	while(it.hasNext()) {
		Object obj=it.next();
		if (!(temp.contains(obj)))
		{
			temp.add(obj);
		}
	}
	return temp;
}
}