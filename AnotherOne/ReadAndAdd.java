import java.util.Scanner;

public class ReadAndAdd{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		int result = ReadAndAddFunction.ReadAndAdd(userInput);
		System.out.print(result);
	}
}