public class swap13{
	public static void main(String[] args){
		int[] numbers = {4,7,2,9,12};
		for (int a = 0; a < numbers.length-1; a++){
			for (int b = 0; b < numbers.length-a-1; b++){
				if (numbers[b] < numbers[b+1]){
					int tempVar = numbers[b];
					numbers[b] = numbers[b+1];
					numbers[b+1] = tempVar;
				}
			}
		}
		for (int count = 0; count < numbers.length; count++){
			System.out.print(numbers[count] + ",");
		}

		
	}
}