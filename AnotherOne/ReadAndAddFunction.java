public class ReadAndAddFunction{
	public static int ReadAndAdd(int input){
		int sumOfNumber = 0;
		int getDigit= 0;
		while ( input != 0){
			getDigit = input%10; 
			sumOfNumber += getDigit; 
			input = input / 10;
		}
		return sumOfNumber;

	}
}