class Search
{
	int BinSearch(int a[],int l,int u,int x)
	{	int m=(u+l)/2;
		if(l>=u)
		{	if(a[l]==x)
				return l;
			return -1;
		}
		
		if(x==a[m])
			return m;
		else if(a[m]>x)
			BinSearch(a,l,m-1,x);
		else
			BinSearch(a,m+1,u,x);
		return -1;
	}
}