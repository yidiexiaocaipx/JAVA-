package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {
           HashSet has=new LinkedHashSet();
           has.add(new Person("lili",27));
           has.add(new Person("yaya",28));
           has.add(new Person("sasa",27));
           has.add(new Person("lili",27));
//          String  st=null;
//           Object
           Iterator it=has.iterator();
           while(it.hasNext())
           {
        	   Person p=(Person) it.next();
        	   System.out.println(p.getName()+"...."+p.getAge());
           }
           
           
	}

}
 