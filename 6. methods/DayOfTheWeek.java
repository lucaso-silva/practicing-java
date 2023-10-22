 import java.util.Scanner;
 
 public class DayOfTheWeek
 {
	public static void main(String args[])
   { 
    //(wip)Need input validation..
    int day, month, year;
    String dayOfWeek = "", monthName = "";

    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a day: ");
    day = in.nextInt();

    System.out.println("Enter a month: ");
    month = in.nextInt();

    System.out.println("Enter a year: ");
    year = in.nextInt();

    dayOfWeek = dayWeek(zelAlgorithm(day, month, year));
    monthName = monthName(month);
   
    System.out.println(monthName + " " + day + ", " + year + " is on " + dayOfWeek);
    
  }

  public static int zelAlgorithm(int day, int month, int year){
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
  
  public static String dayWeek(int day)
  {
    String dayWeek = "";
    
    switch(day) {
      case 0:
        dayWeek = "Sunday";
        break;
      case 1:
        dayWeek = "Monday";
        break;
      case 2:
        dayWeek = "Tuesday";
        break;
      case 3:
        dayWeek = "Wednesday";
        break;
      case 4:
        dayWeek = "Thursday";
        break;
      case 5:
        dayWeek = "Friday";
        break;
      case 6:
        dayWeek = "Saturday";
        break;
    }
    return dayWeek;
  }
  
  public static String monthName(int month)
  {
    String monthName = "";
    
    switch(month){
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
      case 12:
        monthName = "December";
        break;
    }
    return monthName;
  } 
 
 }
 
 