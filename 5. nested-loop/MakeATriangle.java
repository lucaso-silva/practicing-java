import java.util.Scanner;

public class MakeATriangle
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("Enter the side of the Triangle");
		num = in.nextInt();
		
		if(num <= 0) {
			System.out.println("ERROR:Enter a positive value");
			return;
		
		} else {
			for(int row = 1; row <= num; row++)
			{
				char ch = 'A';
				for(int col = 0; col < row; col++)
				{
					System.out.print(ch++);
				}
				System.out.println();
			}
		}		
	}
}