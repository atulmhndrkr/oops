import java.io.*;
class WordData
{
	int num;
	String data;
	public WordData()
	{
		num=0;
		data="";
	}
	public int getnum()
	{
		return num;
	}
	public String getdata()
	{
		return data;
	}
	public void setnum()
	{
		this.num++;
	}
	public void setdata(String s)
	{
		this.data=s;
	}
}
public class Passage
{
	public static void main(String args[])throws IOException
	{
		String pas;
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("========ENTER PASSAGE========");
		pas=buff.readLine();
		pas=pas.trim();
		String[] words=pas.split(" ");
		int k=words.length;
		//System.out.println("sdda");
		WordData[] chk=new WordData[100];
		for(int i=0;i<100;i++)
			chk[i]=new WordData();
		//WordData[] chk=new WordData[100];
		int j=0,flag;
		for(String word:words)
		{	word=word.trim();
			flag=1;
			for(k=0;k<j;k++)
			{
				if((chk[k].getdata()).compareTo(word)==0)
				{
					chk[k].setnum();
					flag=-1;
					break;
				}
			}
			if(flag==1)
			{
				chk[j].setdata(word);
				chk[j].setnum();
				j++;
			}
		}
		System.out.println("====OUTPUT=====");
		for(k=0;k<j;k++)
		{
			System.out.println(chk[k].getdata()+"\t"+chk[k].getnum());
		}
	}
}
