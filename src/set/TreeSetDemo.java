package set;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

//import java.util.Iterator;
////import java.util.LinkedHashSet;

public class TreeSetDemo {

	public static void main(String[] args) {
        TreeSet ha=new TreeSet(new ComparetorByName());
        ha.add(new Person("lili",27));
        ha.add(new Person("yaya",28));
        ha.add(new Person("sasa",23));
        ha.add(new Person("hihi",25));
        ha.add(new Person("hihi",23));
//       String  st=null;
//        Object
        java.util.Iterator it=ha.iterator();
        while(it.hasNext())
        {
     	   Person p=(Person) it.next();
     	   System.out.println(p.getName()+"...."+p.getAge());
        }
	}

//	private void add(Person person) {
//	}

}
