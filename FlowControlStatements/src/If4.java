
public class If4 {
	public static void main(String[] args) 
	{
		String str=args[0];
		String str1=args[1];
		char a=str.charAt(0);
		char b=str1.charAt(0);
		if(a<b)
			System.out.println(a+","+b);
		else
			System.out.println(b+","+a);
	}
}
