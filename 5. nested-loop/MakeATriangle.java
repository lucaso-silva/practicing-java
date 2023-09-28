public class MakeATriangle
{
	public static void main(String[] args)
	{
		int num = 5;
		
		for(int row = 1; row <= num; row++)
		{
			for(int col = 0; col < row; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}