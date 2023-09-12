public class AccountTest
{
	public static void main(String[] args)
	{
		String name = "Lucas Oliveira",
			   loginName = "loliveira10",
			   instructorName = "Hengameh Hamavand";
		int studentId = 10012345;
		
		showCourseInfo( instructorName );
		
		System.out.println("My name is " + name + ".");
		
		System.out.println("My student ID is " +studentId);
		System.out.println("My network login name is " + studentId + ".\n");
		
		System.out.println("\t****End of the Sample Code");
	}
	
	public static void showCourseInfo(String inputName)
	{
		System.out.println("This course is CPSC 1150");
		System.out.println("The instructor is: " + inputName + ".");
		
		System.out.println("Have fun!!!\n");
		
		return;
	}
}