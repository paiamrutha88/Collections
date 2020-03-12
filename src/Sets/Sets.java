package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	
	public static void main(String args[])
	{
		Set <String> names = new HashSet<String>();
		names.add("nokia");
		names.add("vivo");
		names.add("oppo");
		names.add("realme");
		names.add("realme");
		
		System.out.println(names);
		
		Iterator itr = names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		for(String name : names)
			System.out.println(name);
		
		Set <String> names1 = new LinkedHashSet<String>();
		names1.add("nokia");
		names1.add("vivo");
		names1.add("oppo");
		names1.add("realme");
		names1.add("realme");
		System.out.println(names1);
		
		itr = names1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Set <String> names2 = new TreeSet<String>();
		names2.add("nokia");
		names2.add("vivo");
		names2.add("oppo");
		names2.add("realme");
		names2.add("realme");
		System.out.println(names2);
		
		itr = names2.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		System.out.println(names.containsAll(names1));
		
		
	}

}
