package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedListExamples {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>(3);
		strList.add("before");
		strList.add("corona");
		//strList.add(null);
		strList.add("mango");
		strList.add("banana");
		strList.add("apple");
		strList.add("oppo");
	//	strList.add("  ");
		//strList.add(null);
		strList.add(1,"one");
		
		System.out.println(strList);
		
		List <Object> objList = new LinkedList<Object>();	
		objList.add("bow");
		objList.add("arrow");
		objList.add(100);
		objList.add(100.887);
		objList.add(null);
		objList.add(100.887);
		objList.add(null);
		
		objList.add(new Integer(111));
		objList.add(new Double(455.8774));
		System.out.println(objList);
		
		List <String> listWords = new LinkedList <>();
		listWords.add("meow");
		listWords.add("amba");
		listWords.add("kokoko");
		listWords.add("naayi");
		
		listWords.set(0, "hey");
		listWords.remove(3);
		objList.addAll(0, listWords);
		System.out.println(objList);
		
		for (Object element : objList)
		{
			System.out.println(element);
		}
		
		Iterator itr = strList.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		objList.forEach(s -> System.out.println(s));
		
		strList.sort(null);
		
		System.out.println(strList);
		
		//copy elements form one list to another
		
		List src = new ArrayList();
		List dest= new ArrayList();
		
		src.add("Mango");
		src.add("banana");
		
		dest.add("100");
		dest.add("200");
		dest.add("800");
		
		System.out.println(dest);
		Collections.copy(dest, src);
		
		System.out.println(dest);
		
		Collections.shuffle(dest);
		
		System.out.println(dest);
		
		//sublist
		
		List<Integer> main = new ArrayList<Integer>();
		main.add(1);
		main.add(2);
		main.add(3);
		main.add(4);
		
		List sub= main.subList(0, 2);
		
		System.out.println(sub);
		
		//Array to list
		List <String> words = Arrays.asList("aa","ss","dd");
		System.out.println(words);
		//list to array
		Integer []intArr = main.toArray(new Integer[0]);
		
		for (int i=0;i<intArr.length; i++)
			System.out.println(intArr[i]);
		
		
		
	}

}
