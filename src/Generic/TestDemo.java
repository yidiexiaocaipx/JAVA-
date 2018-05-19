package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import set.Person;


interface Inter<T>{
	public void show(T t);
}
class Interface<Q> implements Inter<Q>{
	public void show(Q t) {
		System.out.println(t);
	}
}
public class TestDemo {

	public static void main(String[] args) {
//      A<String> a=new A<>("aaaa");
////      System.out.println(a.get());
//      Collection c=new ArrayList<String>();
//      List<Integer> l=new ArrayList<>();
//      l.add(1);
//      l.add(2);
//      test(l);
      ArrayList<String> a1=new ArrayList<String>();
      a1.add("zhangsan");
      a1.add("lisi");
//      a1.add(4);
//      Iterator<String> it=a1.iterator();
//      while(it.hasNext())
//      {
//    	  String s=it.next();
//    	  System.out.println(s); 
//     }
      TreeSet<Person> a2=new TreeSet<>();
      a2.add(new Person("lili",23));
      a2.add(new Person("lyly",23));
      a2.add(new Person("lisi",23));
      a2.add(new Person("liso",23));
      TreeSet<String> a3=new TreeSet<>();
      a3.add("lili");
      a3.add("lili");
      TreeSet<Integer> a4=new TreeSet<>();
      a4.add(4);
      a4.add(9);
//      printCollection(a3);
//      printCollection(a4);
//      Tool<String> tool=new Tool<>();
//      tool.show(new Integer(4));
//      tool.print("lili");
//      Interface in=new Interface();
//      in.show("abc");
//      in.show(4);
      TreeSet<Worker> a5=new TreeSet<>();
      TreeSet<Student> a6=new TreeSet<>();
      a5.add(new Worker("lili",26));
      a5.add(new Worker("oilo",23));
      a6.add(new Student("sasa",24));
      a6.add(new Student("mm",28));
//      printCollection(a5);
//      printCollection(a6);
      TreeSet<Person> a7=new TreeSet<>();
      a7.addAll(a5);
//      System.out.println(a7.size());
      List <?>[] lsa=new ArrayList<?>[10];
      Object[] oa=lsa;
      List<Integer> li=new ArrayList<>();
      List<String> li1=new ArrayList<>();
      li.add(5);
      li1.add("lili");
      oa[1]=li;
      oa[2]=li1;
      System.out.println(lsa[1].get(0));
      System.out.println(lsa[2].get(0));
	}
	/**
	 * 
	 */
	private static void printCollection(Collection<? extends Person> a2) {
		Iterator<? extends Person> it=a2.iterator();
		  while(it.hasNext())
		  {
			 // T s=it.next();
			  Person p=it.next();
//			  System.out.println(it.next()); 
			  System.out.println(p.getName()+":"+p.getAge()); 
		  }
	}
	public static void test(List<?> l)
	{
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}

}
