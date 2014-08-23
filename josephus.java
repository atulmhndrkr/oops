import java.io.*;
class josephus
{

public static int eliminate(int n)
{
	if(n==1)
		return 1;
	else if(n%2==0)
		return (2*eliminate(n/2)-1);
	else
		return (2*eliminate(n/2)+1);
}
public static void main(String[] args)
{
	int n=1;
	int c;
	InputStreamReader d1=new InputStreamReader(System.in);
	BufferedReader buff=new BufferedReader(d1); 
	try
	{
		System.out.println("Enter the number of elements");
		n=Integer.parseInt(buff.readLine());
	}
	catch(Exception e)
	{}
	c=eliminate(n);
	System.out.println(c);	
}

}