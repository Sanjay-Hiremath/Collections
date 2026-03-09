package CollectionsGenerics;

public class Car {

	String name;
	
	public Car(String name) {
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
