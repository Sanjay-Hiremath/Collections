import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
class removeAllOdd{

public static void remove(ArrayList<Integer> ls){

ArrayList<Integer> al = ls;
ArrayList<Integer> al1=new ArrayList<>(al);
ArrayList<Integer> al2=new ArrayList<>(al);
ArrayList<Integer> al3= new ArrayList<>(al);  
ArrayList <Integer> rl= new ArrayList<>();
Iterator<Integer> it=al.iterator();
System.out.println("original arraylist");
System.out.println(al);

//////////////////////////////////////
// removal using for-each
for(Integer i: al){
if(i%2!=0){ rl.add(i);}
}
al1.removeAll(rl);
System.out.println("removal using for each");
System.out.println(al1);
rl.clear();

/////////////////////////////////////
// removal using iterator
while(it.hasNext()){
Integer temp= it.next();
if(temp%2!=0){ rl.add(temp); }
}
al2.removeAll(rl);
System.out.println("removal using iterator");
System.out.println(al2);
rl.clear();

//////////////////////////////////
// removal using for
for(int ii=0;ii<al.size();ii++){
if(al.get(ii)%2!=0){rl.add(al.get(ii));}
}
al3.removeAll(rl);
System.out.println("removal using for loop");
System.out.println(al3);
rl.clear();

}

// Main
public static void main(String [] args){

ArrayList <Integer>al = new ArrayList<>();
for(int i=0;i<10;i++){al.add(i+1);}

remove(al);

}
}