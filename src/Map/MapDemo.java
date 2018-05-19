package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
       Map<Integer,String> map= new HashMap<Integer,String>();
       MapMethods1(map);
       
	}
	public static void MapMethods(Map<Integer,String> map)
	{
		map.put(1, "zhangsan");
		map.put(2, "lisi");
		System.out.println(map.put(1, "lisi"));
		map.put(3, "wangx");
		map.put(3, "mmmm");
		
		System.out.println(map);
//		map.remove(2);
		System.out.println("remove"+" "+map.remove(2));
		System.out.println(map);
	}
	public static void MapMethods1(Map<Integer,String> map)
	{
		map.put(1, "zhangsan");
		map.put(2, "lisi");
//		System.out.println(map.put(1, "lisi"));
		map.put(3, "wangx");
		map.put(3, "mmmm");
		Set<Integer> s=map.keySet();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext())
		{
			Integer temp=it.next();
			String value=map.get(temp);
			System.out.println(temp+":"+value);
			
		}
//		System.out.println(map);
//		map.remove(2);
//		System.out.println("remove"+" "+map.remove(2));
//		System.out.println(map);
	}

}
