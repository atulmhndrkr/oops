import java.io.*;
class HarmonicSum
{
	public static void main(String args[])throws IOException
	{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of n");
		double n=Integer.parseInt(buff.readLine());
		double i=1;
		double sum=0.0;
		if(n==0)
		{
			System.err.println("DIVISON BY ZERO ERROR");
			return;
		}
		while(i<=n)
		{
			sum+=(1/i);
			i++;
		}
		System.out.println("====OUTPUT=====\nSum is="+sum);
	}
}