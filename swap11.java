import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class swap11{
	public static void main(String[] args){
		//ArrayList <Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		ArrayList <Integer> numbers = new ArrayList<Integer>(List.of(5,6,7,8));
		System.out.println(numbers);
		int indx1 = 1; int indx3 = 3;
		int tempVar = numbers.get(indx1);
		numbers.set(indx1, indx3) ;
		numbers.set(indx3, tempVar);
		System.out.print(numbers);

		
	}
}