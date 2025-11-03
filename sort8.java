import java.util.Arrays;
import java.util.Collections;

public class sort8{
	public static void main(String[] args){
		int[] array = {3,1,2,4,5};
		Arrays.sort(array, Collections.reverseOrder());
		System.out.print(Arrays.toString(array));


		
	}
}