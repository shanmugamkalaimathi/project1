package Asses;
import java.util.Scanner;
public class ClosesZero {
		public static void main(String[] args) 
		{
			System.out.println("enter the length ");
			Scanner scan=new Scanner(System.in);
			int len=scan.nextInt();
			int []a=new int[len];
			for(int i=0;i<len;i++)
			{
				a[i]=scan.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]+a[j]==0)
					{
						System.out.println(a[i]+"closest to zero"+a[j]);
					}
				}
			}
			
	}
}
