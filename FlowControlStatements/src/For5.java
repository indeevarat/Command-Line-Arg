
public class For5 {
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int r=0;
		int sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
