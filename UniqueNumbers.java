import java.util.*;

public class UniqueNumbers{
	public static void main(String[] args){
		int[] numbers = {1,2,2,3,4,3,5,6,5,6,7,8,8,1,9};
		ArrayList <Integer> newList = new ArrayList <Integer>();
		for (int number : numbers ){
			if (!newList.contains(number)){
				newList.add(number);
			}
		}
		System.out.print(newList);
	}
}