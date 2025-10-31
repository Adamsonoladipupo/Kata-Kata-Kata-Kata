public class CheckPerfectSquare{
	
	public static void main(String[] args){
	
		System.out.print(checkPerfectSquare(144));
	
	}

	public static boolean checkPerfectSquare(int input){

		int oddNumber = 1;
		int count = 0;
		while (input != 0 && count <= input){
			input = input - oddNumber;
			oddNumber += 2;
			count++;
		}
		Boolean check = (input == 0); 
		return check;
	}

}