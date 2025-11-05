import java.util.*;

public class GeneratePrimeNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		int count = 0;
		int number = 2;

		while (userInput != count){
			int checkForFactor = 0;
			int numberSqr = (int)Math.sqrt(number);
			for (int counter = 1; counter <= numberSqr; counter++){
				if ( number % counter == 0 ){
					checkForFactor++;
				}
			}
			if (checkForFactor < 2){
				System.out.print(number + " ");
				count++;
			}
			number++;
		}

	
	}
}