import java.util.ArrayList;

public class ArrayListOne{
	public static void main(String[] args){
		ArrayList <String> newList = new ArrayList <String>();
		ArrayList <Integer> anotherList = new ArrayList <Integer>();
		anotherList.add(1);
		anotherList.add(5);
		anotherList.add(0);
		anotherList.add(3);
		anotherList.add(2);

		newList.add("boy");
		newList.add("girl");
		System.out.println("First value: " + getFirstValue(newList));
		System.out.println(swapValues(newList));

		System.out.println(swapValues(newList));
		
	}

	public static String getFirstValue(ArrayList<String> input){
		String firstElement = input.get(0);
		return firstElement;
	}

	public static ArrayList<String> swapValues(ArrayList<String> input){

		String tempVar = input.get(0);
		input.set(0, input.get(1));
		input.set(1, tempVar);

		return input;
	}


}