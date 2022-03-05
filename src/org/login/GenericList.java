package org.login;

import java.util.*;

public class GenericList {
	public static void main(String[] args) {
	List <Integer> li=new LinkedList<Integer>();
	// to add the value
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	li.add(10);
	System.out.println(li);
	//to fin the size of the list
	int size = li.size();
	System.out.println(size);
	// to find the particular value
	Integer index = li.get(4);
	System.out.println(index);
	//to remove the particular value
	li.remove(3);
	System.out.println(li);
	//to add the value
    li.add(3, 40);
    System.out.println(li);
    // to replace the value
    li.set(3, 400);
    System.out.println(li);
    // to the the particular value present or not
    boolean contains = li.contains(400);
    System.out.println(contains);
    //to find the index value
    int indexOf = li.indexOf(10);
    System.out.println(indexOf);
    int lastIndexOf = li.lastIndexOf(10);
    System.out.println(lastIndexOf);
    System.out.println("@@@@@@@@forloop@@@@@@@@");
    for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
    for (Integer x : li) {
System.out.println(x);		
	}
    
    List <Integer> l2=new LinkedList<Integer>();
    System.out.println(l2);
    //to check l2 is empty or not
    boolean empty = l2.isEmpty();
    System.out.println(empty);
    // to add all the values from the list 2 from listli
    l2.addAll(li);
    System.out.println(l2);
    // to add extra values
    l2.add(100);
    l2.add(200);
    l2.add(300);
    l2.add(400);
    System.out.println(l2);
    // to remove the common value
    l2.removeAll(li);
    System.out.println(li);
    //to cut the common value
    l2.retainAll(li);
    System.out.println(l2);
    
    
    
    
    
    
    
    
    
    
}
}
