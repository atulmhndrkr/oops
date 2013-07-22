import java.io.*;
class prime
{
	public static void main(String args[])throws IOException
	{
		int num,flag=-1;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader d1=new BufferedReader(isr);
		System.out.println("Enter the number");		
		num=Integer.parseInt(d1.readLine());
		int i=2;
		while(i<=Math.sqrt(num))
		{
			if(num%i==0)
			{
				System.out.println("Number is composite");
				flag=1;
				break;
			}
			i++;
		}
		if(flag==-1)
			System.out.println("Number is prime");
	}
}