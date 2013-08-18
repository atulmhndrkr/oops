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
	void Merge(int a[],int low,int mid,int high)
	{
		int b[]=new int[high];
		int h=low;
		int i=low;
		int j=mid+1;
		while((h<=mid)&&(j<=high))
		{
			if(a[h]<a[j])
			{
				b[i]=a[h];
				h++;
			}
			else
			{
				b[i]=a[j];
				j++;
			}
			i++;
		}
		if(h>mid)
		{
			for(int k=j;k<=high;k++)
				b[i++]=a[k];
		}
		else
		{
			for(int k=h;k<=mid;k++)
				b[i++]=a[k];
		}
		for(int k=low;k<=high;k++)
			a[i]=b[i];
	}

	void MergeSort(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			MergeSort(a,low,mid);
			MergeSort(a,mid,high);
			Merge(a,low,mid,high);
		}
	}
}