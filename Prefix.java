import java.util.*;
public class Prefix {
	public static void main(String ar[])throws Exception
	{
	Scanner sc=new Scanner(System.in);
	int n,j;
	n=sc.nextInt();
	String a[]=new String[100];
	for(int i=0;i<n;i++)
	{
	a[i]=sc.next();
	}
	String lon = null,check;
	if(a.length>0)
	lon=a[0];
	for(int i=1;i<a.length;i++)
	{
	check=a[i];
	for(j=0;j<Math.min(lon.length(),a[i].length());j++)
	{
	if(lon.charAt(j)!=check.charAt(j))
	break;
	}
	lon=a[i].substring(0,j);
	}
	System.out.println("long prefix is:"+lon);
	}
	}

