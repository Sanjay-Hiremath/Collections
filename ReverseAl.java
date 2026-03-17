import java.util.ArrayList;

public class ReverseAl {
    public static void main(String[] args) {
        ArrayList <Integer> al1 = new ArrayList<>();
        ArrayList <Integer> al2 = new ArrayList<>();
        for(int i=0;i<5;i++){
            al1.add(i+1);
        }
        for(int i=0;i<6;i++){
            al2.add(i+1);
        }

        rev(al1);
        rev(al2);
        System.out.println(al1);
        System.out.println(al2);

    }
        static public void rev(ArrayList al){
            int temp=0;
            int index=al.size()-1;
            int i=0;
            while(i<=index/2){
                temp=(Integer)al.get(i);// here al.get(int) returns an wrapper class Integer object which is downcasted to int.  
                al.set(i,al.get(al.size()-i-1));// we can also declare temp as Integer, That is also fine.
                al.set(al.size()-1-i,temp);
                i++;
            }


        }

}
