package GoldmanSachs;
/*
 * Leet Code
 * 1507. Reformat Date
 * 
 * 
 * Given a date string in the form Day Month Year, where:

Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
Year is in the range [1900, 2100].
Convert the date string to the format YYYY-MM-DD, where:

YYYY denotes the 4 digit year.
MM denotes the 2 digit month.
DD denotes the 2 digit day.
 

Example 1:

Input: date = "20th Oct 2052"
Output: "2052-10-20"
Example 2:

Input: date = "6th Jun 1933"
Output: "1933-06-06"
Example 3:

Input: date = "26th May 1960"
Output: "1960-05-26"

 * 
 * 
 * 
 * 
 * */
public class Day_3_Prob_2_Goldman {
	
	public static String reformatDate(String date) {
        String Day ="";
        String Month ="";
        String Year ="";
        String [] MonthAr ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String [] dateAr = date.split(" ");
        Day = dateAr[0].substring(0, dateAr[0].length() - 2);
        Month = dateAr[1];
        Year = dateAr[2];
        if (Integer.valueOf(Day)<10){ 
           Day ="0"+Day;
        }
         for(int i=0; i<MonthAr.length; i++){
             if (MonthAr[i].equals(Month)  && i<9){                 
                Month = "0"+String.valueOf(i+1);                
             }else if(MonthAr[i].equals(Month) && i==9){
                 Month = String.valueOf(i+1);
             }
             else if(MonthAr[i].equals(Month) && i>=10){                 
                 Month=String.valueOf(i+1);                
             }
         }
     return Year+"-"+Month+"-"+Day;
    }
	public static void main(String[] args) {
		System.out.println(reformatDate("26th May 1960"));

	}

}
