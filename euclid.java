import java.io.*;
class euclid
{
	public int gcd(int a,int b)
	{
		int r=a%b;
		if(r==0)
			return b;
		return gcd(b,r);
	}
	public static void main(String[] args)
	{
		int a=0,b=0;
		InputStreamReader d1=new InputStreamReader(System.in);
		BufferedReader buff=new BufferedReader(d1); 
		euclid e=new euclid();
		try
		{
			System.out.println("Enter the numbers");
			a=Integer.parseInt(buff.readLine());
			b=Integer.parseInt(buff.readLine());
		}
		catch(Exception ex){}
		int r;
		if(a>b)
			r=e.gcd(a,b);
		else
			r=e.gcd(b,a);
		System.out.println("The GCD is "+r);
	}
}