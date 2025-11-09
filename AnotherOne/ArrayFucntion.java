import java.util.*;

public class ArrayFucntion{
	public static ArrayList<Integer> getElementsOnEvenIndex(int[] input){
		ArrayList <Integer> newList = new ArrayList<Integer>();
		int number = 0;
		for (int count = 0; count < input.length; count++){
			if (count % 2 == 0){
				number = input[count];
				newList.add(number);
			}
		}
		return newList;
	}

	public static ArrayList<Integer> getElementsOnOddIndex(int[] input){
		ArrayList <Integer> newList = new ArrayList<Integer>();
		int number = 0;
		for (int count = 0; count < input.length; count++){
			if (count % 2 == 1){
				number = input[count];
				newList.add(number);
			}
		}
		return newList;
	}

	public static int getSumOfElementsInEvenIndex(int[] input){
		ArrayList <Integer> newList = new ArrayList<Integer>();
		int number = 0; int sumOfNumbers = 0;
		for (int count = 0; count < input.length; count++){
			if (count % 2 == 0){
				number = input[count];
				sumOfNumbers += number;
			}
		}
		return sumOfNumbers;
	}

	public static int getSumOfElementsInOddIndex(int[] input){
		ArrayList <Integer> newList = new ArrayList<Integer>();
		int number = 0; int sumOfNumbers = 0;
		for (int count = 0; count < input.length; count++){
			if (count % 2 == 1){
				number = input[count];
				sumOfNumbers += number;
			}
		}
		return sumOfNumbers;
	}

	public static void main(String[] args){
		int[] numberArray = {1,4,7,2,6,9,3,0,1,12};
		System.out.println("get elements on even index " + getElementsOnEvenIndex(numberArray));
		System.out.println("Sum of elements in even index " + getSumOfElementsInEvenIndex(numberArray));

		System.out.println("get elements on odd index " + getElementsOnOddIndex(numberArray));
		System.out.println("Sum of elements in odd index " + getSumOfElementsInOddIndex(numberArray));


	}
}