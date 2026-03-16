package Collectionss.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DifferentIteratorsDemo {
public static void main(String[] args) {
	
	ArrayList <Integer > al= new ArrayList<>();
	LinkedList<Integer> ll= new LinkedList<>();	
	int n=5;
	int i=0;
	while(n!=0) {
		al.add(++i);
		n--;
	}
	
	n=5;
	i=0;
	while(n!=0)
	{
		ll.add(++i);
		n--;
	}
	
//	iteration using for-each, Iterator and ListIterator
	
//	iteration using for-each
	System.out.println("iteration using for-each");
	for(Integer in:al) {
		System.out.println(in);
	}
	
//	iteration using Iterator
	System.out.println("iteration using Iterator");
	Iterator <Integer>it= al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
//	iteration using ListIterator
	System.out.println("iteration using ListIterator");
	ListIterator <Integer> li = al.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	
//	Bonus
	ListIterator <Integer>bonus= al.listIterator(al.size());
//Changing the elements of arraylist in descending order of 100 starting from backward
// hehehe descending order from backward means ascending order from front
	int change=100;
	while(bonus.hasPrevious()) {
		bonus.previous();
		bonus.set(change--);
	}
	System.out.println("Syso change ");
	for(Integer inn:al) {
		System.out.println(inn);
	}
}
}
