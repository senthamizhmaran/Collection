package org.login;

import java.util.*;

public class list {
	public static void main(String[] args) {
	List li = new LinkedList();
		li.add(10);
		li.add(100);
		li.add("java");
		li.add("senthamizh");
		li.add(9578127917l);
		li.add(34658.473484378f);
		li.add(5.5);
		li.add(false);
		li.add(200);
		System.out.println(li);
		// to find the size of the element
		int size = li.size();
		System.out.println(size);
		// to get the value
		Object object = li.get(4);
		System.out.println(object);
		// to remove the value
		li.remove(5);
		System.out.println(li);
		// to add the value
		li.add(3, 400);
		System.out.println(li);
		// to replace the value
		li.set(3, 500);
		System.out.println(li);
		//to check the particular value present or not
		boolean contains = li.contains(9578127917l);
		System.out.println(contains);
		//to check the index position of particular value
		int indexOf = li.indexOf(200);
		System.out.println(indexOf);
		// to check the last index 
		int lastIndexOf = li.lastIndexOf(200);
		System.out.println(lastIndexOf);
		System.out.println("&@&@&@&@&@&@&@ for loop  &@&@&@&@&@&@&@&");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
		}
		for (Object x : li) {
			System.out.println(x);
			
		}
		
		
		
		


}
}