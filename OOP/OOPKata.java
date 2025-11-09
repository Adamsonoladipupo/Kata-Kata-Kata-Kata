/*
Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age
*/

class Person{
	String name;
	int age;


	Person(String nameInput, int ageInput){
		this.name = nameInput;
		this.age = ageInput;
	}
	
	public void printStuff(){
		System.out.println("Person name: " + name + " person age " + age );
	}

}
public class OOPKata{
	public static void main(String[] args){
		Person personOne = new Person("Ade", 35);
		Person personTwo = new Person("Bolajoko", 55);



		personOne.printStuff();
		personTwo.printStuff();

	}
}