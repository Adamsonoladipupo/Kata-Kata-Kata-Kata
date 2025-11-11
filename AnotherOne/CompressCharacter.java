public class CompressCharacter{
	public static void main(String[] args){
		String word = "aaabbccccdaa"; String newWord = ""; int number = 0;
		char letter = word.charAt(0);
		//System.out.print(letter);
		for (int count = 0; count < word.length(); count++){
			letter = word.charAt(count);
			if (letter =='a'){
				number++; 
			}
			System.out.println(letter);
			newWord += letter;
			newWord += number;
		}
		//System.out.print(newWord);
	}
}