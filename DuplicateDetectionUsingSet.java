package Collections.Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateDetectionUsingSet {

	public static <T> Boolean detect(List <T>ls) {
		
		//flag to indicate existance of duplicates
		Boolean dupsExist=true;
		// Declare a set
		Set <T>s= new HashSet<>();
		//Add all the list elements
		s.addAll(ls);
		// no compare the size of set and list
		// if set size is smaller compared to list size it means duplicates exists
		// Why ?, Because that difference in size is because set removed that
		// duplicate value
		if(s.size()==ls.size()) {dupsExist=false;}
		return dupsExist;
	}
	
	public static void main(String[] args) {
	List <Integer>al = new ArrayList<>();
	for(int i=0;i<10;i++) {
		al.add(i+1); 
	}
	Boolean dupsExist= detect(al);
	System.out.println(dupsExist);
	al.add(10);
	dupsExist=detect(al);
	System.out.println(dupsExist);
	
}
}
