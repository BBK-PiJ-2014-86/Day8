package Day8;

public class Person {
	
	int age;
	String name;
	Person next;
	
	public Person (int age, String name ){
		this.age = age;
		this.name=name;
		next = null;
	}
	
	public void setNext (Person person) {
		next = person;
	}
}
