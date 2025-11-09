import java.util.Scanner;

public class QuickTest{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);


		System.out.print("Enter a number: ");
		int userInput = inputCollector.nextInt();
	


		try{
			userInput = -5;
		}
		catch(Exception e){
			System.out.println("Something went wrong.");
		}
		
		
	}
}