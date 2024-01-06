
public class Check_Vowels_In_a_String {
	
	public static boolean checkVowel(String word) {
		return word.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) {
		System.out.println(checkVowel("hgfds"));

	}

}
