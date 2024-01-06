
public class Palindrome {
	public static boolean palindromeCheck(String Word) {
		StringBuilder outBuilder = new StringBuilder();
		char [] myArray=Word.toCharArray();
		
		for(int i = myArray.length-1; i>=0; i--) {
			outBuilder.append(myArray[i]);
		}
		
		if(Word.equals(outBuilder.toString())) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(palindromeCheck("Oshadi"));

	}

}
