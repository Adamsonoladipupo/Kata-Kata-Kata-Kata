public class isReverse{
	public static void main(String[] args){
		String word = "abcdef";
		String newWord = "";
		for (int count = word.length()-1; count >= 0; count--){
			//System.out.print(count);
			char letter = word.charAt(count);
			newWord += letter;
		}
		System.out.print(newWord);
	}
}