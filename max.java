import java.io.*;
class max
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader d1=new BufferedReader(isr);
		int arr[]=new int[10];
		System.out.println("Enter the elements");
		for(int i=0;i<10;i++)	
			arr[i]=Integer.parseInt(d1.readLine());
		int max=arr[0];
		int i=1;
		while(i<10)
		{
			if(max<arr[i])
				max=arr[i];
			i++;
		}
		System.out.println("Max is "+max);
	}
}