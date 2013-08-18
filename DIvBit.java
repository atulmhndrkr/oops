import java.io.*;
class DivBit
{
	public static void main(String args[])throws IOException
	{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of n");
		int n=Integer.parseInt(buff.readLine());
		n=n>>1;
		System.out.println(n);
	}
}