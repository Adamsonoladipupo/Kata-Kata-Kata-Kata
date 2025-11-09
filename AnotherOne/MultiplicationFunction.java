public class MultiplicationFunction{

	public static int isMultiply(int num1, int num2){

		int result = 0;

		if (num1 == )
		if (num1 < 0 || num2 < 0){
			num1 = Math.abs(num1);
			num2 = Math.abs(num2);

			for (int count = 0; count < num2; count++){
				result += num1;
			}
			result = -(result);
		}

		else {
			for (int count = 0; count < num2; count++){
				result += num1;
			}
		}
		return result;
	}
}