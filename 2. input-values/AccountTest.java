import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		String name, loginName, instructorName;
		int studentId;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		name = input.next();
		
		System.out.println("Please enter your network login: ");
		loginName = input.next();
		
		System.out.println("Please enter your student ID: ");
		studentId = input.nextInt();
		
		System.out.println("Please enter your instructor name: ");
		instructorName = input.next();
		
		showCourseInfo( instructorName );
		
		System.out.println("My name is " + name + ".");
		
		System.out.println("My student ID is " + studentId + ".");
		System.out.println("My network login name is " + loginName + ".\n");
		
		System.out.println("\t****End of the Sample Code");
	}
	
		public static void showCourseInfo(String inputName)
	{
		System.out.println("\t****Welcome!!!");
		
		System.out.println("\nThis course is Introducing to Java Programming");
		System.out.println("The instructor is: " + inputName + ".");
		
		System.out.println("Have fun!!!\n");
		
		return;
	}
}