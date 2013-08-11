/*Code to print the permutations of elemnts entered*/


import java.io.*;
class perm
{
	void permu(int arr[],int k,int n)
	{	int t;
		if(k==n)
		{	for(int i:arr)
				System.out.print(i+" ");
			//System.out.print("\b\b");
			System.out.println("");

		}
		else
			for(int j=k;j<=n;j++)
			{
				t=arr[k];
				arr[k]=arr[j];
				arr[j]=t;
				permu(arr,k+1,n);
				t=arr[k];
				arr[k]=arr[j];
				arr[j]=t;

			}
	}
	public static void main(String args[])throws IOException
	{	
		//int n;
		//System.out.println("Enter the number of literals");
		BufferedReader d1=new BufferedReader(new InputStreamReader(System.in));
		//n=d1.readInt();
		//int arr[]=new int[n];
		System.out.println("Enter the literals");
		String str[]=(d1.readLine()).trim().split(" ");
		int arr[]=new int[str.length];
		int j=0;
		for(String i:str)
		{
				arr[j++]=Integer.parseInt(i);
		}
		perm p=new perm();j=1;
		//for(int i:arr)
		System.out.println("=======OUTPUT=========");	p.permu(arr,0,arr.length-1);


	}
	
}