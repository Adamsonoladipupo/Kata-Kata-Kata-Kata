import java.util.Arrays;

public class rearrangeInAcsending{
	public static void main(String[] args){
		int[] sampleList = {1,100,3,6,7,0,2,1};
		System.out.print(reOrder(sampleList));
	}
	public static String reOrder(int[] input){
		for (int a = 0; a< input.length-1; a++){
			for (int b = 0; b < input.length-1-a; b++){
				if (input[b] > input[b+1]){
					int temp = input[b];
					input[b] = input[b+1];
					input[b+1] = temp;
				}
			}
		}
 
		return Arrays.toString(input);
	}
}