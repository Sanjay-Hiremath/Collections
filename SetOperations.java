package Collections.Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetOperations  extends HashSet{
	
public static void main(String[] args) {
	Set <Integer> s1= new HashSet<>();
	Set <Integer> s2= new HashSet<>();
	
	
	
//	Set Union
	SetDefault(s1, s2);
	s1.addAll(s2); // Union
	System.out.println(s1);
	
	
//	 Set Intersection
	SetDefault(s1, s2);
	s1.retainAll(s2);// Intersection
	System.out.println(s1);

//	Set A- Set B
	
	SetDefault(s1, s2);
	s1.removeAll(s2);
	System.out.println(s1);
	
 }

public static void SetDefault(Set <Integer>s1,Set <Integer>s2) {
	ArrayList <Integer>ls1= new ArrayList<>();
	ArrayList <Integer>ls2= new ArrayList<>();
//	refresh 
	s1.clear(); //
	s2.clear();
	ls1.add(1);
	ls1.add(2);
	ls1.add(3);
	ls1.add(4);
	ls1.add(5);
	
	ls2.add(4);
	ls2.add(5);
	ls2.add(6);
	ls2.add(7);
	ls2.add(8);
	
	s1.addAll(ls1);
	s2.addAll(ls2);
}
}
