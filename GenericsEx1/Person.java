package CollectionsGenerics;

public class Person {

	String name;
	
	public Person(String name) {
	this.name=name;	
	}
	public void display() {
		System.out.println(name);
	}
	@Override
	public String toString(){
		return name;
	}
}
