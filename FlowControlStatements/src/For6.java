
public class For6 {
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.print("\n");
			}
		}
		else
			System.out.println("Please enter an integer number");
	}
}
