package CollectionsGenerics;

import java.util.ArrayList;

class ObjectRepository<T>{
	private ArrayList <T> repository;
	
	ObjectRepository(){
		repository = new ArrayList<T>();
	}
	
	/*
	 * adds a single object to the repo
	 * */
	public void add(T object) {
		repository.add(object);
	}
	
	/*
	 * adds a collection of objects to the repo 
	 */
	
	public void addAll(ArrayList<T> persons) {
		repository.addAll(persons);
	}
	
	/*
	 * returns a collection of objects 
	 */
	public ArrayList <T> getAll() {
		return repository;
	}
	/*
	 * removes an object from the repository
	 */
	public void remove(T object) {		
	
		repository.remove(object);	
		
	}
	
	public void displayrepo() {
		for(T object: repository) {
			/*
			 * One way to display the person name of the person object is to downcaste the object from object to person and display
			 */
//			((Person)object).display();
			/*
			 * Another is to override the toString method in Person class and rewrite it to return the person name 
			 * instead of fully classified hexadecimal code followed by class name 
			 * and directly display object which will return the string of person name
			 */
			System.out.println(object);
			
		}
	}
	
}

public class GenericRepo {
public static void main(String[] args) {
	ObjectRepository <Person>r1= new ObjectRepository<>();
	ObjectRepository <Car> r2= new ObjectRepository();	
	Person p1= new Person("Sanjay");
	Person p2= new Person("Sanjana");
	Person p3= new Person("Akshata");
	Person p4= new Person("Abhishek");
	Person p5= new Person("Aryan");
	
	Car c1= new Car("Mahindra Be6");
	Car c2= new Car("Mahindra Xev9e");
	Car c3= new Car("Tata Avinya");
	Car c4= new Car("Tata Sierra ");
	Car c5= new Car("Tata Harrier ");
	
	//
	
	ArrayList <Person>persons= new ArrayList<Person>();
	persons.add(p1);
	persons.add(p2);
	persons.add(p3);
	persons.add(p4);
	persons.add(p5);
	r1.addAll(persons);
	r1.displayrepo();

	// 
System.out.println();
	// 
	
	ArrayList<Car> cars= new ArrayList<>();
	cars.add(c1);
	cars.add(c2);
	cars.add(c3);
	cars.add(c4);
	cars.add(c5);
	r2.addAll(cars);
	r2.displayrepo();

	// 
}
}
