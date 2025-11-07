package example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>(50);
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30,20,10));
		list3.add(90);
		list2.add(1);
		list2.add(2);
		list2.add(60);
		list1.add(1);
		list1.add(8);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(2,10);
		list1.addAll(list2);
		
		Collections.sort(list1);
		System.out.println(list1.isEmpty());
		//list1.removeIf(x->x%2==0);
		
		//list1.remove(Integer.valueOf(2));
		list1.set(2, 50);
		System.out.println(list1.containsAll(list3));
System.out.println(list1);
//for(int i=0;i<list1.size();i++) {
	//System.out.println(list1.get(i));
//}
	/*
	 * Iterator<Integer> it = list1.iterator(); while(it.hasNext()) {
	 * System.out.println(it.next()); }
	 */

 for(int x:list1) { System.out.println(x); } 
 
	}

}
