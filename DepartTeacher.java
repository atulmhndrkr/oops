import java.io.*;
interface College{
	
	void setdata(String i);
	
	String getdata();
}
class Teacher
{
	String name;
	String quali;
	String colg="";
}
class Department extends Teacher implements College
{
	int dept_no;
	String dept_name;
	public void setdata(String i)
	{
		colg=i;
	}
	public String getdata()
	{
		return colg;
	}
}
public class DepartTeacher
{
	
	public static void main(String[] args)throws IOException {Department d=new Department();
	BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter name");
	d.name=buff.readLine();
	System.out.println("Enter qualifications");
	d.quali=buff.readLine();
	System.out.println("Enter department number");
	d.dept_no=Integer.parseInt(buff.readLine());
	System.out.println("Enter depatment name");
	d.dept_name=buff.readLine();
	System.out.println("Enter college");
	d.setdata(buff.readLine());
	System.out.println("======OUTPUT========");
	System.out.println("NAME "+d.name);
	System.out.println("QUALIFICATIONS "+d.quali);
	System.out.println("DEPARTMENT NUMBER "+d.dept_no);
	System.out.println("DEPARTMENT NAME "+d.dept_name);
	System.out.println("COLLEGE "+d.colg);
}	
} 