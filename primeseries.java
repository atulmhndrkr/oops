import java.io.*;
class primeseries
{
	public static void main(String args[])
	{
		int flag=-1;
		int j=1;
		int i=2;
		while(j<=100)
		{
			i=2;
			flag=-1;
			while(i<=Math.sqrt(j))
			{
				if(j%i==0)
				{	flag=1;
					break;
				}
				i++;
			}
			if(flag==-1)
				System.out.println(j);
			j++;
		}
	}
}