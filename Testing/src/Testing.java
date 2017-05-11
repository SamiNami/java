import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;


public class Testing {

	
	public static void main(String[] args) {
		
		//  Write a function that takes two words as an argument and returns true if they are anagrams
		//(contain the exact same letters) and false otherwise.
		boolean check = checkIfAnagram("mamma","aammm");
		System.out.println(check);
		
		// Write a method that alternates each letter with a uppercase letter, skips spaces		
		String notDone = "kappa rappara";
		String done = alternateUpperCase(notDone);
		System.out.println(done);
		
		// reverse words in a string
		String words = "Hi my name is kappa";
		String reverse = reverseWords(words);
		System.out.println(reverse);
		
		/* Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible
		 *  for every character of str1 to every character of str2.
		 *  And all occurrences of every character in ‘str1’ map to same character in ‘str2’*/
		
		String st1 = "aab";
		String st2 = "xxy";
		
		
		
	}

	
	
	private static boolean checkIfAnagram(String first,String second){
		
		String [] firstSplit = first.split("");
		String [] secondSplit = second.split("");
		
		Arrays.sort(firstSplit);
		Arrays.sort(secondSplit);
		
		first = String.join("",firstSplit);
		second = String.join("",secondSplit);
		
		
		return first.equals(second);
	}
	
	private static String alternateUpperCase(String string){
		
		String returnString = "";
		boolean check = true;
		
		for(int i = 0; i < string.length(); i++){
			char take = string.charAt(i);
			
			if(take != ' '){
				
				if(check){
					take = Character.toUpperCase(take);
					check = false;
					returnString += take;
				}
				else{
					returnString += take;
					check = true;
				}
				
				
			}
			else{
				returnString += take;
			}
			
			
		}
		
		return returnString;
	}
	
	
	private static String reverseWords(String string){
		
		String [] words = string.split(" ");
		String returnString = "";
		
		for(int i = 1;i <= words.length; i++){
			returnString += words[words.length -i];
			
			if(i != words.length){
				returnString += " ";
			}
			
		}
		
		return returnString;
		
	}
	
	
	
	
	
}
