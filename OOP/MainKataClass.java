public class MainKataClass{
	public static void main(String[] args){
		Dog dogOne = new Dog("DefaultName", "Defualt Breed",0);

		System.out.println(dogOne.getName() + " " + dogOne.getBreed() + " " + dogOne.getAge());

		dogOne.setName("Sporty");
		dogOne.setAge(5);
		dogOne.setBreed("Dingo");

		System.out.println(dogOne.getName() + " " + dogOne.getBreed() + " " + dogOne.getAge() + "years");
	}
}
