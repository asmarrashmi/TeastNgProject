package Hashmap;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
		String inputString= "RashmiRarh";
		char[] strArray = inputString.toCharArray();
		for( char c : strArray) {
			//HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
			
			if (obj.containsKey(c)) {
				obj.put(c,obj.get(c)+1);
			}
			else {
				obj.put(c, 1);
			}
		}
		
		System.out.println(obj.entrySet());

		
		
	}

}
