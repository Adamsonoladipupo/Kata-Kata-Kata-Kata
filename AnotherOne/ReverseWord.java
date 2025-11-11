import java.util.*;

public class ReverseWord{
	public static void main(String[] args){
		String sentence = "Python is amazing ";
		String word = ""; String newWord = "";

		for (int count = 0; count < sentence.length(); count++){
			char letter = sentence.charAt(count);
			word += letter;
			if (letter == ' '){
				for (int counter = word.length()-1; counter >=0; counter--){
					char letterTwo = word.charAt(counter);
					newWord += letterTwo;
				}
				word = "";
				
			}
			
			
		}
		System.out.println(newWord);

		
	}
}