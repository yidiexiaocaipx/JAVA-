package set;

import java.util.Comparator;

public class ComparetorByLength implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String p1=(String) o1;
		String p2=(String) o2;
		int temp=p1.length()-p2.length();
		return temp==0? p1.compareTo(p2): temp;
	}

}
