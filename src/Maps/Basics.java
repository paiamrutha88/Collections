package Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Basics {
	
	public static void main(String args[])
	{
		
		Map<String, ArrayList<String>> obs = new HashMap<String, ArrayList<String>>();
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("nano");
		cars.add("safari");
		
		
		obs.put("tata", cars);
		
		ArrayList<String> cars1 = new ArrayList<String>();
		
		
		cars1.add("brezza");
		cars1.add("swift");
		
		obs.put("maruti", cars1);
		
		System.out.println(obs);
		//iterate through keys
		Set <String> iset = obs.keySet();
		
		Iterator<String> itr=iset.iterator();
		
		while (itr.hasNext())
		{
			String key = itr.next();
			ArrayList<String> value= obs.get(key);
			
			System.out.println(key +"->"+ value);
		}
		//iterate through values
		Collection<ArrayList<String>> models = obs.values(); 
		
		for (ArrayList<String> name : models)
		{
			System.out.println(name);
		}
		
		//
		
		Set <Map.Entry<String, ArrayList<String>>> entries = obs.entrySet();
		
		for (Map.Entry<String, ArrayList<String>> entry : entries)
		{
			String type = entry.getKey();
			ArrayList<String> values = entry.getValue();
			
			System.out.println(type +" "+values);
		}
	}

}
