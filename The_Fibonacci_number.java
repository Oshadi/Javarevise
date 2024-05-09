
public class The_Fibonacci_number {
	static int count =2;
	public static void fibo(int first, int second) {
		
	
		//using recurssion
		if(count<=19) {
			int next = first + second;
			System.out.println(next);
			first = second;
			second = next;
			count += 1;
			fibo(first, second);
		}else {
			return;
		}
	}
	
	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		//using for loop 
		System.out.println(first);
		System.out.println(second);
		
		for(int i=0; i<18; i++) {
			int next = second + first;
			System.out.println(next);
			first = second;
			second = next;
		}
		
		System.out.println("=======================");
		int firstR = 1;
		int secondR = 0;
		//using recurssion
		System.out.println(firstR);
		System.out.println(secondR);
		fibo(firstR, secondR);
		

	}

}
