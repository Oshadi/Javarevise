
public class Fibonacci {
	public static void FibonacciSer(int count) {
		int a=0;
		int b=1;
		int c=1;
		System.out.print(a+" "+b);
		for(int i=2;i<count;++i) 
		 {    
		  c=a+b;    
		  System.out.print(" "+c);    
		  a=b;    
		  b=c;    
		 }     
		
		
		
	}
	public static void main(String[] args) {
		FibonacciSer(10);

	}

}
