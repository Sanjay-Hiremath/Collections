package Collectionss.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListProblems {

public static void main(String[] args) {

	ArrayList<Integer> al = new ArrayList<Integer>();
	refreshList(al);

	//1)	iterate over a list
	Iterator <Integer> it= al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println();

	//	2) insert at first
	refreshList(al);
	al.addFirst(10);
	System.out.println("Added at first"+al);

	// 3) retrieve element by index
	refreshList(al);
	System.out.println("element at index1 "+al.get(1));
	
//	4) update arraylist element
	refreshList(al);
	al.set(5, null);
	
//	5) remove 3rd element
	refreshList(al);
	al.remove(2);
	System.out.println("Removed element at 3rd index"+"="+al);
//	6) search element in arraylist
	refreshList(al);
	System.out.println("contains 4??:"+al.contains(4));
	System.out.println("Contains 100"+al.contains(100));
// 7) sort arraylist
	refreshList(al);
	al.sort(null);
	System.out.println("sorted arraylist using ArrayList.sort() method"+al);
// 8) copy arraylist
	refreshList(al);
	ArrayList<Integer> newList=new ArrayList<>(al);
	System.out.println("New copied arraylist is "+newList);
	System.out.println("Original arraylist reference "+System.identityHashCode(al));
	System.out.println("new arraylist reference"+System.identityHashCode(newList));
		// copy using Collections.copy()
	refreshList(al);
		newList.clear();
		for(int i=10;i<20;i++) {
			newList.add(i+1);
		}
		Collections.copy(al,newList);
		System.out.println("Copied using Collections.copy()");
	//	9) Shuffle arraylist 
	refreshList(al);
	Set <Integer>s = new HashSet<>(al);
	al.clear();
	al.addAll(s);
	System.out.println("Shuffeled arraylist using hashset"+al);
	refreshList(al);
	Collections.shuffle(al);
	System.out.println(" Shuffled the list using Collection.shuffle()"+al);
//10) Reverse Arraylist
	Collections.reverse(al);
	System.out.println("Reversal using Collections.reverse()"+al);
	//	reversal using ListIterator 
	refreshList(al);
	ArrayList <Integer>revArray= new ArrayList<Integer>();
	refreshList(al);
	ListIterator <Integer>li= al.listIterator(al.size());
	while(li.hasPrevious()) {
		Integer temp=(Integer)li.previous();
		revArray.add(temp);
		
	}al.clear();
	al.addAll(revArray);
	System.out.println(" Reversed list using ListIterator"+al);
//Reverse arraylist
		refreshList(al);
		revArray.clear();
		// manual reversal:
			ListIterator<Integer>lii= al.listIterator(al.size());
			while(lii.hasPrevious()) {
				Integer temp=lii.previous();
				revArray.add(temp);
			}
			al.clear();
			al.addAll(revArray);
			System.out.println("Reversed manually using ListIterator"+al);
		//
			refreshList(al);
		//
		//	Automatic reversal
			Collections.reverse(al);
			System.out.println("Reversed using Collections.reverse()"+al);
			

			refreshList(al);
// 12 )slicing the list using sublist()
			System.out.println(al.subList(0, 5));
///			
			
			refreshList(al);
			refreshList(newList);
			newList.remove(4);
///			
// 13) compare two arraylist
			// manual comparision
			System.out.println(newList);
			System.out.println(al);
			for(Integer i:al) 
				if(newList.contains(i)) {
					System.out.print ("yes" +" ");
				}else {
					System.out.println("no");
			}
// 14) Swap two elements in in arraylist
			al.clone()
			
}

public static void refreshList(ArrayList<Integer> al) {
	al.clear();
	for(int i=0;i<10;i++) {
		al.add(i+1);
	}	
}

}
