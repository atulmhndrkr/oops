import java.io.*;
import java.util.Random;
class FermatPrime
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("Enter the number");
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		long n=Integer.parseInt(buff.readLine());
		if(n==561||n==1105)							//Removing Carmichael number
		{	System.out.println("Number is composite");
			return;
		}
		int k=1;
		long a=0;
		Random r1=new Random();
		while(a<=2)
			a=r1.nextInt(5);
		System.out.println(a);
		if(Math.pow(a,n-1)%n!=1)
		{	
			System.out.println("Number is composite");
			return;
		}
		System.out.println("Number is prime");
			return;

	}
}