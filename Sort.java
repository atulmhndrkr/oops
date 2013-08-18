class Sort
{
	void SelSort(int a[])
	{
		int min,k,j;
		for(int i=0;i<a.length;i++)
		{	min=a[i];
			k=i;
			for (j=i+1;j<a.length;j++)
				if(a[j]<min)
				{	min=a[j];
					k=j;
				}
			if(k!=i)
			{
				a[k]=a[i];
				a[i]=min;
			}
		}
	}
}