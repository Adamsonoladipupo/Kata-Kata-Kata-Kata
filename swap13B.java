public class swap13{
	public static void main(String[] args){
		int[] numbers = {4,7,2,9,12};
		int[] storeNumbers = numbers;
		for (int a = 0; a < numbers.length-1; a++){
			for (int b = 0; b < numbers.length-a-1; b++){
				if (numbers[b] > numbers[b+1]){
					int tempVar = numbers[b];
					numbers[b] = numbers[b+1];
					numbers[b+1] = tempVar;
				}
			}
		}
		int[] new_numbers = new int[numbers.length];
		for (int count = 0; count < new_numbers.length; count++){
			new_numbers[count] = numbers[count];
		}

		for (int count = 0; count < numbers.length; count++){

			if (numbers[count] == storeNumbers[count]){
				System.out.println("Match");
			}else{System.out.println("Unmatch");}
		}

/*
		for (int count = 0; count < new_numbers.length; count++){
			System.out.print(new_numbers[count]+",");
		}
*/
		
		
	}
}