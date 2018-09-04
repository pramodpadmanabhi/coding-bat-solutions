/* Program to print a pyramid pattern 

	*
	**
	***
	****
	*****
	******
*/


class Pattern{
	public static void main(String[] args)
	{
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}		
}