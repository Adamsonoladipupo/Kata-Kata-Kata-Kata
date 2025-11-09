/*
Question:
Write a function that takes in two numbers and multiply and return the result without using * symbol Use TDD, ensure you write test for possible edge cases
*/
import java.util.Scanner;

public class MultiplyNumbersWithoutUsingX{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNumber = inputCollector.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = inputCollector.nextInt();

		int multiply = MultiplicationFunction.isMultiply(firstNumber, secondNumber);
		System.out.println("Answer is : " + multiply);
		
	}
}