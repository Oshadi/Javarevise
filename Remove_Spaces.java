
public class Remove_Spaces {
	public static String removeSpace (String word) {
		return word.replaceAll("\\s", "");
	}

	public static void main(String[] args) {
		System.out.println(removeSpace("sssh   bjbcv"));

	}

}
