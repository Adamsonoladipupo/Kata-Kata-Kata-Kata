import java.util.*;

public class ArrayOne{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		int[] numberArray = new int[10];
		for (int count = 0; count < 10; count++){
			System.out.printf("Enter number %d: ", count+1);
			int userInput = inputCollector.nextInt();
			numberArray[count] = userInput;
		}

		System.out.print(Arrays.toString(numberArray));
		
		
	}
}