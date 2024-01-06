import java.util.ArrayList;
import java.util.List;

public class Check_Odd_Numbers {
	
	public static boolean ChecOdd(List<Integer> myList) {
		
		for(int i =0; i<myList.size(); i++) {
			if(myList.get(i)%2 ==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> newList= new ArrayList <Integer> ();
		newList.add(2);
		newList.add(2);
		newList.add(2);
		
		System.out.println(ChecOdd(newList));

	}

}
