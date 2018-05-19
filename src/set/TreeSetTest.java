package set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
        TreeSet ha=new TreeSet(new ComparetorByLength());
        ha.add("aaaa");
        ha.add("zzd");
        ha.add("abc");
        ha.add("sssss");
//       String  st=null;
//        Object
        java.util.Iterator it=ha.iterator();
        while(it.hasNext())
        {
        
     	   System.out.println(it.next());
        }
		
	}

}
