package GoldmanSachs;

import java.util.Arrays;

public class Day_1_Prob_3 {

	public static void main(String[] args) {
		String [] daysOfWeek = {"Monday","Tuesday","Wednessday","Thursday","Friday","Saturday","Sunday"};
		//should output {"Mon","Tues","Wed","Thu","Fri","Sat","Sun"}
		
		String [] result = new String [daysOfWeek.length];
		
		for(int i=0; i<daysOfWeek.length;i++) {
//			StringBuilder str =new StringBuilder();
//			String day=daysOfWeek[i];
//			char[] section= day.toCharArray();
//			str.append(section[0]);
//			str.append(section[1]);
//			str.append(section[2]);
			result[i] = daysOfWeek[i].substring(0,3);
			
		}
		System.out.println(Arrays.toString(result));
	}

}
