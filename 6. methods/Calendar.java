import java.util.Scanner;

public class Calendar
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int firstDayMonth, month, year;
		
		do {
			System.out.println("Please enter a number for the month (1 to 12):");
			month = in.nextInt();
			
		} while((month < 1) || (month > 12));
		
		do {
			System.out.println("Please enter a number for the year (greater than 1852):");
			year = in.nextInt();
			
		} while(year < 1852);

		in.close();
		
		firstDayMonth = zelAlgorithm(1, month, year);
		
		
		System.out.println("\n\t" + monthName(month) + ", " + year);
		System.out.println("---------------------------------");
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		
		printCalendar(firstDayMonth, month, year);
		
	}
	
	public static String monthName(int month)
	{
		String monthName = "";
		
		switch(month) {
			case 1: 
				monthName = "January";
				break;
			case 2: 
				monthName = "February";
				break;
			case 3: 
				monthName = "March";
				break;
			case 4: 
				monthName = "April";
				break;
			case 5: 
				monthName = "May";
				break;
			case 6: 
				monthName = "June";
				break;
			case 7: 
				monthName = "July";
				break;
			case 8: 
				monthName = "August";
				break;
			case 9: 
				monthName = "September";
				break;
			case 10: 
				monthName = "October";
				break;
			case 11: 
				monthName = "November";
				break;
			default:
				monthName = "December";
				break;
		}
		return monthName;
	}
	
	public static int zelAlgorithm(int day, int month, int year)
	{
	  int numOfDay, startMonth, startYear, leapFactor;

		if(month < 3){
			startMonth = 0;
			startYear = year - 1;
		} else {
			startMonth = (int)(0.4 * month + 2.3);
			startYear = year;
		}

		leapFactor = (startYear/4)-(startYear/100) + (startYear/400);

		numOfDay = ((365 * year + 31 * (month - 1)+ day + leapFactor - startMonth) - 1 ) % 7;

		return numOfDay;
	}

	public static boolean isLeapYear(int year)
	{
		boolean leap = false;

		if(year % 4 == 0) {
		  
			if(year % 100 == 0) {
				leap = false;
			}
		  
			if((year % 100 == 0) && (year % 400 == 0)) { 
				leap = true;
			}
			
		} else {
		  leap = false;
		}

		return leap;
	}

	public static void printCalendar(int day, int month, int year) 
	{
		int numberOfDays;

		if((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
			numberOfDays = 31;
		
		} else if((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			numberOfDays = 30;
		
		} else if((month == 2) && (isLeapYear(year))) {
			numberOfDays = 29;
		
		} else {
			numberOfDays = 28;
		}

		for (int space = day; space > 0; space--) {
			System.out.print("     ");
		}

		for(int i = 1; i <= numberOfDays; i++) {
			System.out.print(i + "  ");
		}
	}
}