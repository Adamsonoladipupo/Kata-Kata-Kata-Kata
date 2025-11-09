import java.util.*;

public class LoopThroughWords{
	public static void main(String[] args){
		String[] list = {"salt", "bread", "oil", "gold", "banana", "melon"};
		ArrayList <String> newList = new ArrayList <String>();
		String word = "";
		int count = 0;
		for (String item : list){
			word = item;
			for(count = 0; count < word.length(); count++){
			}
			int numberOfLetters = count;
			if (numberOfLetters % 2 == 0){
				newList.add(word);
			}
		}
		System.out.println(newList);

		
	}
}