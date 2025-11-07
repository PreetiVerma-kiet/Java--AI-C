package example.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(1);
		ll1.add(2);
		ll1.add(1);
		ll1.add(2);
		
		ll1.addFirst(0);
		System.out.println(ll1);

	}

}
