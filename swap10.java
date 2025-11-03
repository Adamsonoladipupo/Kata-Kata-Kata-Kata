public class swap10{
	public static void main(String[] args){
		int[] numbers = {5,1,4,2,8};
		int numberOfSwaps = 0;
		for (int a = 0; a < numbers.length-1; a++){
			for (int b = 0; b < numbers.length-a-1; b++){
				if (numbers[b] > numbers[b+1]){
					int tempV = numbers[b];
					numbers[b] = numbers[b+1];
					numberOfSwaps++;
					numbers[b+1] = tempV;
					numberOfSwaps++;
				}
			}
		}
		for (int count = 0; count < numbers.length; count++){
			System.out.print(numbers[count]);
		}System.out.printf("\nnumber of swaps: %d", numberOfSwaps);
	}
}