import java.io.*;
class FiboRecu
{	static int x=1;
	public static void fibo(long i,long j,int n)
	{
		x++;
		if(x==n)
			return;
		System.out.print("  "+(i+j));
		fibo(j,i+j,n);

	}
	public static void main(String[] args)throws IOException {
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of n");
		int n=Integer.parseInt(buff.readLine());
		long i=0;
		long j=1;
		System.out.print(i+" "+j);
		FiboRecu.fibo(i,j,n);
	}
}