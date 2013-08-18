/*Code to print the value of series entered*/


import java.io.*;
class horner
{
	void ho(int arr[],int k,int n,int s,int x)
	{	if(k==n)
		{	s+=arr[k];
			System.out.println(s);
			return;
		}
		else
		{
			s=(s+arr[k])*x;
			ho(arr,k+1,n,s,x);
		}

	}
	public static void main(String args[])throws IOException
	{	
		//int n;
		//System.out.println("Enter the number of literals");
		BufferedReader d1=new BufferedReader(new InputStreamReader(System.in));
		
		//int arr[]=new int[n];
		System.out.println("Enter the Constants in decreasing order of x");
		String str[]=(d1.readLine()).trim().split(" ");
		int arr[]=new int[str.length];
		int j=0;
		for(String i:str)
		{
				arr[j++]=Integer.parseInt(i);
		}
		horner p=new horner();j=1;
		System.out.println("Enter value of x");
		int x=Integer.parseInt(d1.readLine());
		//for(int i:arr)
		System.out.println("=======OUTPUT=========");	p.ho(arr,0,arr.length-1,0,x);


	}
	
}