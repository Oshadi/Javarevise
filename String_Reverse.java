
public class String_Reverse {
	
	public static String ReverseStr(String str) {
		if(str == null) {
			throw new IllegalArgumentException("String is null");
			
		}
		StringBuilder ret = new StringBuilder();
		
		char [] arr = str.toCharArray();
		
		for(int i=arr.length-1; i>=0;i--) {
			ret.append(arr[i]);
		}
		return ret.toString();	
		
	}

	public static void main(String[] args) {
		System.out.println(ReverseStr(""));

	}

}
