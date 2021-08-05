package Exercise1;


public class Exercise1 {
	
	public static void main(String[] args) {
		 
		int init=1900;
		int end = 2001;
		int sundays = 0;
		long totalDays=1;
 
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
 
		for(int year = init; year < end; year++){
			for(int month = 0; month < months.length; month++){
				if(year > 1900){	
					if(totalDays % 7 == 0){
						sundays++;
						//System.out.println(year + " => " + (month));
					}
				}
				int days=0;
 
				if(month != 1 || year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)){
					days = months[month];
				}
				else{
					days = 29;
					//System.out.println(year + " => Bisiesto");
				}
				totalDays = totalDays + days;
			}
		}
		System.out.println("Total Days: "+ sundays);
		
	}
}