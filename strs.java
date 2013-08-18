import java.io.*;
import java.lang.*;
class strs
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader d1=new BufferedReader(isr);
		String str;
		System.out.println("Enter the string");
		str=d1.readLine();
		int i=0;
		int j=0;
		while(i<str.length())
		{
			if(str.charAt(i)==' ')
			{
				System.out.println(str.substring(j,i)+"\nLength is "+str.substring(j,i).length());
				j=i+1;
			}
			i++;
			if(i==str.length())
				System.out.println(str.substring(j,i)+"\nLength is "+str.substring(j,i).length());

		}
	}
}