import java.util.ArrayList;
import java.util.LinkedList;

class PerformanceAnalysisOfAl_LL{

public static void main (String[] args){

ArrayList <Integer> al= new ArrayList<>();
LinkedList<Integer> ll= new LinkedList<>();


long t1=System.nanoTime();
for(int i=0;i<100000;i++){al.add(i+1);}
long t2=System.nanoTime();
System.out.println("Time complexity of arraylist ");
System.out.println((t2-t1));

t1=0;
t2=0;
System.out.println();


t1= System.nanoTime();
for(int i=0;i<100000;i++){ll.add(i+1);}
t2=System.nanoTime();
System.out.println("Time complexity of linked list");
System.out.println(t2-t1); 

}
}