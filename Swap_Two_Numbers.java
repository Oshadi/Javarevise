
public class Swap_Two_Numbers {
	
	

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Before a: "+a+" b: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After a: "+a+" b: "+b);
	}

}
