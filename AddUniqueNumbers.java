import java.util.*;

public class AddUniqueNumbers{
	public static void main(String[] args){
		int[] numbers = {1,2,3,2};
		ArrayList <Integer> newList = new ArrayList <Integer>();
		ArrayList <Integer> newList2 = new ArrayList <Integer>();
		int count = 0;
		int tempVar = 0;

		for (int number : numbers){
			if(!newList.contains(number)){
				newList.add(number);
			}
			else {
				numbers.remove(number);
				
			}
		}
		System.out.print(newList);
		System.out.print(numbers);
	}
}