public class swap6{
	public static void main(String[] args){
		int[] array = {1,2,3,4};
		int tempVar = array[0];
		array[0] = array[1];
		array[1] = tempVar;
		
		tempVar = array[2];
		array[2] = array[3];
		array[3] = tempVar;
		
		

		for (int count =0; count < array.length; count++){System.out.print(array[count]);}


		
	}
}