import java.util.Scanner;

public class GetExtension{
	public static String getExtension(String input){
		String extension = "";
		String newExtension = "";
		for (int count = input.length()-1; count >= 0; count--){
			char eachCharacter = input.charAt(count);
			extension += eachCharacter;
			if (eachCharacter == '.'){
				break;
			}
		}
		for (int count = extension.length()-2; count >= 0 ; count--){
			char eachCharacter = extension.charAt(count);
			newExtension += eachCharacter;
		}
		return newExtension;
	}

	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		System.out.print("Enter file name with it extension: ");
		String file = inputCollector.nextLine();
		System.out.print("File extension is: " + getExtension(file));
	}
}