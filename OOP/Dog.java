public class Dog{
	public String name;
	public String breed;
	public int age;

	//constructor
	public Dog(String nameInput, String breedInput, int ageInput){
		name = nameInput;
		breed = breedInput;
		age = ageInput;
	}

	// methods and function
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}

	public void setName(String userInput){
		name = userInput;
	}
	public void setBreed(String userInput){
		breed = userInput;
	}
	public void setAge(int userInput){
		age = userInput;
	}
}