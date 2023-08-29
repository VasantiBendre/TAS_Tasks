import java.util.*;
public class MultiplicationTable 
{
	private int a,n;
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer whose table you want to find out:");
		a=sc.nextInt();
		
		System.out.println("Enter number for n times of multiplication:");
		n=sc.nextInt();
	}
	
	public void table()
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print("%d * %d = %d\n"+a+i+a+"*"+i);
		}
	}
	
	public static void main(String args[])
	{
		MultiplicationTable mt = new MultiplicationTable();
		mt.accept();
		mt.table();
	}
}