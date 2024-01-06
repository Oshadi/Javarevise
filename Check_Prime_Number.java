
public class Check_Prime_Number {
	
	public static boolean checkPrime(int num) {
		if(num==1 || num==0) {
			return false;
		}
		if(num % 2==0) {
			return true;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPrime(49));

	}

}
