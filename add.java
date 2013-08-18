import java.io.*;
class add
{
	public static void main(String args[])throws IOException
	{
		int row1,row2,col1,col2,i,j;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader d1=new BufferedReader(isr);
		System.out.println("Enter rows and columns of matrix 1");		
		row1=Integer.parseInt(d1.readLine());
		col1=Integer.parseInt(d1.readLine());
		System.out.println("Enter rows and columns of matrix 2");
		row2=Integer.parseInt(d1.readLine());
		col2=Integer.parseInt(d1.readLine());
		if((row1!=row2)||(col1!=col2))
		{
			System.out.println("Matrix unmatched");
		}
		else{
			int[][] arr1=new int[row1][col1];
		int[][] arr2=new int[row2][col2];
		System.out.println("Enter elements of matrix1");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				arr1[i][j]=Integer.parseInt(d1.readLine());
			}
		}
		System.out.println("Enter elements of matrix2");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				arr2[i][j]=Integer.parseInt(d1.readLine());
			}
		}
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.print(arr1[i][j]+arr2[i][j]+"  ");
			}
			System.out.println("");
		}
	}}
}