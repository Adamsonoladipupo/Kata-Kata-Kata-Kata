public class swap5{
	public static void main(String[] args){
		int[] array = {1,2,3,4,5};
		int tempVar = array[0];
		array[0] = array[4];
		array[4] = tempVar;

		for (int count =0; count < array.length; count++){System.out.print(array[count]);}

		
	}
}